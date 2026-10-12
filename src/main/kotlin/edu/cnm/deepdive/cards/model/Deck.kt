package edu.cnm.deepdive.cards.model

import edu.cnm.deepdive.cards.model.Card
import edu.cnm.deepdive.cards.model.Rank
import edu.cnm.deepdive.cards.model.Suit

class Deck() {
    private val cards: MutableList<Card> = mutableListOf()

    init {
        for (suit: Suit in Suit.entries){
            for (rank: Rank in Rank.entries){
                cards.add(Card(rank, suit))
            }
        }
    }
    fun shuffle(){
        cards.shuffle()
    }
    fun deal(number: Int) : Hand{
        val taken = cards.take(number)
        cards.removeAll(taken)
        return Hand(taken.toMutableList())
    }
    fun draw(): Card{
        return cards.removeFirst()
    }
    fun isEmpty(): Boolean{
        return cards.isEmpty()
    }
}