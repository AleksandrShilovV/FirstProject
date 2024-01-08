package ru.iteco.studyproject.ooptask7;

public abstract class Car {
    protected int speed;
    protected int length;
    protected int weight;

    protected String colour;

    private static int count = 0;

    public Car() {
    }

    public Car(int speed, int length, int weight, String colour) {
        this.speed = speed;
        this.length = length;
        this.weight = weight;
        this.colour = colour;
        count++;
    }


    public void sound(){
        System.out.println("Sound bi-bip!");
    }

    public abstract void gas();

    public abstract void stop();

    public void getInfo() {
        System.out.println("Максимальная скорость = " + speed + "\nДлина автомобиля = " + length +
                "\nМасса = " + weight + "\nЦвет автомобиля " + colour);
    }

    public static int getCount() {
        return count;
    }
}
