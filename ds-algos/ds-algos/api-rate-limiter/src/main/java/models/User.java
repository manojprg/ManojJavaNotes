package models;

public class User {

    private static String emailId;
    private static String name;

    public int getMAX_THRESHOLD() {
        return MAX_THRESHOLD;
    }

    public void setMAX_THRESHOLD(int MAX_THRESHOLD) {
        this.MAX_THRESHOLD = MAX_THRESHOLD;
    }

    private int MAX_THRESHOLD;

    public User(String emailId, String name, int MAX_THRESHOLD) {
        this.emailId = emailId;
        this.name = name;
        this.MAX_THRESHOLD = MAX_THRESHOLD;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        User.name = name;
    }

    public static String getEmailId() {
        return emailId;
    }

    public static void setEmailId(String emailId) {
        User.emailId = emailId;
    }

}

