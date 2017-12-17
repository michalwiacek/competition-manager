package com.michalwiacek.competitionmanager.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Athlete extends Person{

    @ManyToOne
    private Club club;
    private Double weight;
    @ManyToOne
    private WeightCategory weightCategory;
    @ManyToOne
    private AgeCategory ageCategory;
    @ManyToOne
    private Discipline discipline;
}
