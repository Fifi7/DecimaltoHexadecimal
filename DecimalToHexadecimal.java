
import java.util.Scanner;

public class DecimalToHexadecimal{

   public DecimalToHexadecimal(){

      Scanner user_input = new Scanner(System.in);
     int decimal,remainder;
     char[] hexaDecimal = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
     String hexaValue = "";
     System.out.print("Enter any number :");
     decimal = user_input.nextInt();

     while(decimal >0 ) {
     remainder = decimal % 16;
     hexaValue = hexaDecimal[remainder] + hexaValue;
     decimal = decimal/16;

  }
    System.out.println("Hexa value is :" + hexaValue);
}
    
  public static void main(String[] args) {
   
    DecimalToHexadecimal obj = new DecimalToHexadecimal();
    
}
}


