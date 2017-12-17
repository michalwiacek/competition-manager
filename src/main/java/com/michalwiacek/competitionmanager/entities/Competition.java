package com.michalwiacek.competitionmanager.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class Competition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate date;
    private LocalDate enrollmentEnd;
    private int athleteLimit;
    private int matAmount;
    private String name;
    @ManyToOne
    private Discipline discipline;
    @ManyToOne
    private Organisation organiser;
    private String city;
    @ManyToMany
    private List<Club> clubList;
    @ManyToMany
    private List<Athlete> athleteList;

}
