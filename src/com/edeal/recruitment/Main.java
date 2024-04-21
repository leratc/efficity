package com.edeal.recruitment;

import javax.servlet.http.HttpSession;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) {

        String json = "{\"titre\": \"Projet Recrutement\",\"numero\": 10,\"dateDebut\": \"2024-04-21\",\"dateFin\": \"2024-11-12\", \"etat\": \"GOING\"}";
        //ProjectBeanCustom.saveBean(httpSession.getCurrent(),json,BasicBean.class,true);
        LocalDateTime dateFinLocale = LocalDateTime.of(2024, 11, 12, 0, 0, 0, 0);
        Date dateFin = Date.from(dateFinLocale.toInstant(ZoneOffset.UTC));
        ProjectBeanCustom projectBeanCustom = new ProjectBeanCustom("Projet Recrutement", 10, Date.from(Instant.now()), dateFin, "GOING");
        System.out.println(projectBeanCustom.toString());
    }




}
