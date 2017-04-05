package com.example.groovy.bean

/**
 * Created by admin on 2017/4/5.
 */

class OuterClass {
    class InnerClass {
        def outerClosure = {
            def innerClosure = {
            }
            printfMsg("innerClosure", innerClosure)
            println("------")
            printfMsg("outerClosure", outerClosure)
        }

        void printfMsg(String flag, Closure closure) {
            def thisObject = closure.getThisObject()
            def ownerObject = closure.getOwner()
            def delegate = closure.getDelegate()
            println("${flag} this: ${thisObject.toString()}")
            println("${flag} owner: ${ownerObject.toString()}")
            println("${flag} delegate: ${delegate.toString()}")
        }

    }

    def callInnerMethod() {
        def innerClass = new InnerClass()
        innerClass.outerClosure.call()
        println("------")
        println("outerClosure toString ${innerClass.outerClosure.toString()}")
    }

    static void main(String[] args) {
        new OuterClass().callInnerMethod()
    }
}
