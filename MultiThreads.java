class A extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("First Thread");
                Thread.sleep(1000); 
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class B extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Second Thread");
                Thread.sleep(2000); 
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.start();
        b.start();
    }
}