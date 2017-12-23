package com.michalwiacek.tournamentmanager.frontend.view;

import com.michalwiacek.tournamentmanager.frontend.sidebar.Sections;
import com.michalwiacek.tournamentmanager.security.User;
import com.michalwiacek.tournamentmanager.security.UserRepository;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Button;
import com.vaadin.ui.Grid;
import com.vaadin.ui.themes.ValoTheme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.vaadin.spring.sidebar.annotation.SideBarItem;
import org.vaadin.spring.sidebar.annotation.VaadinFontIcon;

import javax.annotation.PostConstruct;
import java.util.List;

@Secured({"ROLE_ADMIN"})
@SpringView(name = AdminView1.VIEW_NAME)
@SideBarItem(sectionId = Sections.ADMIN, caption = "AdminView1", order = 1)
@VaadinFontIcon(VaadinIcons.ADD_DOCK)
public class AdminView1 extends AbstractView {

    public static final String VIEW_NAME = "admin_view_1";

    private final UserRepository userRepository;

    private Button newBtn = new Button("New");
    private Button delBtn = new Button("Delete");

    @Autowired
    public AdminView1(UserRepository userRepository) {
        this.userRepository = userRepository;
        setSizeFull();
        setViewHeader("AdminView1", VaadinIcons.ADD_DOCK);

        newBtn.addStyleName(ValoTheme.BUTTON_PRIMARY);
        newBtn.setIcon(VaadinIcons.PLUS_CIRCLE);

        delBtn.addStyleName(ValoTheme.BUTTON_DANGER);
        delBtn.setIcon(VaadinIcons.MINUS_CIRCLE);

        addToolbarComponents(newBtn, delBtn);
    }

    @PostConstruct
    public void init() {
        List<User> users = userRepository.findAll();

        Grid<User> grid = new Grid<>();
        grid.getEditor().setEnabled(true);
        grid.setSizeFull();
        grid.setItems(users);
        grid.addColumn(User::getUsername).setCaption("Name111");
        grid.addColumn(User::getPassword).setCaption("Password");

        addComponent(grid);
        setExpandRatio(grid, 1f);
    }

}