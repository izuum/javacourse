package day11.Task1;

import day11.Classes.Courier;
import day11.Classes.Picker;
import day11.Classes.Warehouse;
import day11.Classes.Worker;

public class Task1 {
    public static void main(String[] args) {
        Warehouse wh = new Warehouse();
        Picker pc = new Picker(wh);
        Courier cour = new Courier(wh);

        businessProccess(pc);
        businessProccess(cour);
        System.out.println(pc);
        System.out.println(cour);
        System.out.println(wh);
        System.out.println();


        Warehouse wh1 = new Warehouse();
        Picker pc1 = new Picker(wh1);

        businessProccess(pc1);
        System.out.println(pc1);
        System.out.println(wh1);

    }

    static void businessProccess(Worker worker){
        for (int i=0; i<100; i++){
            worker.doWork();
        }
        worker.bonus();



    }
}
