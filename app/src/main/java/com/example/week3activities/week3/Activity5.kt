package com.example.week3activities.week3

fun main() {

    val employee1 = "Alice"
    val employee2 = "Bob"
    val salary1 = listOf(1000,2000,3000)
    val salary2 = listOf(4000,5000)

    val a = Pair(employee1, salary1)
    val b = Pair(employee2, salary2)


    while (true) {
        println("  Welcome Salary Tracker!")
        println("1. View Employee Salary.")
        println("2. View All Employee's and Salaries.")
        println("3. Exit")
        println(" ")
        print("choose option: ")
        println(" ")

        when (readLine()?.toIntOrNull()) {
            1 -> {
                println("\nEnter employee name (or enter 'done' to quit): ")
                val employeeName = readLine().toString()
                if (employeeName.equals(employee1, ignoreCase = true)){
                    println("${a.first}\nNumber of pay periods: \n${a.second.size}")
                    println("Total Salary: ${salary1.sum()}")
                }else if (employeeName.equals(employee2, ignoreCase = true)){
                    println("${b.first}\nNumber of pay periods: \n${b.second.size}")
                    println("Total Salary: ${salary2.sum()}")
                }
                else{
                    println("Invalid Employee Name!")
                    continue
                }
            }
            2 -> {
                println("${a.first}\n${a.second.size}\nNumber of pay periods: \nTotal Salary: ${salary1.sum()}")
                println(" ")
                println("${b.first}\n${b.second.size}\nNumber of pay periods: \nTotal Salary: ${salary2.sum()}")
            }
            3 -> {
                println("Exiting Salary Tracker...")
                return
            }
        }
    }
}