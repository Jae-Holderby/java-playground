package com.galvanize;

import java.util.List;

public class InPersonCourse extends Course {

    private String teacher;


    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public InPersonCourse(List<String> students, String teacher) {
        super(students);
        this.teacher = teacher;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " (taught by " + teacher + ")";
    }
}
