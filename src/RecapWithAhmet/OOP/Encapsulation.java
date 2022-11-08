package RecapWithAhmet.OOP;

public class Encapsulation {
    /*
    POSSIBLE INTERVIEW QUESTIONS:
       1-What is Encapsulation?Why do you use it?
       ->Encapsulation is a way to protect/hide/restrict data from third parties(other
       users,classes)
       ->We use "PRIVATE" key word to make the data encapsulated
       -->It is a way to make your data not accessible and manipulable by anyone
       -->It is a way of restriction the data from the users/classes
       -->It is a way to limit the users/classes to access the data from that class
       -->It is a way to hide the data from third party
       -->it is a way to protect your data from third party

       2-How can you access the data from encapsulation?
          -->To be able to access the data that encapsulated, you can use "GETTER" and "SETTER"

       3-If encapsulation is hiding the data from users/other classes and
       with getters and setter  they can still access it? what is the point of it?
           -->Actually you can access the data like you said, but you can make a
           specific implementation for specific condition to rectrict(limit)
           the users for your data accessibility.If you want me give an example
           SIR/MADAM, i can you say i have a book and this book has 300 pages
           i would like to access the specific pages between 0-300.With your Encapsulated
           methods,it should restrict users to put any number less than 0 more than 300
           it means they cannot manipulate your conditions/implementation.

     */
    private String name="Ahmet";
    private int age=31;
    String gender="Male";

    private void speak(){
        System.out.println("Speak");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!name.equals("Mehmet")){
            System.out.println("Wrong input");
        }else{
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<20 || age>100){
            this.age = age;
        }else{
            System.out.println("You are not on the age range");
        }

    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
