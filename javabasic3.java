import java.util.Scanner;

public class javabasic3{
  public static void main(String[] args) {

    System.out.println("Membuat Segitiga");

        Scanner userInput = new Scanner(System.in);
        System.out.println("Masukan tinggi segitiga");
        int tinggi = userInput.nextInt();
  
          System.out.println("\n Tinggi segitiga = " + tinggi +"\n");
          for (int i = 1; i <= tinggi; i++) {
              for (int j = tinggi; j >= i; j--) {
                  System.out.print(" ");
              }
              for (int j = 1; j <= i; j++) {
                  System.out.print("* ");
              }
              System.out.println();
          }
  }
}
