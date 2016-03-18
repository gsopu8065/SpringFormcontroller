package org.formexample;

/**
 * Created by srujangopu on 3/17/16.
 */
public class Student {

    private String studentName;
    private String studentRoll;
    private Double gpa;
    private boolean sports;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentRoll() {
        return studentRoll;
    }

    public void setStudentRoll(String studentRoll) {
        this.studentRoll = studentRoll;
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    public boolean isSports() {
        return sports;
    }

    public void setSports(boolean sports) {
        this.sports = sports;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentRoll='" + studentRoll + '\'' +
                ", gpa=" + gpa +
                ", sports=" + sports +
                '}';
    }
}
