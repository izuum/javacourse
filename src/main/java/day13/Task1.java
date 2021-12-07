package day13;

import day13.Classes.User;
import static day13.Classes.MessageDatabase.showDialog;

public class Task1 {
    public static void main(String[] args) {
        User us1 = new User("Jora");
        User us2 = new User("Gena");
        User us3 = new User("Jeka");

        us1.sendMessage(us2, "Hello!");
        us1.sendMessage(us2, "How are you?");

        us2.sendMessage(us1, "Hi!");
        us2.sendMessage(us1, "Thanks, I'm fine!");
        us2.sendMessage(us1, "And you?");

        us3.sendMessage(us1, "Hi Jora!");
        us3.sendMessage(us1, "Where is my money?");
        us3.sendMessage(us1, "I'm wait...");

        us1.sendMessage(us3, "Whats up man!");
        us1.sendMessage(us3, "Ammmm....I give you later..");
        us1.sendMessage(us3, "Ok?");

        us3.sendMessage(us1, "I hate you, Jora");

        showDialog(us1, us3);

    }
}
