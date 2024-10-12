class Water_Bottle{
    String type;
    int price;

    public void PrintDetails(String type){
        this.type = type;
        System.out.println("THE TYPE OF THE WATER BOTTLE IS:"+type);
    }

    public void PrintDetails(int price){
        this.price = price;
        System.out.println("THE PRICE OF THE WATER BOTTLE IS:"+price);
    }
    public void PrintDetails(String type,int price){
        this.type=type;
        this.price=price;
        System.out.println("THE TYPE OF THE WATER BOTTLE IS:"+type+" AND THE PRICE IS:"+price);
    }


}



public class Compile_Time_Polymorphism {
    public static void main(String[] args) {
        Water_Bottle obj=new Water_Bottle();
        obj.type="PLASTIC";
        obj.price=60;
        obj.PrintDetails(obj.type);
        obj.PrintDetails(obj.price);
        obj.PrintDetails(obj.type, obj.price);
        
    }
    
}
