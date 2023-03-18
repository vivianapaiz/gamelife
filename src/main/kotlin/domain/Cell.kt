package domain

class Cell(var isAlive: Evolutionary) {
    fun aliveInNextGeneration(numberOfNeighbors: Int): Boolean {
        return isAlive.nextGeneration(numberOfNeighbors)
    }
}