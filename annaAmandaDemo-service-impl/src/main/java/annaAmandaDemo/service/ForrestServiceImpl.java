package annaAmandaDemo.service;
import annaAmandaDemo.domain.Owl;
import annaAmandaDemo.domain.PineTree;
import annaAmandaDemo.domain.Squirrel;

import java.util.ArrayList;

public class ForrestServiceImpl implements ForestService{

    public Owl createOwl(int wingspan){
        Owl owl = new Owl(wingspan);
        return owl;
    }

    @Override
    public Squirrel createSquirrel(int weight, int numOfConesInNest, int age, boolean isHungry) {
        return null;
    }

    @Override
    public PineTree createPineTree(int nrOfCones, int age, int height, ArrayList<Squirrel> squirrels, Owl owl) {
        return null;
    }
}
