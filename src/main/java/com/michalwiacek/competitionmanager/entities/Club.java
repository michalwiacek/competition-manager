package com.michalwiacek.competitionmanager.entities;

import lombok.Data;
import lombok.Generated;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
class Club {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long clubId;
    private String name;
    private String adress;
}
