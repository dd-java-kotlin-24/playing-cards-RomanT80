package edu.cnm.deepdive.cards.model;

/**
 * Enumeration of the four suits in a standard deck of playing cards.
 */
public enum Suit {
  CLUBS("\u2663"),
  DIAMONDS("\u2666"),
  HEARTS("\u2665"),
  SPADES("\u2660");

  private final String abbreviation;

  Suit(String abbreviation) {
    this.abbreviation = abbreviation;
  }

  @Override
  public String toString() {
    return abbreviation;
  }
}
