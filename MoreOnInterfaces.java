class Mac implements Pc{
    public void code(){
        System.out.println("I will code in Mac");
    }
}

class Windows implements Pc{
    public void code(){
        System.out.println("I will code faster in Windows");
    }
}

interface Pc{
    public void code();
}


class Dev{
    public void devApp(Pc m){
        m.code();
    }
}


public class Main {
    
    public static void main(String[] args){
        
        Pc mac=new Mac();
        Pc win=new Windows();
        Dev SD=new Dev();
        SD.devApp(win);
        
    }
}