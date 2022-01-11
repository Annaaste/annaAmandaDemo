public class Owl extends Animal{
    private int wingspan;
    //private boolean isHungry;
    private int age;

    public Owl(int wingspan, boolean hungry, int age){
        this.wingspan = wingspan;
        //this.isHungry = hungry;
        this.age = age;
    }
    @Override
    public boolean eat(Object food, boolean isHungry) {
        return food instanceof Squirrel && isHungry;
    }

}
