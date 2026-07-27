// Car.java
import java.util.Scanner;

public class Car {
    String name;
    int speed;
    static final int MIN_SPEED = 0;
    static final int MAX_SPEED = 250;

    Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    static Car[] createCars(Scanner scanner) {
        Car[] cars = new Car[3];

        for (int i = 1; i <= 3; i++) {
            Car car = new Car("", 0);
            car.validateAndFix(scanner, i); // Заполняем ячейку данными
            cars[i - 1] = car; // Сохраняем индекс в массив
        }

        return cars;
    }

    void validateAndFix(Scanner scanner, int carNumber) {
        // Проверка имени
        while (true) {
            System.out.println("— Введите название машины №" + carNumber + " (Lamborghini, Porsche, Москвич): ");
            name = scanner.next();

            if (name.equals("Lamborghini") || name.equals("Porsche") || name.equals("Москвич")) {
                break;
            } else {
                System.out.println("Ошибка! Машина '" + name + "' не участвует в гонке.");
                System.out.println("Допустимые марки: Lamborghini, Porsche, Москвич");
            }
        }

        // Проверка скорости
        while (true) {
            System.out.println("— Введите скорость машины №" + carNumber + " (от 0 до 250): ");

            if (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("Это не число! Попробуйте ещё раз.");
                continue;
            }

            speed = scanner.nextInt();

            if (speed >= MIN_SPEED && speed <= MAX_SPEED) {
                break;
            } else {
                System.out.println("Скорость должна быть от " + MIN_SPEED + " до " + MAX_SPEED);
            }
        }
    }

}