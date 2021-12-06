package day13.Classes;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<User> subscriptions = new ArrayList<>();


    public User(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<User> getSubscriptions() {
        return subscriptions;
    }
    public void setSubscriptions(List<User> subscriptions) {
        this.subscriptions = subscriptions;
    }

    public void subscribe(User user){
        subscriptions.add(user);
    }
    public boolean isSubscribed(User user){

    }
    public boolean isFriend(User user){

    }
    public void sendMessage(User user, String text){

    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
