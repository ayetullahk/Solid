package LiskovSubstitutionPrinciple;

public class Runner {
    public static void main(String[] args) {
        BMW bmw=new BMW();
        bmw.sendEmail();
    }
}

/*
* bu perensipte base sınıfın bütün medotlarını kullanmak zorundadır
* fakat bu olay ögrüsünde bmw sınıfı email metodunu istemese dahi
* runner sınıfında yukarıda göründüğü gibi erişim sağlanılmıştır
* bu gibi sorun meydana gelmemesi için 2. bir base sınıfı yani Araba2 oluşturula bilir  */