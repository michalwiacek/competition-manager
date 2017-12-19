package com.michalwiacek.competitionmanager.domain;

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
    @OneToMany
    private List<Competition> competitions;
}
