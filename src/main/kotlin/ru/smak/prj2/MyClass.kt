package ru.smak.prj2

import kotlin.random.Random

class MyClass(var p: Int) {
    var a: Int
    val a2: Int
        get() = a * a
    var b: Int = 0
        set(value) {
            field = value * 2
        }
    var t: String = ""

    init{
        a = 0
    }

    constructor() : this(0)

    override fun toString() = "a = $a; a2 = $a2; b = $b; p=$p"
}

var mc: MyClass? = null
fun main() {

    val br = Random.nextBoolean()
    if (br) mc = MyClass(30)
    println(mc)

    println(mc?.run{
        a = 100
        b = 10
        t = "Привет"
        println(t.length)
        a * b
    })

    val mc2 = MyClass().apply{
        a = 100
        b = 100
        t = "Текст"
    }

    println(with(mc2){
        a = 300
        b = 764
        a * b
    })

}