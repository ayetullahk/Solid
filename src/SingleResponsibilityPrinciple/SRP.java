package SingleResponsibilityPrinciple;

//SRP sınıfıın görevi müşteriye bilgi mesajlarının iletilmesi
public class SRP {//3 farklı yol : E-mail/telefonsms/kargo
//    public static void sendInfo(){
//        // --> email  gönderimi ile ilgili kod kısmı
//
//        // --> sms  gönderimi ile ilgili kod kısmı
//
//        // --> kargo  gönderimi ile ilgili kod kısmı
//    }

    //yukarıda örnekte oluşturulan metod perensiplere aykırıdır
    //çünkü bir metod yanlızca bir görev üstlenmeli birden fazla
    //göref yapmamalı olması gereken aşağıdaki gibidir

    public static void sendSMSInfo() {
        // --> sms  gönderimi ile ilgili kod kısmı

    }

    public static void sendEmailInfo() {
        // --> email  gönderimi ile ilgili kod kısmı

    }

    public static void sendCargoInfo() {
        // --> kargo  gönderimi ile ilgili kod kısmı

    }


}
