public class Squirrel {
    public boolean isDead;
    public String name;
    private int numOfConesInNest;
    private int numOfEaten;
    private Tree tree;

    Squirrel(boolean isDead, String name, int numOfConesInNest, int numOfEaten, Tree tree){
        this.isDead = isDead;
        this.name = name;
        this.numOfConesInNest = numOfConesInNest;
        this.numOfEaten = numOfEaten;
        this.tree = tree;
    }

    public void setIsDead(boolean isDead) {
        this.isDead = isDead;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumOfConesInNest(int numOfConesInNest) {
        this.numOfConesInNest = numOfConesInNest;
    }

    public void setNumOfEaten(int numOfEaten) {
        this.numOfEaten = numOfEaten;
    }

    public void setTree(Tree tree) {
        this.tree = tree;
    }

    public boolean getIsDead() {
        return isDead;
    }

    public String getName() {
        return name;
    }

    public int getNumOfConesInNest() {
        return numOfConesInNest;
    }

    public int getNumOfEaten() {
        return numOfEaten;
    }

    public Tree getTree() {
        return tree;
    }

    public String toString() {
        String something = (this.name + " har " + this.numOfConesInNest +" kottar kvar och har ätit " + this.numOfEaten);
        return something;

    }

    public void eat() {
        if (numOfConesInNest > 0)
        {
            numOfConesInNest--;
            numOfEaten++;
            return;
        }

        isDead = true;
        Tree.aliveSquirrels--;
        Tree.starvedSquirrels++;
        System.out.println("Ekorre " + this.name + " svalt ihjäl. Antal kvar i trädet:" + Tree.aliveSquirrels);

    }

    }

}
