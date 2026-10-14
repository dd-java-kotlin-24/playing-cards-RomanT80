package edu.cnm.deepdive.cards.model

import edu.cnm.deepdive.cards.model.Card
import edu.cnm.deepdive.cards.model.Rank
import edu.cnm.deepdive.cards.model.Suit
import java.util.Collections
import java.util.random.RandomGenerator

class Deck() {

    private val cards: MutableList<Card> = mutableListOf()

    val isEmpty: Boolean
        get() = cards.isEmpty()

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

    fun shuffle(rng: RandomGenerator){
        Collections.shuffle(cards, rng)
    }

    fun deal(number: Int) : Hand{
        val taken = cards.take(number)
        cards.removeAll(taken)
        return Hand(taken.toMutableList())
    }
    fun draw(): Card{
        return cards.removeFirst()
    }

}