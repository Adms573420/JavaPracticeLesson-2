import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        /*
Baslangıc ve bitis arasndaki
tum 3 e bolunebilen sayıları yazdırın
start:4
end: 20
outpu: 6 9 12 15 18
 */
        System.out.print("Baslangıc:");
        Scanner scanner=new Scanner(System.in);
        int sayı_1= scanner.nextInt();

        System.out.print("bitis:");
        int sayı_2 =scanner.nextInt();
        for(int i=sayı_1; i<sayı_2; i++){
            if(i % 3==0){
                System.out.print(i+" ");
            }
        }
    }
}
