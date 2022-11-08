package OOP.Abstraction.AbstractClasses1;

public class StudentTest {

    public static void main(String[] args) {
       // Student student = new Student("Nancy", 123);  you cannot create an object from abstract class

        CampusStudent campusStudent = new CampusStudent("Aiza", 138);

        OnlineStudent onlineStudent = new OnlineStudent("Abd", 139);

        Student student = new CampusStudent("Nur", 140);

        campusStudent.tableTennis();

       // student.tableTennis();

        JrAlex jrAlex = new JrAlex("JrAlex", 150);
        Alex jr2 = new JrAlex("2",151);
        CampusStudent jr3 = new JrAlex("3",152);
        Student jr4 = new JrAlex("4", 154);

        jrAlex.play();
        jr2.play();

        jrAlex.eat();
        jr3.eat();

        jr4.eat();
        jr2.speak();




    }
}
