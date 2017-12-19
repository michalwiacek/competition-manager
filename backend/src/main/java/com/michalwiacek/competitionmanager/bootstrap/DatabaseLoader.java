package com.michalwiacek.competitionmanager.bootstrap;

import com.michalwiacek.competitionmanager.domain.*;
import com.michalwiacek.competitionmanager.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final AthleteRepository athleteRepository;
    private final CoachRepository coachRepository;
    private final ClubRepository clubRepository;
    private final DisciplineRepository disciplineRepository;
    private final AgeCategoryRepository ageCategoryRepository;
    private final WeightCategoryRepository weightCategoryRepository;


    @Autowired
    public DatabaseLoader(
            AthleteRepository athleteRepository,
            CoachRepository coachRepository,
            ClubRepository clubRepository,
            DisciplineRepository disciplineRepository,
            AgeCategoryRepository ageCategoryRepository,
            WeightCategoryRepository weightCategoryRepository) {
        this.athleteRepository = athleteRepository;
        this.coachRepository = coachRepository;
        this.clubRepository = clubRepository;
        this.disciplineRepository = disciplineRepository;
        this.ageCategoryRepository = ageCategoryRepository;
        this.weightCategoryRepository = weightCategoryRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        WeightCategory m81 = new WeightCategory();
        m81.setName("m81");
        m81.setSex(Sex.MALE);
        m81.setMaxWeight(81);
        m81.setMinWeight(73);


        AgeCategory senior = new AgeCategory();
        senior.setName("senior");
        senior.setMinAge(23);
        senior.setMaxAge(99);

        Discipline judo = new Discipline();
        judo.setName("judo");
        disciplineRepository.save(judo);
        senior.setDiscipline(judo);
        m81.setDiscipline(judo);
        weightCategoryRepository.save(m81);
        ageCategoryRepository.save(senior);
        Club kontra = new Club();
        kontra.setName("UKS Judo Kontra");
        clubRepository.save(kontra);

        Athlete michal = new Athlete();
        michal.setName("Michał");
        michal.setSurname("Wiącek");
        michal.setClub(kontra);
        michal.setWeight((double) 91);
        michal.setSex(Sex.MALE);
        michal.setAge(27);

        Athlete marcin = new Athlete();
        marcin.setName("Marcin");
        marcin.setSurname("Wiącek");
        marcin.setClub(kontra);
        marcin.setWeight((double) 51);
        marcin.setSex(Sex.MALE);
        marcin.setAge(32);

        Athlete sebek = new Athlete();
        sebek.setName("Sebastian");
        sebek.setSurname("Wiącek");
        sebek.setClub(kontra);
        sebek.setWeight((double) 86);
        sebek.setSex(Sex.MALE);
        sebek.setAge(42);

        athleteRepository.save(michal);
        athleteRepository.save(marcin);
        athleteRepository.save(sebek);

        Coach zdzis = new Coach();
        zdzis.setName("Zdzisław");
        zdzis.setSurname("Wiącek");

        coachRepository.save(zdzis);
    }
}
