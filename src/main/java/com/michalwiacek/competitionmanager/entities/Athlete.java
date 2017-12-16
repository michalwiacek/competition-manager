package com.michalwiacek.competitionmanager.entities;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Athlete extends Person{
    private Club club;
    private Double weight;
}
