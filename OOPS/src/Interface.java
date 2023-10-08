interface Animals {
    public void walk();
}
class Horse implements Animals{
    public void walk(){
        System.out.println("walks on 4 feet");
    }
}
public class Interface {
    public static void main(String[] args){
        Horse h1 = new Horse();
        h1.walk();
    }
}
