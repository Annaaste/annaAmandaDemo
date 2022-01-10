public class Squirrel {
<<<<<<< HEAD
    private int nrOfConesInNest;
    private int weight;

    public Squirrel(int nrOfConesInNest, int weight){
        this.nrOfConesInNest = nrOfConesInNest;
        this.weight = weight;
    }

    public boolean Eat(){
        if(nrOfConesInNest>0){
            nrOfConesInNest --;
            weight = weight+1;
            if(weight > 5){
                return false;
            }
            return true;
        }
        return false;
    }
=======
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

>>>>>>> 1b3e78816ae85bdbf1d8f1363de7aa8b184f4452
}
