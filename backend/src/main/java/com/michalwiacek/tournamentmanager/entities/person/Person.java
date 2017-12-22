package com.michalwiacek.tournamentmanager.entities.person;

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
    private Integer age;
    @Enumerated(value = EnumType.STRING)
    private Sex sex;
}
