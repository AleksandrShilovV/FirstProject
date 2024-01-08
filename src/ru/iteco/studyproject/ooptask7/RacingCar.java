package ru.iteco.studyproject.ooptask7;

public class RacingCar extends Car{
    private String sponsor;

    public RacingCar(int speed, int length, int weight, String colour, String sponsor) {
        super(speed, length, weight, colour);
        this.sponsor = sponsor;
    }

    @Override
    public void gas() {
        System.out.println("Racing car start");
    }

    @Override
    public void stop() {
        System.out.println("Racing car stop");
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Спонсор " + sponsor);
    }
}
