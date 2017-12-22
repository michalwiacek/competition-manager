package com.michalwiacek.tournamentmanager.entities.athlete;

import com.michalwiacek.tournamentmanager.entities.club.Club;
import com.michalwiacek.tournamentmanager.entities.person.Person;
import com.michalwiacek.tournamentmanager.entities.sport.Sport;
import com.michalwiacek.tournamentmanager.entities.weightCategory.WeightCategory;
import com.michalwiacek.tournamentmanager.entities.ageCategory.AgeCategory;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Athlete extends Person {

    @ManyToOne
    private Club club;
    private Double weight;
    @ManyToOne
    private WeightCategory weightCategory;
    @ManyToOne
    private AgeCategory ageCategory;
    @ManyToOne
    private Sport sport;
}
