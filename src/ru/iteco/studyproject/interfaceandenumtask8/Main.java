package ru.iteco.studyproject.interfaceandenumtask8;

public class Main {

    public static void main(String[] args) {
        Client client = new Client("Sasha", 14, "man", 1);
        client.printFields();
        client.printSeason(Season.WINTER);
        client.order();
        System.out.println();
        Employee employee = new Employee("Fedor", 80, "none", client);
        employee.printFields();
        employee.printSeason(Season.SPRING);
        employee.order();
    }
}
