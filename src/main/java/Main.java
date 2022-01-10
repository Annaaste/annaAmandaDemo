import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        boolean hungryOwl = Math.random() < 0.5;
        boolean hungrySquirrel = Math.random() < 0.5;
        int nrOfCones = random.nextInt(100);
        int nrOfConesInNest = random.nextInt(5);
        int nrOfSquirrels = random.nextInt(20);
        System.out.println("antal ekorrar: " + nrOfSquirrels + ".\n" +
                "antal kottar i nest: " + nrOfConesInNest + "\n" +
                "hungrig uggla? " + hungryOwl + ".\n" +
                "hungrig ekorre? " + hungrySquirrel);

        ArrayList<Squirrel>squirrels = new ArrayList<Squirrel>();
        Squirrel squirrel = new Squirrel(1,nrOfConesInNest,1, hungrySquirrel);

        Owl owl = new Owl(3, hungryOwl, 1);
        PineTree pineTree = new PineTree(nrOfCones, 5 ,3, squirrels, owl);

        System.out.println("äter ugglan? " + owl.eat(nrOfSquirrels ));
        System.out.println("äter ekorren? " + squirrel.eat());



    }
}
