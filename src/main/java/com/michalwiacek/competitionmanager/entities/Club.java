package com.michalwiacek.competitionmanager.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Club {

    @Id
    private long clubId;
    private String name;
    private String adress;
}
