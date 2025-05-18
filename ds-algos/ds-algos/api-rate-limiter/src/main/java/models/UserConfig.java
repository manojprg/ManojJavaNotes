package models;

public class UserConfig {

    private List<User> users;

    // private int time  = 100 sec;
    public UserConfig(User user, int MAX_THRESHOLD) {
        this.user = user;
        this.MAX_THRESHOLD = MAX_THRESHOLD;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getMAX_THRESHOLD() {
        return MAX_THRESHOLD;
    }

    public void setMAX_THRESHOLD(int MAX_THRESHOLD) {
        this.MAX_THRESHOLD = MAX_THRESHOLD;
    }
}
