package com.example.groovy

import com.example.groovy.closure.Android

/**
 * Created by admin on 2017/4/5.
 */
class Main {
    static void main(String... args) {
//        Person person = new Person(name: "lilei",age: 14)
//        printf String.valueOf(person.mother)
//        def properties = person.properties
//        print(properties)
//        View view = new View()
//        view.setOnClickListener {
//            def delegate = getDelegate()
//            def owner = getOwner()
//            def thisObject = getThisObject()
//            println delegate
//            println owner
//            println thisObject
//            println it.toString()
        Android android = new Android()
        android.defaultConfig {
            doSmt("我是闭包")
            versionCode 100
            versionName "final_6.0"
            def delegate = getDelegate()
            def owner = getOwner()
            def thisObject = getThisObject()
            println delegate
            println owner
            println thisObject
        }
        println android.toString()
    }

    private static void doSmt(String str) {
        println "Main object ${str}"
    }
}

