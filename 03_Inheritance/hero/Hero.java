package hero;

public class Hero {
    //fields
    private String username;
    private int level;

    //constructor
    public Hero(String username, int level) {
        this.setUsername(username);
        this.setLevel(level);
    }

    //methods
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return String.format("Type: %s Username: %s Level: %s",
                this.getClass().getName(),
                this.getUsername(),
                this.getLevel());
    }
}
