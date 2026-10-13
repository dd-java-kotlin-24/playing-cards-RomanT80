package edu.cnm.deepdive.cards.model;

import java.util.Comparator;
import org.jetbrains.annotations.NotNull;

/**
 * Encapsulates the attributes of a playing card.
 *
 * @param rank one of Ace through King.
 * @param suit one of Spades, Hearts, Diamonds, Clubs.
 */
public record Card(Rank rank, Suit suit) implements Comparable<Card> {

  private static final Comparator<Card> SHRINK_WRAP_Comparator =
      Comparator.comparing(Card::suit)
          .thenComparing(Card::rank);


  @Override
  public int compareTo(@NotNull Card otherCard) {
    return SHRINK_WRAP_Comparator.compare(this, otherCard);
  }
}

