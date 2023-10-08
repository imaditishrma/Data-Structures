abstract class Animal{
    String name;
    public void walk(){

    }
}
class Horses extends Animal{
    public void walk(String name){
        System.out.println(name + " " +"walks on 4 legs");
    }
}
public class Abstraction {
    public static void main(String[] args){
        Horses h1 = new Horses();
        h1.walk("Tarzan");
    }
}
