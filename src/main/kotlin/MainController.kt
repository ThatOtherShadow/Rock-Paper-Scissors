class MainController {
    private val ioControl = IOControl()

    fun gameControl() {
        ioControl.mainMenuIoCheck()
    }
}

fun main() {
    val mainController = MainController()

    mainController.gameControl()
}