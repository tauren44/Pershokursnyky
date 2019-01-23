package com.company;

public class Main {

    public static void main(String[] args) {

        Group developers = new Group("developers");  //создадим группу "разработчики"
        Group designers = new Group("designers"); //создадим группу "дизайнеры"


        /*
        добавим в группы студентов с некоторыми параметрами успеваемости/общительности и присутствия
         */

        Student sasha = new Student("Sasha", developers, 7, 8, true);
        Student petya = new Student("Petya", developers, 9, 8, true);
        Student vasya = new Student("Vasya", developers, 7, 6, true);


        Student vitya = new Student("Vitya", designers, 6, 7, false);
        Student oksana = new Student("Oksana", designers, 9, 9, true);
        Student olya = new Student("Olya", designers, 8, 8, true);


        Professor moriarty = new Professor("Moriarty"); //создаем нового профессора

        moriarty.doMuster(developers);  //делаем перекличку в группе разработчиков
        moriarty.doMuster(designers);  //делаем перекличку в группе дизайнеров

        developers.chooseLeader();  //группа разработчиков выбирает старосту

        designers.chooseLeader(); //группа дизайнеров выбирает старосту
    }

}
