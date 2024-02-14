import java.lang.*;
enum Lap{
    Mac(2000), Xps(1500), ThinkPad(1200);
    private int price;
    
    private Lap(int price){
        this.price=price;
    }
    
    public int getPrice(){
        return price;
    }
    
    public void setPrice(int price){
        this.price=price;
    }
}
public class GetSettersEx {
    
    public static void main(String[] args){
        
        Lap m=Lap.Mac;
        Lap x=Lap.Xps;
        Lap t=Lap.ThinkPad;
        m.setPrice(2200);
        System.out.println(m.getPrice());
        System.out.println(x.getPrice());
        System.out.println(t.getPrice());
        
        for(Lap l: Lap.values()){
            System.out.println(l + " " +l.getPrice());
        }
        
    }
}