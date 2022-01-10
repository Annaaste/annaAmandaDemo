public class Squirrel {
    private int weight;
    private int numOfConesInNest;
    private int age;
    private int height;

    Squirrel(int weight, int numOfConesInNest, int age, int height) {
        this.weight = weight;
        this.numOfConesInNest = numOfConesInNest;
        this.age = age;
        this.height = height;
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

    public void setHeight(int height) {
        this.height = height;
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

    public int getHeight() {
        return height;
    }

    public void eat() {
        boolean isHungry = Math.random() < 0.5;
        if (numOfConesInNest > 0 && isHungry) {
            System.out.println("Ekorren äter");
            numOfConesInNest--;
        } else {
            System.out.println("Ekorren äter inte! ");
        }
    }
}








