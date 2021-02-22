import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args) {
        /*
kullancıdan 4 haneli bir sayı alın
rakamları toplamını bulan program
1234
10
 */
        System.out.print("4 haneli bir sayı giriniz:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int son, toplam = 0;

        for (int i = 0; i < 4; i++) {
            son = num % 10;
            num = (num - son) / 10;

            toplam += son;
        }
        System.out.print(toplam);


    }

}
