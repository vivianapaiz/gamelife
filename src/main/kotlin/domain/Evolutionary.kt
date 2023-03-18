package domain

interface Evolutionary {
    fun nextGeneration(numberOfNeighbors: Int): Boolean
}