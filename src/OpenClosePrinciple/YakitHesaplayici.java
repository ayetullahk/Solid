package OpenClosePrinciple;



public class YakitHesaplayici {
//    public static double hesapla(Mercedes arabaMercedes){
//        return arabaMercedes.tripKm*3; //mercedes km başı 3 dolar yakar
//    }
//    public static double hesapla(BMW arabaBMW){
//        return arabaBMW.tripKm*2; //BMW km başı 2 dolar yakar
//    }


    //üst tarafta bulunan metodlar gelişime kapalı ve değişimede açık hale gelmektedir
    // sürdürüle bilir olmadığından aşağıdaki gibi olmalıdır
    public static int hesapla(Araba araba){

        //yoruma alınan kötü koddur
//        int masraf=0;
//        if (araba.model=="BMW")masraf=araba.tripKm*araba.dolarPerKm;
//        if (araba.model=="Mercedes")masraf=araba.tripKm*araba.dolarPerKm;
        return araba.tripKm*araba.dolarPerKm;
    }
}
