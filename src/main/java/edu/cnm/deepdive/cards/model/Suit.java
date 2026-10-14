package edu.cnm.deepdive.cards.model;

/**
 * Enumeration of the four suits in a standard deck of playing cards.
 */
public enum Suit {
  CLUBS("♣",Color.Black ),
  DIAMONDS("♢",Color.Red),
  HEARTS("♡",Color.Red ),
  SPADES("♠",Color.Black );

  private final String abbreviation;
  private final Color color;

  Suit(String abbreviation, Color color) {
    this.abbreviation = abbreviation;
    this.color = color;
  }

  @Override
  public String toString() {
    return abbreviation;
  }

  public String abbreviation() {
    return abbreviation;
  }

  public Color color() {
    return color;
  }

  public enum Color{
    Black, Red
  }
}
