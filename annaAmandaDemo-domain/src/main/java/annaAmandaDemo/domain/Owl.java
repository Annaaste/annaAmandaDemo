package annaAmandaDemo.domain;

public class Owl extends Animal{
    private int wingspan;
    public static final int DEFAULT_WINGSPAN = 90;

    public Owl(int wingspan){
        this.wingspan = wingspan;
    }

    public void setWingspan(int wingspan) {
        if(wingspan >= 75 && wingspan <=110){
            this.wingspan = wingspan;  
        } else {
            this.wingspan = DEFAULT_WINGSPAN;
        }
    }

    public int getWingspan() {
        return wingspan;
    }

    @Override
    public boolean eat(Object food, boolean isHungry) {
        return food instanceof Squirrel && isHungry;
    }

}
