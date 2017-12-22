package com.michalwiacek.tournamentmanager.entities.tournament;

import com.michalwiacek.tournamentmanager.entities.weightCategory.WeightCategory;
import com.michalwiacek.tournamentmanager.entities.ageCategory.AgeCategory;
import com.michalwiacek.tournamentmanager.entities.athlete.Athlete;
import com.michalwiacek.tournamentmanager.entities.club.Club;
import com.michalwiacek.tournamentmanager.entities.organisation.Organisation;
import com.michalwiacek.tournamentmanager.entities.sport.Sport;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class Tournament {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate date;
    private LocalDate enrollmentEnd;
    private int athleteLimit;
    private int matAmount;
    private String name;
    @ManyToOne
    private Sport sport;
    @ManyToOne
    private Organisation organiser;
    private String city;
    @ManyToMany
    private List<Club> clubList;
    @ManyToMany
    private List<Athlete> athleteList;
    @ManyToMany
    private List<AgeCategory> ageCategories;
    @ManyToMany
    private List<WeightCategory> weightCategories;

}
