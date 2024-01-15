package ru.iteco.studyproject.interfaceandenumtask8;

public class Employee extends Person implements Printable, SeasonHandler{
    private Client client;

    public Employee(String name, int age, String sex, Client client) {
        super(name, age, sex);
        this.client = client;
    }


    @Override
    void order() {
        System.out.println("Employee took order number " + client.getNumber());
    }


    @Override
    public void printFields() {
        System.out.println(name + " Возраст " + age + " Пол " + sex + " Number order " + client.getNumber());
    }

    @Override
    public void printSeason(Season season) {
        System.out.println("Сейчас время года из перечисления " + season.name() + " Цвет сезона "
                + season.getColor());
    }
}
