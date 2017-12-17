package com.michalwiacek.competitionmanager.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Data
public class Discipline {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "discipline", cascade = CascadeType.ALL, orphanRemoval = true)
    Set<AgeCategory> ageCategories;
    @OneToMany(mappedBy = "discipline")
    Set<WeightCategory> weightCategoryListMap;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "discipline")
    Set<Athlete> athleteList;
    @OneToMany
    @JoinColumn(name = "discipline_competition_id")
    List<Competition> competitions;
}
