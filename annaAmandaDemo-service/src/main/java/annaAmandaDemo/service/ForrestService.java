package annaAmandaDemo.service;
import annaAmandaDemo.domain.Owl;
import annaAmandaDemo.domain.PineTree;
import annaAmandaDemo.domain.Squirrel;
import java.util.ArrayList;

public interface ForrestService {
    public Owl createOwl(int wingSpan);

    public Squirrel createSquirrel(int age, String name);

    public PineTree createPineTree(int nrOfCones, int age, int height, ArrayList<Squirrel> squirrels, Owl owl);
}
