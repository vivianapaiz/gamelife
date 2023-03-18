package domain

class Alive : Evolutionable {
    override fun nextGeneration(numberOfNeighbors: Int): Boolean {
       return numberOfNeighbors == 2 || numberOfNeighbors == 3
    }
}