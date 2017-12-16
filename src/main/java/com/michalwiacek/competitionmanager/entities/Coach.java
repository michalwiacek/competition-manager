package com.michalwiacek.competitionmanager.entities;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Coach extends Person {

    private Club club;
}
