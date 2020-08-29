package com.padcx.kotlinmodule

import java.util.*

/**
 * Created by Hnin Hsu Hlaing
 * on 8/28/2020
 */
fun first(){
    var Palindrome = false

    fun isPalindrome(input: String): Boolean {
        return input == (input.reversed())
    }
    fun requestInput(): String {
        var scanner = Scanner(System.`in`)
        print("Type something => ")
        return scanner.next()
    }
    while (!Palindrome) {
        if (isPalindrome(requestInput())) {
            Palindrome = true
            println("The text you entered is Palindrome and you pass the test.")
        } else {
            println("You fail!, Please try with other text...")
        }
    }
}

fun main(){
    fun requestInput(): String {
        var scanner = Scanner(System.`in`)
        print("Please enter input => ")
        return scanner.next()
    }
    fun isBalanced(input: String) {
        var firstPair: Int = 0
        var secondPair: Int = 0
        var thirdPair: Int = 0
        var stack = Stack<Char>()

        input.forEach {
            if (it == '{' || it == '[' || it == '(') {
                stack.push(it)
            }
        }

        for (i in input) {

            if (stack.isEmpty()) {
                println("It’s not balanced.")
                break
            }

            when (i) {
                '}' -> {
                    stack.pop()
                    firstPair += 1
                };

                ']' -> {
                    stack.pop()
                    secondPair += 1
                };

                ')' -> {
                    stack.pop()
                    thirdPair += 1
                };
            }
        }
        println(
            "It’s balanced. pair of { = $firstPair," +
                    " pair of [ = $secondPair , pair of ( = $thirdPair"
        )

    }

    var ans = false
    var inputValue = requestInput()

    for (data in inputValue) {
        if (data == '{' || data == '[' || data == '(' ||
            data == '}' || data == ']' || data == ')'
        ) {
            ans = true
        } else {
            ans = false
            break
        }
    }

    if (ans) {
        isBalanced(inputValue)
    } else {
        println("Need to fill correct input!!")
    }

}