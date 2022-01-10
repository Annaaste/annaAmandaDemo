import java.util.Arrays;

public class PineTree {
    private int nrOfCones;
    private int age;
    private int height;
    private Squirrel[] squirrels;
    private Owl owl;

    PineTree(int nrOfCones, int age, int height, Squirrel[] squirrels, Owl owl) {
        this.nrOfCones = nrOfCones;
        this.age = age;
        this.height = height;
        this.squirrels = Arrays.copyOf(squirrels, squirrels.length);
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getNrOfCones() {
        return nrOfCones;
    }

    public Squirrel[] getSquirrels() {
        return Arrays.copyOf(squirrels, squirrels.length);
    }


    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setNrOfCones(int nrOfCones) {
        this.nrOfCones = nrOfCones;
    }

    public Squirrel[] setSquirrels(Squirrel[] squirrels) {
        return Arrays.copyOf(squirrels, squirrels.length);
    }

    public void setOwl(Owl owl) {
        this.owl = owl;
    }


    public boolean fall(int wind, int age, boolean lumberjack) {
        if (lumberjack) {
            return true;
        }
        if (wind + age > 5) {
            return true;
        }
        return false;
    }
}
