package com.example.week3activities.week3

fun main(){
    print("Enter phone number: ")
    val phoneNumber: String? = readLine()

    if (phoneNumber != null) {
        if (phoneNumber.length == 11)
            println("+${phoneNumber.substring(1..3)})" + " " +
                    phoneNumber.substring(4..6) + "-" +
                    phoneNumber.substring(7..10))
        else println("Invalid Phone Number!")
    }
}