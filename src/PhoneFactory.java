import java.util.ArrayList;

public class PhoneFactory {

public Phone iPhone;
    public static void main(String[] args) {

        PhoneFactory myApp=new PhoneFactory();

        }
    public PhoneFactory(){

        iPhone = new Phone("iPhone", 2019, 64);
        iPhone.PrintInfo();
        iPhone.setBrand("samsung");
        System.out.println(iPhone.getBrand());

        ArrayList PhoneList = new ArrayList();
        PhoneList.add("Iphone");
        PhoneList.add("Samsung");
        PhoneList.add("Nokia");
        System.out.println(PhoneList);
        //System.out.println(iPhone.setBrand("8"));
    }

}
