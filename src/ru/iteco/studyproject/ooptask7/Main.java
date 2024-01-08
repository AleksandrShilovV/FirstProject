package ru.iteco.studyproject.ooptask7;

public class Main {
    public static void main(String[] args) {
        Car racingCar = new RacingCar(250,550,500,"Black", "RedBull");
        Car sedanCar = new SedanCar(100, 900, 1500, "Red");
        Car sedanCar2 = new SedanCar(100, 900, 1500, "Green");

        Car[] cars = new Car[]{racingCar, sedanCar, sedanCar2};
        System.out.println("Количество машин = " + Car.getCount());
        for (Car car : cars) {
            car.gas();
            car.stop();
            car.sound();
            car.getInfo();
        }
    }
}
