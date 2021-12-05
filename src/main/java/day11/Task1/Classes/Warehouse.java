package day11.Task1.Classes;

public class Warehouse {
    private int countPickedOrders;
    private int countDeliveredOrders;

    public int getCountPickedOrders(){
        return countPickedOrders;
    }
    public int getCountDeliveredOrders(){
        return countDeliveredOrders;
    }

    public String toString(){
        return "Количество собранных заказов: " + countPickedOrders + "\n Количество доставленных заказов: " + countDeliveredOrders;
    }
    public void incrementPickedOrder(){
        countPickedOrders+=1;
    }
    public void incrementDeliveredOrder(){
        countDeliveredOrders+=1;
    }
}
