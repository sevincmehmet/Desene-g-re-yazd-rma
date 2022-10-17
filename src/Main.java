import javax.print.DocFlavor;
import java.util.Scanner;

public class Main {

    /*Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın.
    Her çıkarma işlemi sırasında ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin.
    Yine her ekleme işleminde sayının son değerini ekrana yazdırın.*/

    static int besAzalt(int x){

        if (x <= 0) {
            return x;

        }else {
            System.out.print(x + " ");
            return besAzalt(x-5);
        }
    }
    static int besArttir(int ilk, int son) {

        if (ilk > son){
            return ilk;
        }else {
            System.out.print(ilk + " ");
            return besArttir(ilk+5, son);
        }
    }


    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Sayı gitiniz : ");
        int n = inp.nextInt();

        besArttir(besAzalt(n), n);
    }
}
