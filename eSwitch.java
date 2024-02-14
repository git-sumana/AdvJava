enum Status{
    Running, Failed, Success;
}
public class Main {
    
    public static void main(String[] args){
        
        Status r= Status.Running;
        
        switch(r){
            case Running:
                System.out.println("It is r");
                break;
            case Failed:
                System.out.println("It is f");
                break;
            case Success:
                System.out.println("It is s");
                break;
            default:
                System.out.println("It is not");
        }
        
    }
}