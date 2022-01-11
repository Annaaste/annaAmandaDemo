public class Squirrel extends Animal {
    private int weight;
    private int numOfConesInNest;
    private int age;
    private boolean isHungry;

    Squirrel(int weight, int numOfConesInNest, int age, boolean isHungry) {
        this.weight = weight;
        this.numOfConesInNest = numOfConesInNest;
        this.age = age;
        this.isHungry = isHungry;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setNumOfConesInNest(int numOfConesInNest) {
        this.numOfConesInNest = numOfConesInNest;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(boolean isHungry) {
        this.isHungry = isHungry;
    }

    public int getWeight() {
        return weight;
    }


    public int getNumOfConesInNest() {
        return numOfConesInNest;
    }

    public int getAge() {
        return age;
    }

    public boolean getIsHungry() {
        return isHungry;
    }

    public boolean eat() {
        if (numOfConesInNest > 0 && isHungry) {
            numOfConesInNest--;
            System.out.println("Ekorren äter en kotte och har " + numOfConesInNest + " kvar");
            return true;
        }
        return false;
    }
}








