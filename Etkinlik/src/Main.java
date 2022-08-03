import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        //Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        //Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
        //Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.

        int heat;

        Scanner inp = new Scanner(System.in);
        System.out.print("Hava kaç derece : ");
        heat = inp.nextInt();

        if (heat < 5){
            System.out.println("Kayak yapabilirsiniz.");

        } else if (heat >= 5 && heat <= 15){
            System.out.println("Sinemaya gidebilirsiniz");
        } else if (heat >= 15 && heat <= 25){
            System.out.println("Piknik yapabilirsiniz.");

        } else if (heat > 25){
            System.out.println("Yüzmeye gidebilirsiniz.");

        }

    }
}