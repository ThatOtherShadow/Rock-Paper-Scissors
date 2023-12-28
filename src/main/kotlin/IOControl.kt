import kotlin.system.exitProcess

class IOControl {
    private val rpsLogic = RPSLogic()
    private val helpMenu = HelpMenu()

    private var mainMenuInput = "0"

    private fun exit() {
        println("Thanks for playing :)")
        Thread.sleep(1000)
        exitProcess(0)
    }

    fun mainMenuIoCheck() {
        while (true) {
            println("Enter 1, P, or PLAY to play, Enter 2, H, or HELP for help, Enter 3, X or EXIT to exit")
            mainMenuInput = readln()
            if (mainMenuInput.lowercase() in arrayOf("1", "p", "play")) {
                clearScreen()
                rpsLogic.startGame()
            }
            else if (mainMenuInput.lowercase() in arrayOf("2", "h", "help")) {
                clearScreen()
                helpMenu.showMenu()
            }
            else if (mainMenuInput.lowercase() in arrayOf("3", "x", "exit")) {
                clearScreen()
                exit()
            }
        }
    }

    private fun clearScreen() {
        for(i in 1..100) {
            println("")
        }
    }
}