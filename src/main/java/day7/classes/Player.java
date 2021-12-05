package day7.classes;

public class Player {
    private int stamina;
    public static final int MAX_STAMINA = 10;
    public static final int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    public int getStamina(){
        return stamina;
    }
    public int getCountPlayers(){
        return countPlayers;
    }

    public Player(int stamina){
        this.stamina = stamina;
        if (countPlayers<6){
            countPlayers++;
        }

    }

    public void run(){
        if (stamina>MIN_STAMINA){
            stamina--;
        }else{
            System.out.println("Игроку нужен отдых");
            countPlayers--;
        }
    }
    public static void info(){
        if (countPlayers < 6 & countPlayers >= 0){
            System.out.printf("Команды неполные. На поле еще есть %d свободных мест\n", (6-countPlayers));
        }else{
            System.out.println("На поле нет свободных мест");
        }
    }
}
