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
import java.net.SocketTimeoutException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;
  
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
        // byte[] numbers = new byte[5];                   // zero initialized şekilde oluşturulur. Uzunluğu 5'tir.
        // int[] numbers2 = {2, 3, 4, 1, 5};               // içeriği girilerek oluşturulur. Uzunluğu 5 olarak atanır ve değiştirilemez !!!
        // String[] names = new String[3];                 // null olacak şekilde oluşturulur. Uzunluğu 3'tür.

        // numbers[1] = 1;
        // //numbers[10] = 5; // exception hatası oluşur. Çünkü hafızada numbers için 10. indeks yok

        // System.out.println(numbers);                    // numbers dizisinin adresi basılır
        // System.out.println(Arrays.toString(numbers));   // numbers dizisinin içeriği basılır

        // System.out.println(numbers[1]);
        // System.out.println(numbers2[2]);

        // System.out.println(numbers2.length);
        // System.out.println(Arrays.toString(numbers2));
        // Arrays.sort(numbers2);
        // System.out.println(Arrays.toString(numbers2));      

        // System.out.println(Arrays.toString(names));     // names dizisinin içeriği basılır

        // // [rows][columns] >> 2, 5
        // int[][] numbers3 = { 
        //     {2, 3, 4, 1, 5},
        //     {6, 7, 8, 9, 0}
        // };

        // //2, 2, 3
        // int[][][] numbers4 = { 
        //     { {2, 3, 5}, 
        //       {4, 1, 7}
        //     },
        //     { {7, 8, 3}, 
        //       {0, 9, 5}
        //     },
        // };

        // numbers4[0][1][2] = 6;  // 7'yi 6 olarak değiştirir
        // System.out.println(Arrays.deepToString(numbers3));  // multi dimentional array basmak için
        // System.out.println(Arrays.deepToString(numbers4)); 
        //------------------------------------------------------

        //--- CONSTANTS ----------------------------------------
        // final float PI = 3.14F; // F koymazsak decimal olarak görür. C'deki "const" ifadesi yerine burada "final" kullanılıyor.
        // // PI = 1; dersek derleme hatası alırız.
        // // Ayrıca final değişkenlerin tüm harfleri büyük yazılır.

        // Scanner keyboardInput = new Scanner(System.in); // klavyeden veri girişi tanımlaması, out olsaydı terminale basacaktı
        // System.out.println("Yaricapi giriniz: ");
        // float radius = keyboardInput.nextFloat();       // 2,5 olarak virgülle giriş yapılması lazım
        // System.out.printf("Yaricap degeri: %.2f birim girildi.%n", radius);
        // keyboardInput.close();

        // float area = (float)(radius*radius) * PI;
        // NumberFormat formatter = new DecimalFormat("###,###.###");   // number formatting
        // System.out.printf("Dairenin hesaplanan alani: %.3f birim karedir.%n", area);
        // System.out.printf("Dairenin hesaplanan alani: %s birim karedir.%n", formatter.format(area));  
        //------------------------------------------------------

        //--- ARITHMETIC EXPRESSIONS ---------------------------
        // float result;
        // float result2;
        // double result3;

        // result = (float)(10/3);
        // System.out.println(result); 
        // // 3.0 değerini basar. result, "double" tipinden olsa da tür dönüşümünde sadece sonucu cast etmek
        // // yeterli değil. işleme girecek sayıları tür dönüşümüne (cast) sokmak gerekiyor.

        // result2 = (float)10 / (float)3;
        // System.out.println(result2); // 3.3333333 değerini basar
        // result3 = (double)10 / (double)3;
        // System.out.println(result3); // 3.3333333333333335 değerini basar
     
        // int x = 1;      // x = 1 olarak tanımlandı
        // int y = x++;    // y = x (1) olarak tanımlandı ve x bir arttırıldı yani 2 oldu (postfix ++)
        // int z = ++x;    // z = x + 1 olarak tanımlandı yani 3 oldu bu arada x de 3 oldu (prefix ++)
        // x -= 3;         // C'deki yazım tarzı burada da var. x = x - 3 olarak atanır.
        // System.out.printf("x: %d, y: %d, z: %d%n", x, y, z); // terminale 0, 1, 3 değerleri basılır.

        // int i = 10 + 3 * 2;     // önce çarpma yapılacak sonra toplama: 16
        // int j = (10 + 3) * 2;   // önce parantez içi yapılacak sonra çarpma: 26
        // // Öncelik sırası: (), * /, + -
        // System.out.printf("i: %d, j: %d%n", i, j);

        // // Implicit casting (automatic casting/converting)
        // // byte > short > int > long > float > double şeklinde otomatik dönüştürülür. Sıkıntı çıkmaz.
        // short k = 1;        // short 2 byte
        // int m = k + 2;      // int 4 byte. 4 byte içine 2 byte rahatça sığacağı için sorun yok.
        // //short n = m * 10;   // Tam tersi durumda type missmatch uyarısı verecektir.
        // System.out.println(m);

        // double o = 1.1;
        // double p = o + 2;   // int 2 değeri 2.0 şeklinde otomatik olarak dönüştürülür ve işlem yapılır.
        // System.out.println(p); 

        // // Explicit casting
        // int r = (int)o + 2;     // o = 1 olarak casting ediliyor.
        // System.out.println(r);

        // String s = "1";
        // String t = "1.25";

        // int q = Integer.parseInt(s) + 1;    // Short.parseShort(), Float.parseFloat(), ...vs de var.
        // float w = Float.parseFloat(t) + 1;
        // System.out.printf("q: %d, w: %f%n", q, w);
        //------------------------------------------------------


        //--- MATHEMATICAL OPERATIONS --------------------------
        // int result = Math.round(1.345F);
        // System.out.println(result);      // 1 değeri basılır

        // double result2 = Math.ceil(1.045F);     // verilen sayıdan büyük en küçük sayıyı döner
        // int result3 = (int)Math.floor(1.345F);   // verilen sayıdan küçük en küçük sayıyı döner
        // System.out.printf("result2: %f, result3: %d%n", result2, result3);

        // System.out.printf("En buyuk: %f,%n", Math.max(1.2684, 1.3458)); // verilen sayılardan büyüğünü döner
        // System.out.printf("En kucuk: %f,%n", Math.min(1.2684, 1.3458)); // verilen sayılardan küçüğünü döner
        
        // final float coeff = 2.45364F;   // 0- 100 aralığında istersek bunu 100 yapmak yeterli
        // System.out.printf("Rasgele Sayi: %f,%n",Math.random() * coeff); // random metodu 0-1 aralığında rasgele sayı üretir 
        //------------------------------------------------------


        //--- NUMBER FORMATTING --------------------------------
        // NumberFormat formatter = new DecimalFormat("$###,###.##");   // number formatting

        // Scanner keyboardInput = new Scanner(System.in); // klavyeden veri girişi tanımlaması
        // System.out.println("Ucreti giriniz: ");
        // long price = keyboardInput.nextLong(); 
        // keyboardInput.close();

        // System.out.printf("Girilen deger: %s%n", formatter.format(price));  


        // NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.UK);
        // String result = currency.format(1234567.891);   
        // // para birimine göre format oluşturur. Konum İngiltere seçildi. £ gösterilecek 
        // // Hindistan bile var ama Türkiye yok !!!
        // System.out.println(result);

        // NumberFormat percent = NumberFormat.getPercentInstance();
        // String result2 = percent.format(0.2335);    
        // //9700 için %970.000, 85 için %8.5, 850 için %85.000, 0.2335 için %23 basılır
        // System.out.println(result2);
        // System.out.println(NumberFormat.getPercentInstance().format(0.1));  
        // // direkt bu şekilde de olur: %10 Buna method chaining deniyor...
        //------------------------------------------------------

        //--- KLAVYEDEN VERI GIRISI ----------------------------
        // Scanner keyboardInput = new Scanner(System.in);
        // System.out.print("Enter your age: ");
        // byte age = keyboardInput.nextByte();
        // System.out.println("Hmm... You are " + age);    // byte olan age burada string'e otomatik çevriliyor
        // keyboardInput.close();

        // Scanner keyboardInput = new Scanner(System.in);
        // System.out.print("Enter your name: ");
        // //String name = keyboardInput.next();           // boşluk görene kadar girişi alır tüm isim için 2 kere bu işlem çağrılmalı
        // String name = keyboardInput.nextLine().trim();  // enter gelene kadar girişi alır. Olası boşlukları da temizledik
        // System.out.println("Nice to meet you " + name); // byte olan age burada string'e otomatik çevriliyor
        // keyboardInput.close();
        //------------------------------------------------------

        //--- 1.2. BOLUM PROJESI -------------------------------
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT_DIVIDER = 100;

        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("Principal: ");                // yıllık kazanç (100000)
        int principal = keyboardInput.nextInt();

        System.out.print("Annual Interest Rate: ");     // kredi faizi (3.92)
        float rate = keyboardInput.nextFloat() / ((float)MONTHS_IN_YEAR * (float)PERCENT_DIVIDER);  // monthly interest
        // Kursta bu kısmı aşağıdaki gibi yazmış:
        // float rate = keyboardInput.nextFloat() / PERCENT_DIVIDER / MONTHS_IN_YEAR;

        System.out.print("Period (Years): ");           // kredi geri ödeme süresi (30 yıl ama ay olarak kullanılacak)
        int months = keyboardInput.nextInt() * MONTHS_IN_YEAR;

        keyboardInput.close();

        /**
         * mortgage = principal * ( (rate x (1 + rate)^n) /  (1 + rate)^n - 1)
         * months: number of payments (Period * 12)
         * rate: Annual Interest Rate / (12 * 100)
         */

        // aylık ödemelerin hesaplanması (mortgage)

        // kursta aşağıdaki gibi yazıldı:
        // double mortgage = principal 
        //             * ( rate * (Math.pow((1 + rate), months)) )
        //             / ( Math.pow((1 + rate), months) - 1.0F );
              
        double mortgage = rate * (Math.pow((1 + rate), months));
        mortgage /= ( Math.pow((1 + rate), months) - 1.0F );
        mortgage *= principal;

        NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.printf("Mortgage: %s", currency.format(mortgage));
        //------------------------------------------------------
    }

    //...
}
