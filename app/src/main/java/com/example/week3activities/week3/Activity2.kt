package com.example.week3activities.week3

fun main() {
    println("Enter file name: ")
    val file: String? = readLine()

    if (file != null)
        if (file.contains(".")) {
            println(file.substringAfterLast("."))
        } else {
            println("Unknown")
        }
}