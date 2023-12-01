import kotlin.random.Random

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
    }


    private fun computerPick(): Int {
        return Random.nextInt(1, 3)
    }

    private fun getInput(): Int {
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
        if (state == 2) {
            println("Tie, both picked Paper.")
        }
        if (state == 3) {
            println("Tie, both picked Scissors.")
        }
    }

    private fun playerWin(state: Int) {
        if (state == 1) {
            println("You won, computer picked Scissors.")
        }
        if (state == 2) {
            println("You won, computer picked Rock.")
        }
        if (state == 3) {
            println("You won, computer picked Paper.")
        }
    }

    private fun playerLose(state: Int) {
        if (state == 1) {
            println("You lost, computer picked Paper.")
        }
        if (state == 2) {
            println("You lost, computer picked Scissors.")
        }
        if (state == 3) {
            println("You lost, computer picked Rock.")
        }
    }
}