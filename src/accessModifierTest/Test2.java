package accessModifierTest;

import accessModifier.Animal;

public class Test2 {

    public static void main(String[] args) {
        Animal animal  = new Animal();

        animal.eatPublic();
        animal.namePublic = "Public";
    }
}
