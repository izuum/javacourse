package day5;

public class Task1 {
    public static void main(String[] args) {
        Car tesla = new Car();
        tesla.setModel("Tesla X");
        tesla.setColor("Black");
        tesla.setYear(2021);
        System.out.printf("Поздравляем!!! Вы приобрели %s, %s цвета, %d года выпуска!!!", tesla.getModel(), tesla.getColor(), tesla.getYear());
    }
}

