package ru.iteco.studyproject.genericsandobjecttask9;

public class Main {
    public static void main(String[] args) {
        SomeClass1 someClass1 = new SomeClass1(10, "First obj");
        SomeClass2<SomeClass1> someClass2 = new SomeClass2<>(someClass1);
        System.out.println(someClass1);
        someClass2.type.someMethod();
    }
}
