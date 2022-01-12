package annaAmandaDemo.domain;

public abstract class Animal {
    public int weight;
    public boolean hungry;
    public int age;

    public abstract boolean eat(Object food, boolean hungry);
}
