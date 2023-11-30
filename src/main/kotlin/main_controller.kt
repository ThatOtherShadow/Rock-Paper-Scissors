import com.sun.java.swing.action.HelpMenu

class main_controller() {
    val ioControl = io_control()
    val RPSLogic = rps_logic()
    val HelpMenu = help_menu()

    var main_menu_input = "0"

    fun game_control() {
        println("Enter 1 to play, Enter 2 for help, Enter 3, x or EXIT to exit")
        main_menu_input = readln()
        if (main_menu_input == "1") {
            //TODO Implement RPS Start Logic
        }
        else if (main_menu_input == "2") {
            //TODO Open Help Menu
        }
        else if (main_menu_input.lowercase() in arrayOf("3", "x", "exit")) {
            //TODO Implement Exit Logic
        }
    }
}

fun main() {
    val mainController = main_controller()

    mainController.game_control()
}