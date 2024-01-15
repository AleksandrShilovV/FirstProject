package ru.iteco.studyproject.interfaceandenumtask8;

public enum Season {

    WINTER("WHITE"),
    SPRING("YELLOW"),
    SUMMER("GREEN"),
    AUTUMN("ORANGE");

    private final String color;

    Season(String color) {
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }
}
