package com.hp.util;

import java.io.Serializable;
import java.util.List;

/**
 * school
 * @author 
 */
public class School implements Serializable {
    private Integer sid;

    private String sname;

    private List<Class> aClass;

    public List<Class> getaClass() {
        return aClass;
    }

    public void setaClass(List<Class> aClass) {
        this.aClass = aClass;
    }

    private static final long serialVersionUID = 1L;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
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
        School other = (School) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getSname() == null ? other.getSname() == null : this.getSname().equals(other.getSname()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getSname() == null) ? 0 : getSname().hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "School{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", aClass=" + aClass +
                '}';
    }
}