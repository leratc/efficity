package com.edeal.recruitment;

import org.json.JSONObject;

import java.nio.file.AccessDeniedException;
import java.util.Objects;

public class BasicBean {
    String lastName;
    String firstname;

    public BasicBean(String lastName, String firstname) {
        this.lastName = lastName;
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public BasicBean populateFromJson (JSONObject json, boolean save) throws AccessDeniedException {
        String lastName="";
        String firstName="";
        try {
            lastName = (String) json.get("lastName");
            firstName = (String) json.get("firstName");
        }
        catch (Throwable e) {
            throw new AccessDeniedException(e.getMessage());
        }
        return new BasicBean(lastName,firstName);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BasicBean basicBean = (BasicBean) o;
        return Objects.equals(lastName, basicBean.lastName) && Objects.equals(firstname, basicBean.firstname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstname);
    }
}
