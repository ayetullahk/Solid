package OpenClosePrinciple;

public class Mercedes implements Araba{
    String model="Mercedes";
    int dolarPerKm=3;
    int tripKm=50; //kaç km yaptığını tutan değişken


    public void go(){
        System.out.println("Mercedes gidiyor");
    }
    public void stop(){
        System.out.println("mercedes duruyor");
    }
}
