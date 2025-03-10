package lesson_29.children;

import java.lang.annotation.IncompleteAnnotationException;

/*** Author: Roman Romashko Date: 07.03.2025 ***/

public class Parent {
     String name;

    // Автоматически добавляется конструктор при компиляции

    //public Parent(){
    //}

    public Parent(String name){

        this.name= name;

    }

    final void show(){

        System.out.println("Show must go on");

    }
    }
