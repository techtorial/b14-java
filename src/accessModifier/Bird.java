package accessModifier;

public class Bird extends Animal{



    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eatPublic();
        animal.eatProtected();
        animal.eatDefault();

        Bird bird = new Bird();

        bird.eatDefault();
        bird.eatPublic();
        bird.eatProtected();
    }

}
