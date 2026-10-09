package edu.cnm.deepdive.cards.model;

/**
 * Encapsulates the attributes of a playing card.
 * @param rank one of Ace through King.
 * @param suit one of Spades, Hearts, Diamonds, Clubs.
 */
public record Card(Rank rank, Suit suit) {
// TODO: 2026-10-09 Implement Comparable<Card> to support sorting back into shrinkwrap order
}
