package com.michalwiacek.competitionmanager.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Competition {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date date;
    private Date enrollmentEnd;
    private int athleteLimit;
    private int matAmount;

    private String organiser;

    @ManyToMany
    private List<Club> clubList;

}
