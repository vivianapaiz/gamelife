package domain

class Cell(var isAlive: Evolutionable) {

    fun aliveInNextGeneration(numberOfNeighbors: Int) : Boolean {
         return isAlive.nextGeneration(numberOfNeighbors)
    }
}