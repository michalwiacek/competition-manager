package com.michalwiacek.competitionmanager.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class Club extends Organisation{

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "club")
    private Set<Athlete> athletes;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "club")
    private Set<Coach> coaches;
}
