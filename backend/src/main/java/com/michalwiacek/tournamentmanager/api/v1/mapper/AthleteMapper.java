package com.michalwiacek.tournamentmanager.api.v1.mapper;

import com.michalwiacek.tournamentmanager.api.v1.model.AthleteDTO;
import com.michalwiacek.tournamentmanager.entities.athlete.Athlete;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AthleteMapper {

    AthleteMapper INSTANCE = Mappers.getMapper(AthleteMapper.class);

    AthleteDTO athleteToAthleteDTO(Athlete athlete);

}
