package day7.classes;

public class Player {
    private int stamina = 0;
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    static int countPlayers = 0;

    public int getStamina(){
        return stamina;
    }
    public static int getCountPlayers(){
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
        }else if (stamina > MIN_STAMINA){
            System.out.println("Игроку нужен отдых");
            countPlayers--;
        }
    }
    public static void info(){
        if (countPlayers < 6 & countPlayers >= 0){
            System.out.printf("Команды неполные. На поле еще есть %d свободных мест\n", 6 - countPlayers);
        }else{
            System.out.println("На поле нет свободных мест");
        }
    }
}
