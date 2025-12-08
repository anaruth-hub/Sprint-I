package sprint01.JavaCollections03.level02A;

import java.util.Objects;

public class Restaurant implements Comparable<Restaurant> {

    private final String name;
    private final int score;

    public Restaurant(String name, int score) {
        this.name = Objects.requireNonNull(name, "name cannot be null");
        this.score = score;
    }

    public String getName() {
        return name;

    }

    public int getScore() {
        return score;
    }

        public int compareTo(Restaurant other) {

        int scoreComparison = Integer.compare(other.score, this.score);
        if (scoreComparison != 0) {
            return scoreComparison;

        }

        return this.name.compareToIgnoreCase(other.name);
    }


    public boolean equals(Object obj) {

        if (this == obj) return true;
        if (!(obj instanceof Restaurant other)) return false;


        return this.score == other.score &&
                this.name.equalsIgnoreCase(other.name);
    }


    public int hashCode() {
        return Objects.hash(name.toLowerCase(), score);

    }


    public String toString() {
        return "Restaurant{name='" + name + "', score=" + score + "}";
    }
}
