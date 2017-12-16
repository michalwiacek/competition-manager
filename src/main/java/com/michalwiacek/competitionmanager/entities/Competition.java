package com.michalwiacek.competitionmanager.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Competition {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long competitionId;
    private Date date;
    private Date enrollmentEnd;
    private int athleteLimit;
    private int matAmount;
    private String organiser;

    private List<Club> clubList;

}
