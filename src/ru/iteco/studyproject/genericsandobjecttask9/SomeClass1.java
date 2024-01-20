package ru.iteco.studyproject.genericsandobjecttask9;

import java.util.Objects;

public class SomeClass1 implements SomeInterface {

    private final Integer id;
    private final String name;


    public SomeClass1(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void someMethod() {
        System.out.println(this.getClass().getSimpleName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SomeClass1 that = (SomeClass1) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "SomeClass1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
