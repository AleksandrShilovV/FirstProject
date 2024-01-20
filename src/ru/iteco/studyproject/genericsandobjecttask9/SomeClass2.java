package ru.iteco.studyproject.genericsandobjecttask9;

public class SomeClass2<T extends SomeInterface>{
    T type;

    public SomeClass2(T type) {
        this.type = type;
    }
}
