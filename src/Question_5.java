import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {
        /*
0 ile 100 arası puanlama
50 den dusuk ise D
50 ile 70 arası ise C
70  ie 85 arası ise B
daha yukarıs ise A
notlar 100 e kadar
kullanıcı dan not girisi alınacak
in : 80
output : B
 */
        System.out.print("Bir sayı giriniz:");
        Scanner scanner=new Scanner(System.in);
        int puan=scanner.nextInt();

            if(puan>=0 && puan<50){
                System.out.print("Puanınız:D");
            }
            else if(puan>=50 && puan<70){
                System.out.print("Puanınız:C");
            }
            else if(puan>=70 && puan<85){
                System.out.print("Puanınız:B");
            }
            else if(puan>=85 && puan<=100){
                System.out.print("Puanınız:A");
            }else{
                System.out.print("Sonuc bulunamadı.");
            }


        }

    }
