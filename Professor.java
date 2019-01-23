package com.company;

public class Professor {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Professor(String name){
        this.name = name;
    }

    public void doMuster(Group group){   //Метод переклички, принимает в качестве параметра имя группы
        System.out.println("Muster of group: "  + group.getGroupName()); //выводит в консоль имя группы
        for(Student student : group.getStudents()){  //проходим по списку студентов данной группы
            if (!student.isPresent()){
                System.out.println(student.getName()+ " is absent!"); //отсутсвует
            }
            else System.out.println(student.getName()+ " is present!"); //присутствует
        }
    }

}
