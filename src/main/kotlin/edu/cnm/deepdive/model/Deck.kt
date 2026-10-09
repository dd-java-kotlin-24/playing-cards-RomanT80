package edu.cnm.deepdive.model

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
}