package com.example.rockpaperscissors

    fun main(){
        var computerChoice = ""
        var playerChoice = ""
        var playAgain = "no".uppercase()

        while (playAgain != "no") {
            println("PLease enter your choice of Rock, Paper, or Scissors")
            playerChoice = readln()

            while (playerChoice != "Rock" && playerChoice != "Paper" && playerChoice != "Scissors") {
                println("PLease try again the valid choices are Rock, Paper, or Scissors")
                playerChoice = readln()
            }
            println("You have selected a valid option of: $playerChoice")

            val randomNumber = (1..3).random()

            computerChoice = when (randomNumber) {
                1 -> {
                    "Rock"
                }

                2 -> {
                    "Paper"
                }

                else -> {
                    "Scissors"
                }
            }
            println("Computer has chosen: $computerChoice")

            val winner = when {
                playerChoice == computerChoice -> "Tie"
                playerChoice == "Rock" && computerChoice == "Scissors" -> "Player"
                playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
                playerChoice == "Scissors" && computerChoice == "Paper" -> "Player"
                else -> "Computer"
            }

//one option
//        if(winner == "Tie"){
//            println("It was a Tie")
//         }else if(winner == "Player"){
//            println("You Won")
//        } else {
//            println("You lost you hoser!")
//        }

            //Another option
            if (winner == "Tie") {
                println("It was a Tie")
            } else {
                println("$winner won!")
            }

            println("Wanna play again? Please enter Yes or No")
            playAgain = readln()
        }
    }