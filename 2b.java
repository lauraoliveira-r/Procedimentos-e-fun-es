import java.util.*;
class Main {
  public static int subtracao(int a, int b){
   return (a - b);
  }
  public static void main(String[] args){ 
  Scanner entrada = new Scanner(System.in);
  System.out.println("Digite o valor do primeiro numero:");
  int a =entrada.nextInt(); 
  System.out.println("Digite o valor do segundo numero:");
  int b =entrada.nextInt();
  System.out.println("A subtracao de " + a +"+" + b + " é " + subtracao(a, b));
  }
}