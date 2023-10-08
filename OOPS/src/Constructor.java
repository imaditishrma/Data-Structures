import java.util.Scanner;

class Employee{
    String name;
    int id;

    void getInfo(){
        System.out.println("Name : " + this.name);
        System.out.println("ID : " + this.id);
    }
    //Non-Parameterized Constructor
    Employee(){
        System.out.println("Non-parameterized Constructor Called");
    }

    //Parameterized Constructor
    Employee(String name, int id){
        this.name = name;
        this.id = id;
        System.out.println(name + " " + id);
        System.out.println("Parameterized Constructor Called");
    }

    //Copy Constructor
    Employee(Employee e3){
        this.name= e3.name;
        this.id= e3.id;
        System.out.println(name + " " + id);
        System.out.println("Copy Constructor Called");
    }


}
public class Constructor {
    public static void main(String[] args){
        Employee e1 = new Employee();
        Employee e2 = new Employee("Anvi", 22);


        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Name : ");
        String name = sc.nextLine();
        e1.name=name;

        System.out.println("Enter ID : ");
        int id = sc.nextInt();
        e1.id=id;

        e1.getInfo();

        Employee e3 = new Employee(e1);
    }
}
