package day11.Task1.Classes;

public class Picker implements Worker{
    private static final int SALARY_BONUS = 70000;
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
        return "Сборщик получает " + salary;
    }
    public Picker(Warehouse warehouse){
        this.salary = salary;
        this.isPayed = isPayed;
        this.warehouse = warehouse;
    }
    public void doWork(){
        salary+=80;
        warehouse.incrementPickedOrder();

    }
    public void bonus(){
        if (warehouse.getCountPickedOrders() < 10){
            System.out.println("Бонус пока не доступен");
            return;
        }
        if(isPayed){
            System.out.println("Бонус уже выплачен");
            return;
        }
        System.out.println("Поздравим сборщика, выплатим бонус!!");
        salary+=SALARY_BONUS;
        isPayed = true;
    }

}
