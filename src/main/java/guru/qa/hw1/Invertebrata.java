package guru.qa.hw1;

public class Invertebrata {
    private String type;
    private int howManyTypes;
    private double size;

    public Invertebrata(String type, double size) {
        this.type = type;
        this.size = size;
    }

    public void setHowManyTypes(int howManyTypes) {
        this.howManyTypes = howManyTypes;
    }

    static String whoIsTheSmallest(Invertebrata type1, Invertebrata type2) {
       if (type1.size == type2.size) {
           return "NOBODY";
       } else {
           return (type1.size < type2.size) ? type1.type : type2.type;
       }
    }

    static void whoHasTheMostTypes(Invertebrata type1, Invertebrata type2){
        String text1 = "Most types is in: \"";
        String text2 = "\". They have ";
        String text3 = " types.";
        if (type1.howManyTypes == type2.howManyTypes) {
            System.out.println("NOBODY!!!");
        } else {
            if ((type1.howManyTypes > type2.howManyTypes)) {
                System.out.println(text1 + type1.type + text2 + type1.howManyTypes + text3);
            } else {
                System.out.println(text1 + type2.type + text2 + type2.howManyTypes + text3);
            }
        }
    }

}
