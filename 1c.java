import java.util.*;
class Main {
  public static double media(double a, double b, double c){
    return (( a + b + c) / 3);
  }
  public static void main(String[] args){ 
  Scanner entrada = new Scanner(System.in);
  System.out.println("Digite o valor do primeiro numero:");
  double a =entrada.nextInt(); 
  System.out.println("Digite o valor do segundo numero:");
  double b =entrada.nextInt();
  System.out.println("Digite o valor do terceiro numero:");
  double c =entrada.nextInt();
  System.out.println("A media desses numeros é:" + media(a, b, c));
  }
}