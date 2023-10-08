import java.util.Scanner;

class Student{
    String name;
    int age;

    void getInfo(){
        //this keyword refers to current instance of a class
        System.out.println("Student name is " + this.name);
        System.out.println("Student age is " + this.age);
    }
}

public class ClassesObjects {
    public static void main(String[] args){
        Student s1 = new Student();
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Name : ");
        String name = sc.nextLine();
        s1.name=name;

        System.out.println("Enter Age : ");
        int age = sc.nextInt();
        s1.age=age;

        s1.getInfo();
    }
}
