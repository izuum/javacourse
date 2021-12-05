package day12.Task1;


import java.util.ArrayList;
import java.util.List;

public class task1 {
    public static void main(String[] args) {
        List<String> auto = new ArrayList<>();
        auto.add("BMW");
        auto.add("Lada");
        auto.add("Mercedes");
        auto.add("Audi");
        auto.add("Kia");
        System.out.println(auto);

        auto.add(2, "GMC");
        auto.remove(0);
        System.out.println(auto);
    }
}
