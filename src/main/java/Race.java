// Race.java
public class Race {
    String winnerName = "";
    int maxSpeed = 0;

    void findWinner(Car[] cars) {
        // Проверяем, что массив не пустой
        if (cars == null || cars.length == 0) {
            System.out.println("Нет машин для гонки");
            return;
        }

        // Ищем машину с максимальной скоростью
        for (Car car : cars) {
            if (car.speed > maxSpeed) {
                maxSpeed = car.speed;
                winnerName = car.name;
            }
        }

        if (maxSpeed == 0) {
            winnerName = "Нет победителя";
        }
    }

    void printResult() {
        System.out.println("Самая быстрая машина: " + winnerName + " (скорость " + maxSpeed + ")");
    }
}