package ru.smak.prj2

fun main() {
    val lst = listOf(1, 2, 3)
    val mlst = mutableListOf<Int>()
    mlst.add(123)
    println(mlst.joinToString())
    val map1 = mutableMapOf(1 to 1, 2 to 10, 3 to 100)
    println(map1[3])
    val hm = HashMap<Int, Double>()
    hm.put(1, 3.5)
    hm.put(2, 4.5)
    hm.put(2, 7.5)

    println(hm.toList().joinToString())
}