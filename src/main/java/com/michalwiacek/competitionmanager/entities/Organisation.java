package com.michalwiacek.competitionmanager.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Organisation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String adress;
    @ManyToMany
    private List<Competition> competitions;
}