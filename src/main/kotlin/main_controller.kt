class main_controller() {
    val ioControl = io_control()

    fun game_control() {
        ioControl.main_menu_io_check()
    }
}

fun main() {
    val mainController = main_controller()

    mainController.game_control()
}