public class Squirrel {
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
}
