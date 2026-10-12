package edu.cnm.deepdive.cards.model;
/**
 * Enumeration of the thirteen ranks in a standard deck of playing cards.
 */
public enum Rank {
  ACE("A"),
  TWO("2"),
  THREE("3"),
  FOUR("4"),
  FIVE("5"),
  SIX("6"),
  SEVEN("7"),
  EIGHT("8"),
  NINE("9"),
  TEN("T"),
  JACK("J"),
  QUEEN("Q"),
  KING("K"),
  Spades("S"),
  Clubs("C"),
  Hearts("H"),
  Diamonds("D");

  private final String abbreviations;

  Rank(String abbreviations) {
    this.abbreviations = abbreviations;
  }
  @Override
  public String toString() {
    return abbreviations;
  }
  public static Rank fromAbbreviation(String abbreviation) {
    for (Rank rank : values()) {
      if (rank.abbreviations.equals(abbreviation)) {
        return rank;
      }
    }
    return null;
  }
}
