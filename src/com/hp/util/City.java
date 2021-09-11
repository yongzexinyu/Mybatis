package com.hp.util;

import java.io.Serializable;
import java.util.List;

/**
 * city
 * @author 
 */
public class City implements Serializable {
    private Integer cId;


    private String cname;

    private List<Area> areas;

    @Override
    public String toString() {
        return "City{" +
                "cId=" + cId +
                ", cname='" + cname + '\'' +
                ", areas=" + areas +
                '}';
    }

    private static final long serialVersionUID = 1L;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

}