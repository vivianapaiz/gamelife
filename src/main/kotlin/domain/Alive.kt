package domain

class Alive : Evolutionary {
    override fun nextGeneration(numberOfNeighbors: Int): Boolean {
       return numberOfNeighbors == 2 || numberOfNeighbors == 3
    }
}