package accessModifier;

public class Test1 {

    public static void main(String[] args) {


        Animal animal = new Animal();

        animal.colorProtected = "red";
        animal.namePublic = "public";
        animal.weightDefault = 3.5;
        animal.eatDefault();
        animal.eatProtected();
        animal.eatPublic();


        ImmutablePractice cc = new ImmutablePractice();
        cc.getCardHolderName();

    }


}
