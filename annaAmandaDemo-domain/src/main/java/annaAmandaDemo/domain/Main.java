package annaAmandaDemo.domain;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        boolean hungryOwl = Math.random() < 0.5;
        boolean hungrySquirrel = Math.random() < 0.5;
        boolean lumberjack = Math.random() < 0.5;
        int nrOfCones = random.nextInt(100);
        int nrOfConesInNest = random.nextInt(5);
        int nrOfSquirrels = random.nextInt(20);
        int wind = (int) (Math.random() * 3 + 1);
        int age = (int) (Math.random() * 3 + 1);
        ArrayList<Squirrel> squirrels = new ArrayList<Squirrel>();
        Squirrel squirrel = new Squirrel(1, nrOfConesInNest, 1, hungrySquirrel);

        Owl owl = new Owl(3);
        PineTree pineTree = new PineTree(nrOfCones, age, 3, squirrels, owl);

        System.out.println("vind av 3: " + wind + ".\n" +
                "trädets ålder av 3: " + age + ".\n" +
                "finns en skogshuggare? " + lumberjack);
        System.out.println("faller trädet? " + pineTree.fall(wind, age, lumberjack));
        if (pineTree.fall(wind, age, lumberjack)) {
            System.out.println("trädet föll, här äts inget");
        } else {
            System.out.println("antal ekorrar: " + nrOfSquirrels + ".\n" +
                    "antal kottar i nest: " + nrOfConesInNest + "\n" +
                    "hungrig uggla? " + hungryOwl + ".\n" +
                    "hungrig ekorre? " + hungrySquirrel);

            System.out.println("äter ugglan? " + owl.eat(nrOfSquirrels, hungryOwl));
            System.out.println("äter ekorren? " + squirrel.eat(nrOfConesInNest, hungrySquirrel));
            System.out.println(owl.eat(squirrel, hungryOwl));
            System.out.println(squirrel.eat(nrOfConesInNest, hungrySquirrel));
        }


    }
}
