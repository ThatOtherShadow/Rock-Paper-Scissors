import kotlin.random.Random
import kotlin.random.nextInt

class RPSLogic {

    fun startGame() {
        val computerPick = computerPick()
        val userIn = getInput()
        when (userIn) {
            1 -> {
                when (computerPick) {
                    1 -> {
                        tie(1)
                    }
                    2 -> {
                        playerLose(1)
                    }
                    else -> {
                        playerWin(1)
                    }
                }
            }
            2 -> {
                when (computerPick) {
                    1 -> {
                        playerWin(2)
                    }
                    2 -> {
                        tie(2)
                    }
                    else -> {
                        playerLose(2)
                    }
                }
            }
            3 -> {
                when (computerPick) {
                    1 -> {
                        playerLose(3)
                    }
                    2 -> {
                        playerWin(3)
                    }
                    else -> {
                        tie(3)
                    }
                }
            }
        }
        playAgain()
    }

    private fun playAgain() {
        println("Do you want to play again, Yes or No")
        val userInput = readln()
        if (userInput.lowercase() in arrayOf("y", "yes", "yeah")) {
            startGame()
        }
    }


    private fun computerPick(): Int {
        return Random.nextInt(1, 3)
    }

    private fun getInput(): Int {
        println("Pick Rock, Paper or Scissors.")
        while (true) {
            val userInput = readln()
            if (userInput.lowercase() in arrayOf("1", "r", "rock")) {
                return 1
            }
            else if (userInput.lowercase() in arrayOf("2", "p", "paper")) {
                return 2
            }
            else if (userInput.lowercase() in arrayOf("3", "s", "scissors")) {
                return 3
            }
            else {
                println("Invalid input.")
            }
        }
    }

    private fun tie(state: Int) {
        if (state == 1) {
            println("Tie, both picked Rock.")
        }
        else if (state == 2) {
            println("Tie, both picked Paper.")
        }
        else if (state == 3) {
            println("Tie, both picked Scissors.")
        }
    }

    private fun playerWin(state: Int) {
        if (state == 1) {
            println("You won, computer picked Scissors.")
        }
        else if (state == 2) {
            println("You won, computer picked Rock.")
        }
        else if (state == 3) {
            println("You won, computer picked Paper.")
        }
    }

    private fun playerLose(state: Int) {
        if (state == 1) {
            println("You lost, computer picked Paper.")
        }
        else if (state == 2) {
            println("You lost, computer picked Scissors.")
        }
        else if (state == 3) {
            println("You lost, computer picked Rock.")
        }
    }
}