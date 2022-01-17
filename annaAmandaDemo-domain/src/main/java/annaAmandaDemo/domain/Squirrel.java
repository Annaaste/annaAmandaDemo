package annaAmandaDemo.domain;

public class Squirrel extends Animal {
    private int weight;
    private int numOfConesInNest;
    private int age;
    private boolean isHungry;
    private String name;

    Squirrel(int weight, int numOfConesInNest, int age, boolean isHungry) {
        this.weight = weight;
        this.numOfConesInNest = numOfConesInNest;
        this.age = age;
        this.isHungry = isHungry;
    }
    public Squirrel(int age, String name){
        this.age = age;
        this.name = name;
    }
    public Squirrel(){}

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setNumOfConesInNest(int numOfConesInNest) {
        this.numOfConesInNest = numOfConesInNest;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setHeight(boolean isHungry) {
        this.isHungry = isHungry;
    }

    public int getWeight() {
        return weight;
    }
    public String getName() {
        return name;
    }
    public int getNumOfConesInNest() {
        return numOfConesInNest;
    }
    public int getAge() {
        return age;
    }
    public boolean getIsHungry() {
        return isHungry;
    }


    @Override
    public boolean eat(Object food, boolean isHungry) {
        Integer cones = (Integer) food;
        return food != null && isHungry && cones > 0;
    }
}








