package LiskovSubstitutionPrinciple;

public class BMW extends Araba{
    public void go(){
        System.out.println("BMW gidiyor");
    }
    public void stop(){
        System.out.println("BMW duruyor");
    }

    @Override
    public void sendSMS() {
        super.sendSMS();
    }

}
