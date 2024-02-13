class A {
    public void show() {
        System.out.println("Inside A's show method");
    }

    class B {
        public void display() {
            System.out.println("Inside B's display method");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        A objA = new A();
        A.B objB = objA.new B();

        objA.show();
        objB.display();
    }
}
