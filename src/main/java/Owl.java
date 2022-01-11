public class Owl extends Animal{
    private int wingspan;
    private boolean isHungry;
    private int age;

    public Owl(int wingspan, boolean hungry, int age){
        this.wingspan = wingspan;
        this.isHungry = hungry;
        this.age = age;
    }
    public boolean eat (int nrOfSquirrels) {
        if (nrOfSquirrels > 0 && isHungry ) {
            return true;
        }
        return false;
    }

}
