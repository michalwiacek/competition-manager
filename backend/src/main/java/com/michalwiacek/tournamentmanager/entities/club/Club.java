package com.michalwiacek.tournamentmanager.entities.club;

import com.michalwiacek.tournamentmanager.entities.coach.Coach;
import com.michalwiacek.tournamentmanager.entities.organisation.Organisation;
import com.michalwiacek.tournamentmanager.entities.athlete.Athlete;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class Club extends Organisation {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "club")
    private Set<Athlete> athletes;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "club")
    private Set<Coach> coaches;
}
