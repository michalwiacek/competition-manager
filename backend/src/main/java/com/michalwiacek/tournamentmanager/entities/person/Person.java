package com.michalwiacek.tournamentmanager.entities.person;

import lombok.Data;

import javax.persistence.*;

@MappedSuperclass
@Data
public abstract class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String surname;
    private Integer age;
    @Enumerated(value = EnumType.STRING)
    private Sex sex;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
