package InterfaceSegregationPrinciple;

public interface Araba {
    public void go();
    public void stop();
    public void sms();
//    public void email();
}
/**
 * Bu prensip te interface de tanımlanan özelliklerin tamamı implement edilmeli
 * ama buradaki olay örgüsünde mercedes email özelliğini istemediği için
 * ve bu özellik içinde bmw class ının istendiği var sayılınca email metodu için
 * 2. bir interface oluşturulmalı Bmw classına implement edilmeli
 */

