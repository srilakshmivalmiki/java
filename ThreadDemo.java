class A extends Thread {
public void run() {
for (int i=1;i<=5;i++) { 
System.out.println("Thread A...i="+i);
}
System.out.println("Exit from Thread A:Execution over");
}
}
class B extends Thread {
public void run() {
for (int i=11;i<=15;i++) {
System.out.println("Thread B...i="+i);
}
System.out.println("Exit from Thread B:Execution over");
}
}
public class ThreadDemo {
public static void main(String args[]) {
A thread_a=new A();
B thread_b=new B();
thread_a.start();
thread_b.start();
new A().start();
new B().start();
}
}