package ru.courses.product;

public class Sauce {
    private String name; //имя
    private Spiciness spiciness; //острота

    public enum Spiciness {
        VERY_HOT("очень острый"),
        HOT("острый"),
        MILD("не острый");

        private final String level;

        Spiciness(String level) {
            this.level = level;
        }

        @Override
        public String toString() {
            return level;
        }
    }

    public Sauce(String name, Spiciness spiciness) {
        this.name = name;
        this.spiciness = spiciness;
    }

    @Override
    public String toString() {
        return "Соус " + name + ": " + spiciness;
    }
}
