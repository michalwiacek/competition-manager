package com.michalwiacek.competitionmanager.entities;

import lombok.Data;

import javax.persistence.Entity;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Competition {
    private Date date;
    private Date enrollmentEnd;
    private int athleteLimit;
    private int matAmount;
    private String organiser;

    private List<Club> clubList;

}
