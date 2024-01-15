package ru.iteco.studyproject.interfaceandenumtask8;

public class Client extends Person implements Printable, SeasonHandler{

    public int getNumber() {
        return number;
    }

    private int number;

    public Client(String name, int age, String sex, int number) {
        super(name, age, sex);
        this.number = number;
    }

    @Override
    void order() {
        System.out.println("Client ordered pizza");
    }

    @Override
    public void printFields() {
        System.out.println(name + " Возраст " + age + " Пол " + sex + " Номер заказа " + number);
    }

    @Override
    public void printSeason(Season season) {
        System.out.println("Сейчас время года из перечисления " + season.name() + " Цвет сезона "
                + season.getColor());
    }
}
