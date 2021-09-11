package com.hp.util;

import java.io.Serializable;

/**
 * area
 * @author 
 */
public class Area implements Serializable {
    private Integer aId;

    private Integer cityId;

    @Override
    public String toString() {
        return "Area{" +
                "aId=" + aId +
                ", cityId=" + cityId +
                ", aname='" + aname + '\'' +
                '}';
    }

    private String aname;

    private static final long serialVersionUID = 1L;

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }
}