import java.util.Arrays;

public class Owl {
    private int wingspan;
    private boolean hungry;
    private int age;
    private Squirrel[] squirrels;

    public Owl(int wingspan, boolean hungry, int age, Squirrel[]squirrels){
        this.wingspan = wingspan;
        this.hungry = hungry;
        this.age = age;
        this.squirrels = Arrays.copyOf(squirrels, squirrels.length);
    }
}
