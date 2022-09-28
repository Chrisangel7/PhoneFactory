public class Phone {
    private String brand;
    public int year;
    public double storage;

    public String getBrand(){
        return brand;
    }
    public void setBrand(String samsung){

        brand = samsung;
    }


    public Phone(String brand, int year, double storage ){

        this.brand=brand;
        this.year=year;
        this.storage=storage;


    }
    public void PrintInfo(){
        System.out.println(brand + " brand ");
        System.out.println("Released "+year);
        System.out.println(storage + "GB of Storage");

    }

}
