package main;

import bean.Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int menu = 0;
        while (true) {
            System.out.println("Welcome Car Registration System" +
                    "\n1.Car register." +
                    "\n2.Show all car." +
                    "\n3.Find car" +
                    "\n4.Update car");
            Scanner scan = new Scanner(System.in);
            menu = scan.nextInt();
            if (menu == 1) {
                scan = new Scanner(System.in);
                System.out.println("How many register car?");
                int count = scan.nextInt();
                Config.cars = new Car[count];
                for (int i = 0; i < Config.cars.length; i++) {
                    System.out.println((i + 1) + ":Register.");
                    scan = new Scanner(System.in);
                    System.out.println("Enter car brand.");
                    String brand = scan.nextLine();
                    scan = new Scanner(System.in);
                    System.out.println("Enter car model.");
                    String model = scan.nextLine();
                    scan = new Scanner(System.in);
                    System.out.println("Enter car situation.");
                    String situation = scan.nextLine();
                    scan = new Scanner(System.in);
                    System.out.println("Enter year.");
                    String year = scan.nextLine();
                    scan = new Scanner(System.in);
                    System.out.println("Enter car price.");
                    int price = scan.nextInt();
                    Car cr = new Car(brand, model, situation, year, price);
                    Config.cars[i] = cr;
                }
            } else if (menu == 2) {
                for (int i = 0; i < Config.cars.length; i++) {
                    Car cr = Config.cars[i];
                    System.out.println(cr.getFullInfo());
                }
            }
        }
    }
}
