import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int maxNrOfCones = 100;
        int maxNrOfSquirrels = 20;
        boolean hungryOwl = Math.random() < 0.5;
        int nrOfCones = random.nextInt(maxNrOfCones);
        int nrOfSquirrels = random.nextInt(maxNrOfSquirrels);
        Squirrel[] squirrels = new Squirrel[nrOfSquirrels];
        Owl owl = new Owl(3, hungryOwl, 1, squirrels);

        PineTree pineTree = new PineTree(nrOfCones, 5 ,3, squirrels, owl);
    }
}
