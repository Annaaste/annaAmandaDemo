package annaAmandaDemo.service;
import annaAmandaDemo.domain.Owl;
import annaAmandaDemo.domain.PineTree;
import annaAmandaDemo.domain.Squirrel;

import java.util.ArrayList;

public class ForrestServiceImpl implements ForrestService {
    public Owl createOwl(int wingspan){
        return new Owl(wingspan);
    }

    @Override
    public Squirrel createSquirrel(int age, String name) {
        return null; //"jag kan va snäll och anropa konstruktorn, men vill inte ge er mer huvudvärk"
    }

    @Override
    public PineTree createPineTree(int nrOfCones, int age, int height, ArrayList<Squirrel> squirrels, Owl owl) {
        return null;
    }
}
