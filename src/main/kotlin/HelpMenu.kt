class HelpMenu {


    fun showMenu() {
        println("""
        Enter 1, R, or Rock to choose rock

        Enter 2, P, or Paper to choose paper

        Enter 3, S, or Scissors to choose scissors
        

        Press enter to return...
        """.trimIndent())
        readln()
    }
}