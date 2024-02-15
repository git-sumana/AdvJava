/*class A implements Runnable {
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

class B implements Runnable {
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
}*/

public class MultiThreadWithLambda {
    public static void main(String[] args) {
        Runnable a = () ->
        {
            
            for (int i = 0; i < 3; i++) {
                System.out.println("First Thread");
                try {Thread.sleep(1000); }catch (Exception e) {e.printStackTrace();}
            }
        };
        Runnable b = () ->
         {
             for (int i = 0; i < 3; i++) {
                System.out.println("Second Thread");
                try {Thread.sleep(1000); }catch (Exception e) {e.printStackTrace();}
            }
        };
        
        Thread t1=new Thread(a);
        Thread t2=new Thread(b);
        
        t1.start();
        t2.start();
    }
}