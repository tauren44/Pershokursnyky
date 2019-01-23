package com.company;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String groupName;   //имя группы
    private List<Student> students = new ArrayList<>(); //список студентов группы


    public List<Student> getStudents() {
        return students;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public Group(String groupName){
        this.groupName = groupName;
    }
    public void chooseLeader(){             //выбор старосты
        Student leader = students.get(0);//в качестве примера для сравнения, берем первого студента в списке
        for(Student s : students){
            if((s.getSociability()+s.getPerformance())/2 > (leader.getPerformance()+leader.getSociability())/2){
                leader = s;
            }        //если (успеваемость+коммуникабельность)/2 у следующего студента выше, ставим его на место примера
        }
        System.out.println("Leader of " + this.getGroupName() + " is " + leader.getName()); //выводим имя старосты
    }

}

