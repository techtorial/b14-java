package accessModifier;

public class Animal {

    public String namePublic;
    protected String colorProtected;
    private int agePrivate;
    double weightDefault;


    public void eatPublic() {
        System.out.println("eating in public");
    }

    protected void eatProtected() {

        System.out.println("eating protected");
    }

    private void eatPrivate() {
        System.out.println("eating in private");
    }

    void eatDefault() {
        System.out.println("eating by default");

    }

    public static void main(String[] args) {

        Animal a = new Animal();
        a.eatPrivate();
    }

}
