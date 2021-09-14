package com.hp.util;

import java.io.Serializable;

/**
 * idcard
 * @author 
 */
public class Idcard implements Serializable {
    private Integer zid;

    private Integer znumber;

    private Integer personId;

    private static final long serialVersionUID = 1L;

    public Integer getZid() {
        return zid;
    }

    public void setZid(Integer zid) {
        this.zid = zid;
    }

    public Integer getZnumber() {
        return znumber;
    }

    public void setZnumber(Integer znumber) {
        this.znumber = znumber;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
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
        Idcard other = (Idcard) that;
        return (this.getZid() == null ? other.getZid() == null : this.getZid().equals(other.getZid()))
            && (this.getZnumber() == null ? other.getZnumber() == null : this.getZnumber().equals(other.getZnumber()))
            && (this.getPersonId() == null ? other.getPersonId() == null : this.getPersonId().equals(other.getPersonId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getZid() == null) ? 0 : getZid().hashCode());
        result = prime * result + ((getZnumber() == null) ? 0 : getZnumber().hashCode());
        result = prime * result + ((getPersonId() == null) ? 0 : getPersonId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", zid=").append(zid);
        sb.append(", znumber=").append(znumber);
        sb.append(", personId=").append(personId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}