package com.hp.util;

import java.io.Serializable;
import java.util.List;

/**
 * student
 * @author 
 */
public class Student implements Serializable {
    private Integer stuId;

    private String stuName;

    private String stuSex;

    public List<Classleader> getClassleader() {
        return classleader;
    }

    public void setClassleader(List<Classleader> classleader) {
        this.classleader = classleader;
    }

    private Integer stuAge;

    private Integer classId;

    private List<Classleader> classleader;

    private static final long serialVersionUID = 1L;

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex;
    }

    public Integer getStuAge() {
        return stuAge;
    }

    public void setStuAge(Integer stuAge) {
        this.stuAge = stuAge;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
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
        Student other = (Student) that;
        return (this.getStuId() == null ? other.getStuId() == null : this.getStuId().equals(other.getStuId()))
            && (this.getStuName() == null ? other.getStuName() == null : this.getStuName().equals(other.getStuName()))
            && (this.getStuSex() == null ? other.getStuSex() == null : this.getStuSex().equals(other.getStuSex()))
            && (this.getStuAge() == null ? other.getStuAge() == null : this.getStuAge().equals(other.getStuAge()))
            && (this.getClassId() == null ? other.getClassId() == null : this.getClassId().equals(other.getClassId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStuId() == null) ? 0 : getStuId().hashCode());
        result = prime * result + ((getStuName() == null) ? 0 : getStuName().hashCode());
        result = prime * result + ((getStuSex() == null) ? 0 : getStuSex().hashCode());
        result = prime * result + ((getStuAge() == null) ? 0 : getStuAge().hashCode());
        result = prime * result + ((getClassId() == null) ? 0 : getClassId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", stuSex='" + stuSex + '\'' +
                ", stuAge=" + stuAge +
                ", classId=" + classId +
                ", classleader=" + classleader +
                '}';
    }
}