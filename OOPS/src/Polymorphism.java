import java.util.Scanner;

class Students{
    String name;
    int id;

    //Function overloading - Compile time polymorphism
    public void getInfo(String name){
        this.name=name;
        System.out.println("Student name is " + name);
    }

    public void getInfo(int id){
        this.id=id;
        System.out.println("Student id is " + id);
    }

    public void getInfo(String name, int id){
        this.name=name;
        this.id=id;
        System.out.println("Student name is " + this.name);
        System.out.println("Student id is " + this.id);
    }
}
public class Polymorphism {
    public static void main(String[] args){
        Students s1 = new Students();

        s1.getInfo("Anvi");
        s1.getInfo(45);
        s1.getInfo("Aditi", 51);
    }
}
