package OOP.staticPractice;

public class Book {

    String title;
    String author;
    static int page = 500;


    public Book(int page) {
        this.page = page;
    }

    public Book() {
    }

    public int getPage() {
        return page;
    }


    public void setPage(int page) {

        this.page = page;
    }

    public void read(){

        System.out.println("You are reading");
    }

    public static void write(){
        System.out.println("You are writing");
    }
}
