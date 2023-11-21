package com.example.letters;

public class Letter {
    String index, letter;

    public Letter(String index, String letter) {
        this.index = index;
        this.letter = letter;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }
}
