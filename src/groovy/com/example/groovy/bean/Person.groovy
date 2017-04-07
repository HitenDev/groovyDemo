package com.example.groovy.bean

/**
 * Created by admin on 2017/4/5.
 */

class Person {
    String name
    int age

    void eat(String food) {
        println("你喂的${food}真难吃")
    }

    @Override
    String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}'
    }
}
