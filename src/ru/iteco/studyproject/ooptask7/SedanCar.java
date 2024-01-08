package ru.iteco.studyproject.ooptask7;

public class SedanCar extends Car{
    private String category;
    public SedanCar(int speed, int length, int weight, String colour) {
        super(speed, length, weight, colour);
    }

    @Override
    public void gas() {
        System.out.println("Sedan car start");
    }

    @Override
    public void stop() {
        System.out.println("Sedan car stop");
    }
}
