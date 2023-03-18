package domain

interface Evolutionable {

    fun nextGeneration(numberOfNeighbors: Int): Boolean
}