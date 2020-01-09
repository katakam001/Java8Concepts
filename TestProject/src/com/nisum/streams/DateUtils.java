package com.nisum.streams;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.TemporalAdjusters;
import java.time.zone.ZoneRules;

public class DateUtils {

    public static void main(String[] args) {
//        LocalDate localDate = LocalDate.of(2020,01,9);
//        System.out.println(localDate.toString());                //2013-05-15
//        System.out.println(localDate.getDayOfWeek().toString()); //WEDNESDAY
//        System.out.println(localDate.getDayOfMonth());           //15
//        System.out.println(localDate.getDayOfYear());            //135
//        System.out.println(localDate.isLeapYear());
//        System.out.println(localDate.getYear());//false
//        System.out.println(localDate.plusDays(12).toString());   //2013-05-27
//        LocalTime localTime = LocalTime.now();
//        System.out.println(localTime.toString());    //12:20
//        System.out.println(localTime.getHour());     //12
//        System.out.println(localTime.getMinute());   //20
//        System.out.println(localTime.getSecond());   //0
//        System.out.println(localTime.MIDNIGHT);      //00:00
//        System.out.println(localTime.NOON);          //12:00
//        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println(localDateTime.toString());      //2013-05-15T10:01:14.911
//        System.out.println(localDateTime.getDayOfMonth()); //15
//        System.out.println(localDateTime.getHour());       //10
//        System.out.println(localDateTime.getNano());       //911000000
//        OffsetDateTime offsetDateTime = OffsetDateTime.now();
//        System.out.println(offsetDateTime.toString());              //2013-05-15T10:10:37.257+05:30
//
//        offsetDateTime = OffsetDateTime.now(ZoneId.of("+05:30"));
//        System.out.println(offsetDateTime.toString());              //2013-05-15T10:10:37.258+05:30
//
//        offsetDateTime = OffsetDateTime.now(ZoneId.of("-06:30"));
//        System.out.println(offsetDateTime.toString());              //2013-05-14T22:10:37.258-06:30
//
//        ZonedDateTime zonedDateTime =
//                ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
//        System.out.println(zonedDateTime.toString());               //2013-05-15T06:45:45.290+02:00[Europe/Paris]

//        Instant instant = Instant.now();
//        System.out.println(instant.toString());                                 //2013-05-15T05:20:08.145Z
//        System.out.println(instant.plus(Duration.ofMillis(5370)).toString());   //2013-05-15T05:20:13.145Z
//        System.out.println(instant.minus(Duration.ofMillis(5000)).toString());  //2013-05-15T05:20:03.145Z
//        System.out.println(instant.minusSeconds(10).toString());                //2013-05-15T05:19:58.145Z
//        Duration duration = Duration.ofDays(23);
//        System.out.println(duration.toString());     //PT5S
//
//        duration = Duration.ofSeconds(60);
//        System.out.println(duration.toString());     //PT1M
//
//        duration = Duration.ofMinutes(10);
//        System.out.println(duration.toString());     //PT10M
//
//        duration = Duration.ofHours(2);
//        System.out.println(duration.toString());     //PT2H
//
//        duration = Duration.between(Instant.now(), Instant.now().plus(Duration.ofMinutes(10)));
//        System.out.println(duration.toString());  //PT10M

//        Period period = Period.ofDays(6);
//        System.out.println(period.toString());    //P6D
//
//        period = Period.ofMonths(6);
//        System.out.println(period.toString());    //P6M
//
//        period = Period.between(LocalDate.now(),
//                LocalDate.now().plusDays(59));
//        System.out.println(period.toString());   //P1M29D

        //day-of-week to represent, from 1 (Monday) to 7 (Sunday)
//        System.out.println(DayOfWeek.of(1));                    //TUESDAY
//
//        DayOfWeek day = DayOfWeek.SUNDAY;
//        System.out.println(day.getValue());                     //5
//
//        LocalDate localDate = LocalDate.now();
//        System.out.println(localDate.with(DayOfWeek.SUNDAY));  //2013-05-13  i.e. when was monday in current week ?

//        LocalDate date = LocalDate.of(2020, Month.JANUARY, 9);                     //Today
//
//        LocalDate endOfMonth = date.with(TemporalAdjusters.lastDayOfMonth());
//        System.out.println(endOfMonth.toString());                              //2013-05-31
//
//        LocalDate nextTue = date.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
//        System.out.println(nextTue.toString());                                 //2013-05-21

        //Builder pattern used to make date object
//        OffsetDateTime date1 = Year.of(2013)
//                .atMonth(Month.MAY).atDay(15)
//                .atTime(0, 0)
//                .atOffset(ZoneOffset.of("+03:00"));
//        System.out.println(date1);                                     //2013-05-15T00:00+03:00
//
//factory method used to make date object
//        OffsetDateTime date2 = OffsetDateTime.
//                of(2013, 5, 15, 0, 0, 0, 0, ZoneOffset.of("+03:00"));
//        System.out.println(date2);
//        Clock clock = Clock.systemDefaultZone();
//        System.out.println(clock);                      //SystemClock[Asia/Calcutta]
//        System.out.println(clock.instant().toString()); //2013-05-15T06:36:33.837Z
//        System.out.println(clock.getZone());            //Asia/Calcutta
//
//        Clock anotherClock = Clock.system(ZoneId.of("Europe/Tiraspol"));
//        System.out.println(anotherClock);                       //SystemClock[Europe/Tiraspol]
//        System.out.println(anotherClock.instant().toString());  //2013-05-15T06:36:33.857Z
//        System.out.println(anotherClock.getZone());             //Europe/Tiraspol
//
//        Clock forwardedClock  = Clock.tick(clock, Duration.ofSeconds(600));
//        System.out.println(forwardedClock.instant().toString());  //2013-05-15T06:30Z

        //Zone rules
//        System.out.println(ZoneRules.of(ZoneOffset.of("-10:30")));
//        System.out.println(ZoneRules.of(ZoneOffset.of("+02:00")).isFixedOffset());

        //used to format the date of required format using the builder pattern
        DateTimeFormatterBuilder formatterBuilder = new DateTimeFormatterBuilder();
        formatterBuilder.append(DateTimeFormatter.ISO_OFFSET_DATE)
                .appendLiteral("-")
                .appendZoneOrOffsetId();
        DateTimeFormatter formatter = formatterBuilder.toFormatter();
        System.out.println(formatter.format(ZonedDateTime.now()));
    }
}
