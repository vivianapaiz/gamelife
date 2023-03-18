package domain

class Dead : Evolutionary {
    override fun nextGeneration(numberOfNeighbors: Int): Boolean {
        return numberOfNeighbors == 3
    }
}