
import java.util.Scanner;
class Main
  {
  public static void main(String[] args)  
    {
    
      Scanner scan = new Scanner (System.in);
    System.out.println("liczba x: ");
  
    int x=scan.nextInt();
      
      System.out.println("liczba potegi y: ");
    int y=scan.nextInt();
      int potega = (int)Math.pow(x, y);
      System.out.println(x+" podniesione do potegi "+y+" wynosi:\n"+potega);
 
        System.out.println();
       
      
      }
   
}