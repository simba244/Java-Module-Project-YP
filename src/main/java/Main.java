import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car[] cars = Car.createCars(scanner);

        scanner.close();

        Race race = new Race();
        race.findWinner(cars);
        race.printResult();
    }
}