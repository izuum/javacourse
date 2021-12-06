package day11.Classes;

public class Courier implements Worker {
    private static final int SALARY_BONUS = 50000;
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;


    public int getSalary(){
        return salary;
    }
    public boolean getIsPayed(){
        return isPayed;
    }

    public String toString(){
        return "Курьер получает " + salary;
    }
    public Courier(Warehouse warehouse){
        this.salary = salary;
        this.isPayed = isPayed;
        this.warehouse = warehouse;
    }

    public void doWork(){
        salary += 100;
        warehouse.incrementDeliveredOrder();
    }
    public void bonus(){
        if(warehouse.getCountDeliveredOrders() < 10000){
            System.out.println("Бонус пока не доступен");
            return;
        }
        if (isPayed){
            System.out.println("Бонус уже был выплачен");
            return;
        }
        System.out.println("Поздравим сборщика, работник месяца получает бонус!!");
        salary+=SALARY_BONUS;
        isPayed = true;
    }
}
