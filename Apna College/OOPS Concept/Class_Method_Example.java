class Pen{
    String Color;
    int Price;
    String type;
    public void penDescription(){
        System.out.println("The Details of pen are "+"Color: "+Color+" Price: "+Price+" Type: "+type);
    }
}


public class Class_Method_Example {

    public static void main(String[] args) {
        Pen p = new Pen();
        p.Color = "Blue";
        p.Price = 10;
        p.type="Ballpoint";
        p.penDescription();
        Pen p1=new Pen();
        p1.Color="Red";
        p1.Price=20;
        p1.type="Roller";
        p1.penDescription();
        
    }
}