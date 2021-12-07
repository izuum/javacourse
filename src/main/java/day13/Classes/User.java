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
        this.subscriptions.add(user);
    }
    public boolean isSubscribed(User user){
        return this.subscriptions.contains(user);
    }
    public boolean isFriend(User user){
        return this.isSubscribed(user) && user.isSubscribed(this);
    }
    public void sendMessage(User user, String text){
        MessageDatabase.addNewMessages(this, user, text);
    }
    @Override
    public String toString() {
        return name;
    }
}
