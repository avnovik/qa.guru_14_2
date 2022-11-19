package guru.qa.hw1;

import static guru.qa.hw1.Invertebrata.whoHasTheMostTypes;
import static guru.qa.hw1.Invertebrata.whoIsTheSmallest;

public class MainInvertebrata {
    public static void main(String[] args) {
        Invertebrata loricifera = new Invertebrata("Loricifera", 0.5);
        loricifera.setHowManyTypes(80);
        Invertebrata tardigrada = new Invertebrata("Tardigrada", 1.5);
        tardigrada.setHowManyTypes(1000);

        System.out.println("The smallest invertebrate is " + whoIsTheSmallest(loricifera, tardigrada));
        whoHasTheMostTypes(loricifera,tardigrada);
    }
}
