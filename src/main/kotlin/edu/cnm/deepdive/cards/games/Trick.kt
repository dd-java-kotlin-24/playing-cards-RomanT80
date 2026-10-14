package edu.cnm.deepdive.cards.games

import edu.cnm.deepdive.cards.model.Card
import edu.cnm.deepdive.cards.model.Deck
import edu.cnm.deepdive.cards.model.Suit
import java.util.Collections
import java.util.random.RandomGenerator
import kotlin.math.min

class Trick(val rng: RandomGenerator? = null) {

    private val _redPile: MutableList<Card> = mutableListOf()
    val redPile: List<Card>
        get() = Collections.unmodifiableList(_redPile)
    val blackPile: List<Card>
        get() = Collections.unmodifiableList(_blackPile)

    private val _blackPile: MutableList<Card> = mutableListOf()

    fun performMagic(deck: Deck) {
        _redPile.clear()
        _blackPile.clear()
        if (rng != null) {
            deck.shuffle(rng)
        }
        while (!deck.isEmpty) {
            val selector: Card = deck.draw()
            val target: MutableList<Card> =
                if (selector.suit().color() == Suit.Color.Black) _blackPile else _redPile
            target.add(deck.draw())
        }
        if (rng != null) {
            val swapCount: Int = rng.nextInt(1 + min(_blackPile.size, _redPile.size))
            (1..swapCount).forEach {
                _blackPile.addLast(_redPile.removeFirst())
                _redPile.addLast(_blackPile.removeFirst())
            }
        }

        // TODO: If rng is not null, swap an equal random number (between 0 and the size of the
        //  smaller of the two piles, inclusive) of cards between the black and red piles.
    }
}