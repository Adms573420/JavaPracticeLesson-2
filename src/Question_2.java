import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        /*
Baslangıc ve bitis arasndaki
tum cift sayıları yazdırın
start:4
end: 10
outpu: 4 6 8 10
 */
        System.out.print("start:");
        Scanner scanner=new Scanner(System.in);
        int sayı_1= scanner.nextInt();

        System.out.print("end:");
        int sayı_2 =scanner.nextInt();

        for(int i=sayı_1; i<=sayı_2; i++){
            if(i % 2==0){
                System.out.println(i+" ");
            }

        }


    }
}
