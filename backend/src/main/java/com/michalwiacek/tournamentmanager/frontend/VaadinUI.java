package com.michalwiacek.tournamentmanager.frontend;

import com.michalwiacek.tournamentmanager.entities.athlete.Athlete;
import com.michalwiacek.tournamentmanager.entities.athlete.AthleteRepository;
import com.vaadin.annotations.Theme;
import com.vaadin.server.FontAwesome;
import com.vaadin.server.VaadinRequest;
import com.vaadin.shared.ui.ValueChangeMode;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

@SpringUI(path = "/")
@Theme("valo-default")
public class VaadinUI extends UI {

    private final AthleteRepository repo;

    private final AthleteEditor editor;

    final Grid<Athlete> grid;

    final TextField filter;

    private final Button addNewBtn;

    @Autowired
    public VaadinUI(AthleteRepository repo, AthleteEditor editor) {
        this.repo = repo;
        this.editor = editor;
        this.grid = new Grid<>(Athlete.class);
        this.filter = new TextField();
        this.addNewBtn = new Button("New athlete", FontAwesome.PLUS);
    }

    @Override
    protected void init(VaadinRequest request) {
        // build layout
        HorizontalLayout actions = new HorizontalLayout(filter, addNewBtn);
        VerticalLayout mainLayout = new VerticalLayout(actions, grid, editor);
        setContent(mainLayout);

        grid.setHeight(300, Unit.PIXELS);
        grid.setColumns("id", "name", "surname");

        filter.setPlaceholder("Filter by last name");

        // Hook logic to components

        // Replace listing with filtered content when user changes filter
        filter.setValueChangeMode(ValueChangeMode.LAZY);
        filter.addValueChangeListener(e -> listAthletes(e.getValue()));

        // Connect selected Customer to editor or hide if none is selected
        grid.asSingleSelect().addValueChangeListener(e -> {
            editor.editAthlete(e.getValue());
        });

        // Instantiate and edit new Customer the new button is clicked
        addNewBtn.addClickListener(e -> editor.editAthlete(new Athlete()));

        // Listen changes made by the editor, refresh data from backend
        editor.setChangeHandler(() -> {
            editor.setVisible(false);
            listAthletes(filter.getValue());
        });

        // Initialize listing
        listAthletes(null);
    }

    // tag::listAthletes[]
    void listAthletes(String filterText) {
        if (StringUtils.isEmpty(filterText)) {
            grid.setItems(repo.findAll());
        }
        else {
            grid.setItems(repo.findBySurnameStartsWithIgnoreCase(filterText));
        }
    }
    // end::listAthletes[]

}