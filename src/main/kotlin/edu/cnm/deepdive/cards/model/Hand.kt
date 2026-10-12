package edu.cnm.deepdive.cards.model

class Hand(private val cards: MutableList<Card>) {
    fun getCards(): List<Card> {
        return cards.toList()
    }

    override fun toString(): String {
        return cards.joinToString(" ")
    }

    fun removeCardsOfRank(rank: Rank): List<Card> {
        val removedCards = mutableListOf<Card>()
        for (card in cards) {
            if (card.rank == rank) {
                removedCards.add(card)

            }
        }
        cards.removeAll(elements = removedCards)
        return removedCards
    }

fun addCards(cardsToAdd:List<Card>){
    cards.addAll(elements= cardsToAdd)
}

}