package com.michalwiacek.competitionmanager.entities;

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
