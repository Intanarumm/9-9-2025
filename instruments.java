public class instruments {
    private String name;
    private double price;

    public instruments (){
        name = "Kolintang";
        price = 20000;
    }
    //Constructor Parameter
    public instruments(String n, int prc) {
        name = n;
        price = prc;

    //Getter
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    
    //Setter
    public void setName(String n){
        name = n;
    }
    public void setPrice (double prc){
        price = prc;
    }
    public void print (){
        System.out.println("nama: " + name);
        System.out.println("Harga: " + price);

    }
    
}
