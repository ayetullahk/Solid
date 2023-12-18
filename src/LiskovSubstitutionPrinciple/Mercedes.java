package LiskovSubstitutionPrinciple;

public class Mercedes extends Araba{
    public void go(){
        System.out.println("Mercedes gidiyor");
    }
    public void stop(){
        System.out.println("mercedes duruyor");
    }

    @Override
    public void sendSMS() {
        super.sendSMS();
    }

    @Override
    public void sendEmail() {
        super.sendEmail();
    }
}
