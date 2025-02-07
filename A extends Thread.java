class A extends Thread {
public void run() {
for (int i=1; i<=5; i++) {
System.out.println("Thread A...i="+i);
}
System.out.println("Exit from Thread A : Execution over");
}
}
class B extends Thread {
public void run() {
for(int i=11;i<=15;i++) {
System.out.println("Thread B...i="+i);
}
System.out.println("Exit from Thread B :Execution over");
}
}
public class ThreadDemo {
public static void main(String args[]) {
}
}
public class StopBlockDemo {
public static void main(String args[]) {
new A().start();
new B().start();
new C().start();
}
}
