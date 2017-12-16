package com.michalwiacek.competitionmanager.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
class Coach extends Person {

    @ManyToOne
    private Club club;
}
