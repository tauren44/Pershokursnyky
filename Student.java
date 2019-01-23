package com.company;

public class Student {
    private String name;  //имя студента
    private boolean present;  //присутствие на занятии
    private int performance;  //успеваемость
    private int sociability;  //коммуникабельность
    private Group group;  //группа

    public Student(String name, Group group, int performance, int sociability, boolean present){
        this.name = name;
        this.group = group;
        this.performance = performance;
        this.sociability = sociability;
        this.present = present;
        group.addStudent(this);
    }

    public boolean isPresent() {
        return present;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPerformance() {
        return performance;
    }

    public void setPerformance(int performance) {
        this.performance = performance;
    }

    public int getSociability() {
        return sociability;
    }

    public void setSociability(int sociability) {
        this.sociability = sociability;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

}
