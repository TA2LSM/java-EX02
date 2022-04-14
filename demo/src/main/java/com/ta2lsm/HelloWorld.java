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
        // System.out.printf("%b%n", null);     // %n ile \n aynı işi görüyor
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
        // String message1 = new String("Hello World!");
        // String message2 = " I'm \"Back...\"";   // \" ile string içinde " kullanılabildi.
        // System.out.printf("Msg#1: %s / Msg#2: %s%n", message1, message2);

        // String message3 = message1 + message2;  // message3 için alt metotlar artık kullanılabilir.
        // System.out.printf("Msg#3: %s%n", message3);
        // System.out.println(message3.endsWith("..."));   // true verir
        // System.out.println(message3.length());   // uzunluğunu verir
        // System.out.println(message3.indexOf("what"));   
        // // aranan string ya da karakterin indeksini döner (0'dan başlar) Eğer bulunamazsa -1 döner
        // System.out.println(message3.replace("!", "*"));  
        // bulunan değerleri (! olan hepsini) yenileri ile değiştirir (*) Değişiklik kalıcı değildir.
        // işlem sonucunu message3'e kaydetmedik !!! String'ler üzerinde yapılan değişiklikler
        // HER ZAMAN yeni string'ler döner. Bunları bir başka değişkene kaydetmezsek kaybolurlar.     

        // trim, toLowerCase, toUpperCase... vs değişik metotlar da var. Detayları araştırınız... 
        //System.out.println(message3.trim());
        // trim baştan ve sondan boşlukları atar. Aradaki boşluklara karışmaz.

        // Kaçınılması gereken karakterler
        // \n: new line, \t: tab, \
        // String message4 = "C:\\Windows\\system32";  // tek \ olarak kaydedilir.
        // System.out.println(message4);

        // Date dateNow = new Date(); // kodu yazarken bizim tarafımızdan bellek ayrılır, JRE tarafından bırakılır
        // System.out.println(dateNow);
        // Date date = new Date(-86_400_000L); // 1.1.1970'den beri ms olarak geçen zaman. Daha evveli için negatif yazılır
        // System.out.println(date);        

        // System.out.printf("%tT%n", date);
        // System.out.printf("hours %tH: minutes %tM: seconds %tS%n", date, date, date);
        // System.out.printf("%1$tH:%1$tM:%1$tS %1$Tp %1$tL %1$tN %1$tz %n", date);    // tp yazılırsa küçük harfle yazar
        
        // KISAYOL >> sout yazıp enter'a basınca >> System.out.println(); çıkıyor.
        
        //--- END OF REFERENCE DATA TYPES ----------------------

        // x değişse de y değişmez. (primitive data type)
        // byte x = 1; // bellekte x için alan ayrılır ve içeriği 1 olarak yazılır
        // byte y = x;
        // x = 2;
        // System.out.println(y);

        // // C'deki pointer'a benzer durum (reference data type)
        // // point1'deki x değişirse point2'deki x de değişir. (aynı alanı gösterdikleri için)
        // Point point1 = new Point(1, 1);
        // // bir bellek adresinde x ve y değerlerini tutan alan ayrılır. İçerikleri doldurulur.
        // // Ayrıca başka bir alanda point1 olarak yukarıda ayrılan alanın adresi tutulur.
        // // (point1 aslında pointer olarak kullanılıyor)
        // Point point2 = point1; // point2, point1'in de gösterdiği adrese eşitlenir. (reference)
        // point1.x = 2;
        // System.out.println(point2);

        //--- ARRAYS -------------------------------------------
        byte[] numbers = new byte[5];                   // zero initialized şekilde oluşturulur. Uzunluğu 5'tir.
        int[] numbers2 = {2, 3, 4, 1, 5};               // içeriği girilerek oluşturulur. Uzunluğu 5 olarak atanır ve değiştirilemez !!!
        String[] names = new String[3];                 // null olacak şekilde oluşturulur. Uzunluğu 3'tür.

        numbers[1] = 1;
        //numbers[10] = 5; // exception hatası oluşur. Çünkü hafızada numbers için 10. indeks yok

        System.out.println(numbers);                    // numbers dizisinin adresi basılır
        System.out.println(Arrays.toString(numbers));   // numbers dizisinin içeriği basılır

        System.out.println(numbers[1]);
        System.out.println(numbers2[2]);

        System.out.println(numbers2.length);
        System.out.println(Arrays.toString(numbers2));
        Arrays.sort(numbers2);
        System.out.println(Arrays.toString(numbers2));      

        System.out.println(Arrays.toString(names));     // names dizisinin içeriği basılır

        // [rows][columns] >> 2, 5
        int[][] numbers3 = { 
            {2, 3, 4, 1, 5},
            {6, 7, 8, 9, 0}
        };

        //2, 2, 3
        int[][][] numbers4 = { 
            { {2, 3, 5}, 
              {4, 1, 7}
            },
            { {7, 8, 3}, 
              {0, 9, 5}
            },
        };

        numbers4[0][1][2] = 6;  // 7'yi 6 olarak değiştirir
        System.out.println(Arrays.deepToString(numbers3));  // multi dimentional array basmak için
        System.out.println(Arrays.deepToString(numbers4)); 
        //------------------------------------------------------
    }

    //...
}
