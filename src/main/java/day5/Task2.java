package day5;

public class Task2 {
    public static void main(String[] args) {
        Motorbike yamaha = new Motorbike("Yamaha R1", "Yellow", 1995);
        System.out.printf("Это мотоцикл %s, %s цвета, %d года выпуска", yamaha.getModel(), yamaha.getColor(), yamaha.getYear());
    }
}

