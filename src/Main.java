import java.util.Scanner;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        int n;

        // kullanıcıdan kaç adet sayı gireceği bilgisi alınır
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç Tane sayı gireceksin = ");
        int elementNumber = input.nextInt();

        // listeler oluşturulur. birinci liste kullanıcının verdiği liste, ikinci liste kontrol etmek için oluşturulan liste
        int numberList[] = new int[elementNumber];
        int frequancyList[] = new int[elementNumber];

        // kullanıcıdan sayılar alınır
        for (int i = 0; i < elementNumber; i++) {

            System.out.print((i + 1) + ". Sayıyı giriniz: ");
            numberList[i] = input.nextInt();
        }

        System.out.println("Liste: " + Arrays.toString(numberList));
        // kullanıcıdan alınan liste dönülür
        int lookedNumber = 0;
        for (int i = 0; i < elementNumber; i++) {
            int a = 0;

            // liste tekrar dönülür ve sayıların daha önce bakılıp bakılmadığı kontrol edilir
            for (int j = 0; j < elementNumber; j++) {
                // daha önce bakılmadıysa a sayısı artırılır a değişkeni bir logic değişkenidir.
                if (numberList[i] == frequancyList[j]) {
                    a++;
                }
            }

            // a sıfırsa daha önce bakılmamıştır ve frekansı kontrol edilir
            if (a == 0) {
                int numberCounter = 0;
                for (int t = 0; t < elementNumber; t++) {
                    if (numberList[i] == numberList[t]) {
                        numberCounter++;
                    }
                }

                //bakuldıysa frequancy liste eklenir
                frequancyList[lookedNumber] = numberList[i];
                lookedNumber++;
                // çıktı verilir
                System.out.println(numberList[i] + " Sayısından " + numberCounter + " tane var ");
            }
        }
    }
}