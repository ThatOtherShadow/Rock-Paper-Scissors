import kotlin.system.exitProcess

class io_control() {
    val RPSLogic = rps_logic()
    val HelpMenu = help_menu()

    var main_menu_input = "0"

    fun exit() {
        println("Thanks for playing :)")
        Thread.sleep(1000)
        exitProcess(0)
    }

    fun main_menu_io_check() {
        while (true) {
            println("Enter 1 to play, Enter 2 for help, Enter 3, X or EXIT to exit")
            main_menu_input = readln()
            if (main_menu_input == "1") {
                clear_screen()
                RPSLogic.start_game()
            }
            else if (main_menu_input == "2") {
                HelpMenu.show_menu()
            }
            else if (main_menu_input.lowercase() in arrayOf("3", "x", "exit")) {
                exit()
            }
        }
    }

    fun clear_screen() {
        println("""
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            """) // This is garbage, but I have no idea how to do it any other way.
    }
}