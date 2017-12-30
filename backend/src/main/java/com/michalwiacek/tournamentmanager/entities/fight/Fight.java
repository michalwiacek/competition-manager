package com.michalwiacek.tournamentmanager.entities.fight;

import com.michalwiacek.tournamentmanager.entities.athlete.Athlete;
import lombok.Data;

import javax.persistence.*;

/**
 * Created by mic on 22.12.2017.
 */
@Entity
@Data
public class Fight {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Athlete white, blue;
}
