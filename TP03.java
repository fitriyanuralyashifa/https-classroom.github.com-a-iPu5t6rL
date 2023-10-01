import java.util.Scanner;
public class TP03 {
    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner (System.in);
        int jumlahPermen = input.nextInt();
        int jumlahTeman = input.nextInt();

        int jatahPermen = jumlahPermen / (jumlahTeman + 1);
        int sisaPermen = jumlahPermen % (jumlahTeman + 1);

        System.out.println(jatahPermen);
        System.out.println(sisaPermen);


    }
}
