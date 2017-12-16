package com.michalwiacek.competitionmanager.entities;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Data
public class Person {

    @Id
    private long personId;
    private String firstName;
    private String lastName;

}
