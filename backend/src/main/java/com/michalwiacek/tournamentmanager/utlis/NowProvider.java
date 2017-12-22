package com.michalwiacek.tournamentmanager.utlis;

import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.springframework.stereotype.Component;

@Component
public class NowProvider {
    public static final String DEFAULT_ZONE_NAME = "Europe/Warsaw";
    public static final DateTimeZone DEFAULT_ZONE = DateTimeZone.forID(DEFAULT_ZONE_NAME);

    public LocalDateTime now() {
        return LocalDateTime.now(DEFAULT_ZONE);
    }

    public LocalDate today() {
        return now().toLocalDate();
    }
}
