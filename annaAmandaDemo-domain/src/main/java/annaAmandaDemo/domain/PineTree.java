package annaAmandaDemo.domain;

import java.util.ArrayList;

public class PineTree {
    private int nrOfCones;
    private int age;
    private int height;
    private ArrayList<Squirrel>squirrels;

    PineTree(int nrOfCones, int age, int height, ArrayList<Squirrel>squirrels, Owl owl) {
        this.nrOfCones = nrOfCones;
        this.age = age;
        this.height = height;
        this.squirrels = new ArrayList<Squirrel>();
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

    public ArrayList<Squirrel> getSquirrels() {
        return squirrels;
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

    public void setSquirrels(ArrayList<Squirrel> squirrels) {
        this.squirrels = squirrels;
    }

    public void setOwl(Owl owl) {
    }

    public boolean fall(int wind, int age, boolean lumberjack) {
        return lumberjack || (wind + age) > 5;
    }

}


