import java.util.ArrayList;
import java.util.Arrays;

public class Owl {
    private int wingspan;
    private boolean hungry;
    private int age;
    //private int nrOfSquirrels;

    public Owl(int wingspan, boolean hungry, int age){
        this.wingspan = wingspan;
        this.hungry = hungry;
        this.age = age;
    }
    public boolean eat (int nrOfSquirrels) {
        boolean isHungry = Math.random() < 0.5;
        if (nrOfSquirrels > 0 && isHungry ) {
            return true;
        }
        return false;
    }
}
