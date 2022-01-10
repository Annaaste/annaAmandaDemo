import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        boolean hungryOwl = Math.random() < 0.5;
        int nrOfCones = random.nextInt(100);
        int nrOfSquirrels = random.nextInt(20);
        System.out.println("antal ekorrar: " + nrOfSquirrels + ".\n" +
                "antal kottar: " + nrOfCones + ".\n" +
                "hungrig uggla? " + hungryOwl);

        ArrayList<Squirrel>squirrels = new ArrayList<Squirrel>();
        Owl owl = new Owl(3, hungryOwl, 1);
        PineTree pineTree = new PineTree(nrOfCones, 5 ,3, squirrels, owl);

        System.out.println("äter ugglan? " + owl.eat(nrOfSquirrels ));

    }
}
