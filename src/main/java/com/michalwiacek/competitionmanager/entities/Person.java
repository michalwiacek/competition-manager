package com.michalwiacek.competitionmanager.entities;

import lombok.Data;

import javax.persistence.*;

@MappedSuperclass
@Data
public abstract class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long personId;
    private String name;
    private String surname;
    @Enumerated(value = EnumType.STRING)
    private Sex sex;
}
