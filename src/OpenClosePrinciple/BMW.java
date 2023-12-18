package OpenClosePrinciple;

public class BMW implements Araba {
    String model="BNW";
    int dolarPerKm=2;
    int tripKm=50; //kaç km yaptığını tutan değişken

    public void go(){
        System.out.println("BMW gidiyor");
    }
    public void stop(){
        System.out.println("BMW duruyor");
    }
}
