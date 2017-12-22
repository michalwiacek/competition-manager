package com.michalwiacek.tournamentmanager.entities.fightingGroup;

import com.michalwiacek.tournamentmanager.entities.weightCategory.WeightCategory;
import com.michalwiacek.tournamentmanager.entities.ageCategory.AgeCategory;
import com.michalwiacek.tournamentmanager.entities.athlete.Athlete;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * Created by mic on 22.12.2017.
 */
@Entity
@Data
public class FightingGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private AgeCategory ageCategory;
    @ManyToOne
    private WeightCategory weightCategory;
    @ManyToMany
    private List<Athlete> athleteList;
}
