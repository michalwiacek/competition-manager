package com.michalwiacek.competitionmanager.entities;

import lombok.Data;
import lombok.Generated;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
class Club {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String adress;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "club")
    private Set<Athlete> athletes;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "club")
    private Set<Coach> coaches;
}
