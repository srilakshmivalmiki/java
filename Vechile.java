interface Vechile {
public void vechileInfo();
}
interface Car {
public void carInfo();
}
class Ferrari implements Vechile,Car {
public void vechileInfo() {
System.out,println("I am a Vechile");
}
public void carInfo() {
System.out.println("I am a Car");
}
a thread_a=new A();
B thread_b=new B();
thread_a.start();
thread_b.start();
new A().start();
new B().start();
}
}