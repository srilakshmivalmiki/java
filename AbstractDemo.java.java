abstract class Fruit {
abstract void fruitInfo();
}
class Mango extends Fruit{
void fruitInfo(){
System.out.println("My name is Mango.I am a fruit");
}
}
class Apple extends Fruit {
void fruitInfo(){
System.out.println("My name is Apple.I am a fruit");
}
}
public class AbstractDemo {
public static void main(String args[]){
Mango m=new Mango();
Apple a=new Apple();
m.fruitInfo();
a.fruitInfo();
}
}
