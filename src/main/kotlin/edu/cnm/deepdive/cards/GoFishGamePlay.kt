package edu.cnm.deepdive.cards

import edu.cnm.deepdive.cards.model.Deck
import edu.cnm.deepdive.cards.model.Hand
import edu.cnm.deepdive.cards.model.Rank

class GoFishGamePlay(val playerHand: Hand, val computerHand: Hand, val deck: Deck) {
    fun playTurns() {
        println("Behold your cards")
        println(playerHand)
        do {
            val rank: Rank = promptForRank()
            val takenCards = computerHand.removeCardsOfRank(rank)
            playerHand.addCards(cardsToAdd = takenCards)
            if (takenCards.isNotEmpty()) {
                println("I had ${takenCards.count()} $rank cards! Go again!")
            }

        } while (takenCards.isNotEmpty())
        println("God Fish")
        playerHand.addCards(cardsToAdd = listOf(deck.draw()))
    }

    private fun GoFishGamePlay.promptForRank(): Rank {
        println(playerHand)

        println("Which card would you like to ask for?")
        var rank: Rank?
        do {
            val input = readln()

            rank = Rank.fromAbbreviation(input)
            if (rank == null) {
                println("Invalid input.")
            }
        } while (rank == null)
        return rank
    }

    private fun computerPickRank(): Rank {
        return computerHand.getCards().groupingBy { it.rank }
            .eachCount().maxBy { it.value }.key
    }
}