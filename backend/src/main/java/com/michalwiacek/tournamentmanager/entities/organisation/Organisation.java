package com.michalwiacek.tournamentmanager.entities.organisation;

import com.michalwiacek.tournamentmanager.entities.tournament.Tournament;
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
    private List<Tournament> tournaments;
}
