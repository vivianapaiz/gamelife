package domain

class Cell(var isAlive: Boolean) {

    fun aliveInNextGeneration(numberOfNeighbors: Int) : Boolean {
         if (isAlive)
            inAStableEnvironment(numberOfNeighbors)
        else
             return inGeneticallyDiverseEnvironment(numberOfNeighbors)
    }

    private fun inAStableEnvironment(numberOfNeighbors: Int) : Boolean {
        return (numberOfNeighbors == 2 || numberOfNeighbors == 3)
    }

    private fun inGeneticallyDiverseEnvironment(numberOfNeighbors: Int): Boolean {
        return numberOfNeighbors == 3
    }
}