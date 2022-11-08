package accessModifierTest;

import accessModifier.Animal;

public class Bird extends Animal {

    public void abcd(){

        colorProtected = "abcd";
        eatPublic();
    }

    public static void main(String[] args) {
        Animal animal = new Animal();

        animal.eatPublic();
        animal.namePublic = "Public Animal";

        Bird bird = new Bird();

        bird.namePublic = "Public Bird";
        bird.colorProtected = "protected Color for Bird";
        bird.eatPublic();
        bird.eatProtected();


    }

}
