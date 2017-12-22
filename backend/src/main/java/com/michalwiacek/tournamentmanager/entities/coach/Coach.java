package com.michalwiacek.tournamentmanager.entities.coach;

import com.michalwiacek.tournamentmanager.entities.person.Person;
import com.michalwiacek.tournamentmanager.entities.club.Club;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Coach extends Person {

    @ManyToOne
    private Club club;
}
