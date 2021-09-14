package com.hp.util;

import java.io.Serializable;

/**
 * classleader
 * @author 
 */
public class Classleader implements Serializable {
    private Integer bid;

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }

    private String bname;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    private People people;

    private Student student;

    private static final long serialVersionUID = 1L;

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Classleader other = (Classleader) that;
        return (this.getBid() == null ? other.getBid() == null : this.getBid().equals(other.getBid()))
            && (this.getBname() == null ? other.getBname() == null : this.getBname().equals(other.getBname()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBid() == null) ? 0 : getBid().hashCode());
        result = prime * result + ((getBname() == null) ? 0 : getBname().hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Classleader{" +
                "bid=" + bid +
                ", bname='" + bname + '\'' +
                ", people=" + people +
                ", student=" + student +
                '}';
    }
}