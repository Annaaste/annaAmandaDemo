import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Squirrel>squirrels = populateTreeSquirrels();
        boolean hungry = (Math.random() < 0.5);
        Owl owl1 = new Owl(3, hungry, 1, 2);
        int nrOfCones = (int)(Math.random()*10);
        if (Math.random()<0.5){ //om uggla i träd eller ej
            Tree tree1 = new Tree(squirrels, nrOfCones, null); //om ingen uggla, avbryt
        }else{
            Tree tree1 = new Tree(squirrels, nrOfCones, owl1);
        }
        //ett träd med 10 nötter och en tom lista

        //while alla eat och fall och så någon form av avbrott tex fall true
        //låt alla ekorrar försöka äta, alla lyckas inte random
        //låt ugglan försöka äta, också random
        //har trädet fallit? tre anledningar på skala
        //avbrottsvillkor: trädet fallit, inga ekorrar, ingen uggla(om osäkert uggla, måste ändra däruppe)
    }

    public static List<Squirrel> populateTreeSquirrels(){
        int randomNr = (int)(Math.random()*3 +1);
        List<Squirrel>squirrels = new ArrayList<Squirrel>();
        for (int i=1; i<randomNr; i++){
            Squirrel squirrel = new Squirrel(10, 1);
            squirrels.add(squirrel);
        }
        return squirrels;
    }
}
