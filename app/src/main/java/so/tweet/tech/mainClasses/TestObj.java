package so.tweet.tech.mainClasses;

/**
 * Created by Thinkpad on 26-Jul-17.
 */

public class TestObj {
    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String name = "Abdullah";
    private int id = 31415;

    public TestObj() {
    }
    public String getName(){
        return this.name;
    }
}
