package com.edeal.recruitment;

import java.util.Date;
import com.edeal.recruitment.ProjectBean;

public class ProjectBeanCustom extends ProjectBean {

    String etat;

    public ProjectBeanCustom(String titre, int numero, Date dateDebut, Date dateFin, String etat) {
        super(titre, numero, dateDebut, dateFin);
        this.etat = etat;
    }

    public ProjectBeanCustom(String titre, int numero, Date dateDebut, Date dateFin) {
        super(titre, numero, dateDebut, dateFin);
    }

}