import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        /*
Kullanıcıddan baslangıc ve bitis degerlerini alalım
Bastan sona yazdıralım
baslangıc : 5
bitis: 12
output: 5 6 7 8 9 10 11 125

 */
        System.out.print("Başlangıç:");
        Scanner scanner=new Scanner(System.in);
        int sayı_1= scanner.nextInt();

        System.out.print("Bitiş:");
        int sayı_2 =scanner.nextInt();

        for(int i=sayı_1; i<=sayı_2; i++){
            System.out.println(i);
        }


    }
}
