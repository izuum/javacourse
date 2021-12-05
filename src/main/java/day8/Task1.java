package day8;

public class Task1 {
    public static void main(String[] args) {
        String count = "";
        StringBuilder sb = new StringBuilder(" ");
        long startTime = System.currentTimeMillis();
        for(int i = 0; i<=20000; i++){
            count = count + " " + i;
        }
        long stopTime = System.currentTimeMillis();
        System.out.println(count);
        System.out.println("Длительность работы, в мс:" + (stopTime-startTime));
        System.out.println();
        long startTime2 = System.currentTimeMillis();
        for(int i = 0; i<=20000; i++){
            sb.append(i).append(" ");
        }
        long stopTime2 = System.currentTimeMillis();
        System.out.println(sb.toString());
        System.out.println("Длительность работы: " + (stopTime2-startTime2));
    }
}
