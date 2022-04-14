// Hangi ana paket altında olacak buradan seçiliyor
package com.ta2lsm;

// Bir başka dosya import (C'deki include) edilirken bu şekilde yazılıyor.
// Gördüğüm kadarıyla ilgili dosyadaki metotlara direk adıyla erişiliyor.
// Yani aynı isimli bir metot bu dosya içinde de olsa çakışacak gibi gözüküyor.
// (PirimitiveSizes class'ı com.ta2lsm'yi kullandığı için)
//import static com.ta2lsm.PrimitiveSizes.*;

// Farklı paketler altında aynı isimli class'lar olabilir. (Mesela Date)
// Bu durumda bu metotlar ÇAKIŞMAZLAR !!!
// java.util.Date / java.util.Calendar alınmadı çünkü oradaki Date metodu
// istediğimiz gibi çalışmıyordu.
import java.util.*;
import java.awt.*;
  
/**
 * JAVA uygulamasına ait ana class
 */
public final class HelloWorld {
    /**
     * Uygulamaya özgü dışarıdan erişilemeyecek kodlar
     */
    private HelloWorld() {
        //...
    }

    /**
     * Buraya yazılanlar ilgili metodun açıklamaları olarak gözükecektir.
     * @param args The arguments of the program.
     */
     public static void main(String[] args) {  
         
        //--- PIRIMITIVE DATA TYPES ----------------------------
        // boolean isEligible = false;
        // byte age = 30;                      // JRE tarafından bellek ayrılır ve bırakılır
        // char letter = 'A';
        // long viewVount = 3_123_456_789L;    // büyük sayılarda her üç ondalık rakamı ayırmak için alt çizgi kullanılabilir. 
        // float price = 10.99F;

        // System.out.print(isEligible);       // sadece değer basılabilir. terminalde alt satıra GEÇMEZ!
        // System.out.println(age);            // sadece değer basılabilir. (print line)
        // System.out.println("Hello World!"); // sadece değer basılabilir. (print line)
        // System.out.printf("Value: %d / Size: %d%n", age, sizeof(age));  // sizeof metodunu kendimiz ekledik
        // System.out.printf("%,d%n", viewVount);  // basamak gruplayarak bastırma
        // System.out.printf("%.2f%n", price);
        // System.out.printf("Char value: %c%n", letter);
        
        /**
         * Biçimlendirme tipleri küçük ve büyük harfe göre çıktı da aynı şekilde küçük ya da büyük harf olarak yazılır.
         * b, B: Boolean
         * s, S: String (string reference data tipidir)
         * c, C: Character
         * d, D: Integer, long
         * e, E: Exponential
         * f, F: Float, double
         * 
         * Printf kullanımına ait birkaç örnek:
         *  */  
        // System.out.printf("%b%n", null);
        // System.out.printf("%B%n", false);
        // System.out.printf("%B%n", 5.3);
        // System.out.printf("%b%n", "random text");  
        // System.out.printf("%s / %S%n", "random text", "random text"); 
        // System.out.printf("%15s%n", "random text"); 
        // System.out.printf("%-15s%s%n", "random text", "Hello"); 
        // System.out.printf("%5.3s", "random text");
        // System.out.printf("%f%n", 5.1473);
        // System.out.printf("'%5.2f'%n", 5.1473); // aynı zamanda yuvarlayarak yazar
        // System.out.printf("'%5.2e'%n", 5.1473); // üstel olarak yazar

        //--- END OF PIRIMITIVE DATA TYPES ---------------------

        //--- REFERENCE DATA TYPES -----------------------------
        // Java'da string, bir class olarak ele alınıp tanımlanmış. (ilk harfi büyük) Normalde java.lang içinde
        // ama import gerekmiyor çünkü otomatik olarak zaten import ediliyor.
        // String tanımlaması, aynı aşağıdaki date örneğindeki gibi referans tanımlama şeklinde yapılmalı fakat
        // klasik yöntem de kabul ediliyor. (kolay yöntem)
        String message1 = new String("Hello World!");
        String message2 = " I'm Back...";
        System.out.printf("Msg#1: %s / Msg#2: %s%n", message1, message2);

        String message3 = message1 + message2;  // message3 için alt metotlar artık kullanılabilir.
        System.out.printf("Msg#3: %s%n", message3);
        System.out.println(message3.endsWith("..."));   // true verir
        System.out.println(message3.length());   // uzunluğunu verir

        Date dateNow = new Date(); // kodu yazarken bizim tarafımızdan bellek ayrılır, JRE tarafından bırakılır
        System.out.println(dateNow);
        Date date = new Date(-86_400_000L); // 1.1.1970'den beri ms olarak geçen zaman. Daha evveli için negatif yazılır
        System.out.println(date);        

        // System.out.printf("%tT%n", date);
        // System.out.printf("hours %tH: minutes %tM: seconds %tS%n", date, date, date);
        // System.out.printf("%1$tH:%1$tM:%1$tS %1$Tp %1$tL %1$tN %1$tz %n", date);    // tp yazılırsa küçük harfle yazar
        
        // KISAYOL >> sout yazıp enter'a basınca >> System.out.println(); çıkıyor.
        
        //--- END OF REFERENCE DATA TYPES ----------------------

        // x değişse de y değişmez. (primitive data type)
        byte x = 1; // bellekte x için alan ayrılır ve içeriği 1 olarak yazılır
        byte y = x;
        x = 2;
        System.out.println(y);

        // C'deki pointer'a benzer durum
        // point1'deki x değişirse point2'deki x de değişir. (aynı alanı gösterdikleri için)
        Point point1 = new Point(1, 1);
        // bir bellek adresinde x ve y değerlerini tutan alan ayrılır. İçerikleri doldurulur.
        // Ayrıca başka bir alanda point1 olarak yukarıda ayrılan alanın adresi tutulur.
        // (point1 aslında pointer olarak kullanılıyor)
        Point point2 = point1; // point2, point1'in de gösterdiği adrese eşitlenir. (reference)
        point1.x = 2;
        System.out.println(point2);
    }
}
