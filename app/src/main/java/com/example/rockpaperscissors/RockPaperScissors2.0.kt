package com.example.rockpaperscissors

    fun main(){
        var computerChoice = ""
        var playersSelection = ""
        var playerChoice = ""
        var playAgain = "Yes".lowercase()

        while (playAgain != "stop") {
            println("PLease enter your choice of 1: for Rock, 2: for Paper, or 3: for Scissors")
            playersSelection = readln()

            while (playersSelection != "1" && playersSelection != "2" && playersSelection != "3") {
                println("PLease try again below the valid choices are 1: for Rock, 2: for Paper, or 3: for Scissors")
                playersSelection = readln()
            }


            if (playersSelection == "1"){
                playerChoice = "Rock"
            } else if (playersSelection == "2"){
                playerChoice = "Paper"
            } else {
                playerChoice = "Scissors"
            }

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

            println("You have chosen: $playerChoice")
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

            println("Press any key to play again, or type Stop to end the game")
            playAgain = readln().lowercase()
        }
    }