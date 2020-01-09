package com.nisum.streams;

import java.time.*;

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
        Duration duration = Duration.ofDays(23);
        System.out.println(duration.toString());     //PT5S

        duration = Duration.ofSeconds(60);
        System.out.println(duration.toString());     //PT1M

        duration = Duration.ofMinutes(10);
        System.out.println(duration.toString());     //PT10M

        duration = Duration.ofHours(2);
        System.out.println(duration.toString());     //PT2H

        duration = Duration.between(Instant.now(), Instant.now().plus(Duration.ofMinutes(10)));
        System.out.println(duration.toString());  //PT10M

    }
}
