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
            println("Enter 1 to play, Enter 2 for help, Enter 3, X or EXIT to exit")
            mainMenuInput = readln()
            if (mainMenuInput == "1") {
                clearScreen()
                rpsLogic.startGame()
            }
            else if (mainMenuInput == "2") {
                helpMenu.showMenu()
            }
            else if (mainMenuInput.lowercase() in arrayOf("3", "x", "exit")) {
                clearScreen()
                exit()
            }
        }
    }

    private fun clearScreen() {
        println("""
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            """) // This is garbage, but I have no idea how to do it any other way,
    }            // And for some reason, ANSI escape codes don't work. (Or im an idiot)
}