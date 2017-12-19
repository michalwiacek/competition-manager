package com.michalwiacek.competitionmanager.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data

public class WeightCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Integer minWeight, maxWeight;
    private Sex sex;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "discipline_id")
    private Discipline discipline;

}
