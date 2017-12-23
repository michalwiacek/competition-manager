package com.michalwiacek.tournamentmanager.entities.sport;

import com.michalwiacek.tournamentmanager.entities.tournament.Tournament;
import com.michalwiacek.tournamentmanager.entities.weightCategory.WeightCategory;
import com.michalwiacek.tournamentmanager.entities.ageCategory.AgeCategory;
import com.michalwiacek.tournamentmanager.entities.athlete.Athlete;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Data
public class Sport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "sport", cascade = CascadeType.ALL, orphanRemoval = true)
    Set<AgeCategory> ageCategories;
    @OneToMany(mappedBy = "sport")
    Set<WeightCategory> weightCategories;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sport")
    Set<Athlete> athleteList;
    @OneToMany
    @JoinColumn(name = "sport_tournament_id")
    List<Tournament> tournaments;
}
