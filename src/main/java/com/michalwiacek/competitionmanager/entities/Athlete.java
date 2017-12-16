package com.michalwiacek.competitionmanager.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Athlete extends Person{

    @ManyToOne
    private Club club;
    private Double weight;

    @Enumerated(value = EnumType.STRING)
    private AthleteAgeCategory athleteAgeCategory;

}
