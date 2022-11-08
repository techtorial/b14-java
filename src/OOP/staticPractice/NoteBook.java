package OOP.staticPractice;

public class NoteBook extends Book {

    @Override
    public void read(){
        System.out.println("Notebook is reading");
    }


    public static void write(){

        System.out.println("Notebook is writing");
    }

    public static void main(String[] args) {

        NoteBook nb = new NoteBook();
        System.out.println( nb.page);
        System.out.println("------------");
        nb.page = 300;
        System.out.println(nb.page);

        System.out.println("---++++++!!!!-------");
        Book book1 = new Book();
        //  book1.page = 400;
        System.out.println(book1.page);

        Book book2 = new Book(999);

        System.out.println(   book2.page); //999
        System.out.println("============");

        System.out.println(   nb.getPage()  );
        System.out.println( book1.getPage()  );
        System.out.println(  book2.getPage() );
        book1.setPage(200);
        System.out.println(  book1.page);
        System.out.println("============");
        System.out.println(book2.page);

        book1.read(); // you are reading
        nb.read(); // notebook is reading

        book1.write();
        Book.write();

        nb.write();
        NoteBook.write();


    }

}
