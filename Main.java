package pkg6_latihaninput;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       String nama;
       System.out.println("Nama \t: ");
       nama = input.nextLine();
       
       
       String alamat;
       System.out.print("Alamat \t: ");
       alamat = input.nextLine();
      
       int umur;
       System.out.print("Umur \t: ");
       umur = input.nextInt();
       
       
        System.out.println("===============");
        
        System.out.println(nama + " lahir di " + alamat + " berumur " + umur);
        
        
      
       
    }
    
}
