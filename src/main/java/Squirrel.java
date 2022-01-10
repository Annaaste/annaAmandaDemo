public class Squirrel {
<<<<<<< HEAD
        private int weight;
        private int numOfConesInNest;
        private int age;
        private int height;
=======
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
>>>>>>> fef9a2d7e66068e965faddc0a338b653545cc8ec

        Squirrel( int weight, int numOfConesInNest, int age, int height){
            this.weight = weight;
            this.numOfConesInNest = numOfConesInNest;
            this.age = age;
            this.height = height;
        }

        public void setWeight ( int weight){
            this.weight = weight;

        }

        public void setNumOfConesInNest ( int numOfConesInNest){
            this.numOfConesInNest = numOfConesInNest;
        }

        public void setAge ( int age){
            this.age = age;
        }

        public void setHeight ( int height){
            this.height = height;
        }

        public int getWeight () {
            return weight;
        }


        public int getNumOfConesInNest () {
            return numOfConesInNest;
        }

        public int getAge () {
            return age;
        }

        public int getHeight () {
            return height;
        }

        public void eat () {
            boolean isHungry = Math.random() < 0.5;
            if (numOfConesInNest > 0 && isHungry ) {
                System.out.println("Ekorren äter");
                numOfConesInNest--;
            } else {
                System.out.println("Ekorren äter inte! ");
            }
        }

>>>>>>> 1b3e78816ae85bdbf1d8f1363de7aa8b184f4452
}
