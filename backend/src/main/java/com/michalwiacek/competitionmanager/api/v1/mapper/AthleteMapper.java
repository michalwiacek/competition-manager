package com.michalwiacek.competitionmanager.api.v1.mapper;

import com.michalwiacek.competitionmanager.api.v1.model.AthleteDTO;
import com.michalwiacek.competitionmanager.domain.Athlete;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AthleteMapper {

    AthleteMapper INSTANCE = Mappers.getMapper(AthleteMapper.class);

    AthleteDTO athleteToAthleteDTO(Athlete athlete);

}
