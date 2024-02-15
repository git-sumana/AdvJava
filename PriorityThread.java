class A extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 3; i++) {
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
            for (int i = 0; i < 3; i++) {
                System.out.println("Second Thread");
                Thread.sleep(2000); 
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class PriorityThread {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        
        System.out.println(a.getPriority());
        
        a.setPriority(Thread.MAX_PRIORITY);
        System.out.println(a.getPriority());
        
        b.setPriority(Thread.MAX_PRIORITY - 1);
        System.out.println(b.getPriority());
        
        a.start();
        b.start();
        
        //priority doesnt change the order, it is to instruct the scheduler about the time
    }
}