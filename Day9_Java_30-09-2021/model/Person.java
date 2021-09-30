package com.torryharris.model;

import java.io.Serializable;
import java.util.Objects;

public class Person implements Comparable<Person>, Serializable {

    private static final long serialVersionUID=101;

    private int personId;
    private String name;
    private String occupation;
    private String city;

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getPersonId() == person.getPersonId() && getName().equals(person.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPersonId(), getName());
    }*/

    @Override
    public int compareTo(Person o) {
        return this.personId-o.personId;
    }
    public Person(int personId, String name, String occupation, String city) {
        this.personId = personId;
        this.name = name;
        this.occupation = occupation;
        this.city = city;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }



    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", name='" + name + '\'' +
                ", occupation='" + occupation + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
