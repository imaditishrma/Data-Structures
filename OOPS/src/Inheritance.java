class Shape{
    String color;
    int sides;
}
class triangle extends Shape{
    public void area(int l, int h){
        System.out.println(0.5*l*h);
    }
}
class circle extends Shape{

}
public class Inheritance {
    public static void main(String[] args){
     triangle t1 = new triangle();
     t1.color="red";
     t1.area(5,4);

    }
}
