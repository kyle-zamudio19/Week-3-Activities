package com.example.week3activities.week3

fun main() {
    val librariesBooks = ArrayList<String>()
    var bookTitle = ""
    var author: String
    var yearOfPublication: String

    while (true) {
        println("  Welcome to Library!")
        println("1. Add new book.")
        println("2. Search book.")
        println("3. View collections.")
        println("4. Exit")
        println(" ")
        print("choose option: ")

        when (readLine()?.toIntOrNull()) {
            1 -> {
                println("\nEnter the title of the Book: ")
                bookTitle = readln()

                println("Enter the book's Author: ")
                author = readln()

                println("Enter Year of Publication: ")
                yearOfPublication = readln()

                librariesBooks.add("$bookTitle by: $author ($yearOfPublication)\n")
                println("Book added successfully!\n")
            }
            2 -> {
                println("Enter book title: ")
                val bookToBeSearch = readln()
                librariesBooks.forEachIndexed { index, bookName ->
                    if (bookName.contains(bookToBeSearch, ignoreCase = true)) {
                        println("Book found! \n${librariesBooks[index].substringAfter(bookTitle)}")
                    } else if (bookTitle != bookToBeSearch) {
                        print("")
                    } else {
                        println("Book not found!")
                    }
                }
            }
            3 -> {
                println("Collections: ")
                librariesBooks.forEachIndexed { _, element ->
                    val bookName = element.split(" ").first()
                    println("$bookName \n")
                }
            }
            4 -> {
                println("Exiting Library...")
                return
            }
            else -> {
                println("Invalid option! Please try again!")
            }
        }
    }
}