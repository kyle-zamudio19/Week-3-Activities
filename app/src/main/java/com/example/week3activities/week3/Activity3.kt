package com.example.week3activities.week3

fun main(){
    val text = "The quick brown fox jumps over the lazy dog."
    val result = text.split(" ")
    println(result.reversed().joinToString(" "))
}