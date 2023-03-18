package domain

class Dead : Evolutionable {
    override fun nextGeneration(numberOfNeighbors: Int): Boolean {
        return numberOfNeighbors == 3
    }
}