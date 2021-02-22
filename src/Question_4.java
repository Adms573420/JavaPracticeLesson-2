import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        /*
Baslangıc ve bitis arasndaki
tum sayıların toplamını bulan program
start:3
end: 7
outpu: 25
 */
        System.out.print("Baslangıc:");
        Scanner scanner=new Scanner(System.in);
        int sayı_1= scanner.nextInt();

        System.out.print("bitis:");
        int sayı_2 =scanner.nextInt();
        int toplam=0;


        for(int i=sayı_1; i<=sayı_2; i++){
            toplam= toplam+i;
        }
        System.out.println("Sayıların toplamı: "+toplam);

    }
}
