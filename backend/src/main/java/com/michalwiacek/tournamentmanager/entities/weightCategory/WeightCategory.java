package com.michalwiacek.tournamentmanager.entities.weightCategory;

import com.michalwiacek.tournamentmanager.entities.person.Sex;
import com.michalwiacek.tournamentmanager.entities.sport.Sport;
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
    @JoinColumn(name = "sport_id")
    private Sport sport;

}
