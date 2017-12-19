package com.michalwiacek.competitionmanager.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class AgeCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "discipline_id")
    private Discipline discipline;
    private String name;
    private Integer minAge, maxAge;
}
