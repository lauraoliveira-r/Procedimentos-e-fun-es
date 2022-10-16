import java.util.*;
class Main {
  public static int fatorial(int a){
  int fat=1, i;
    for (i=1; i<=a; i++){  
  fat *= i;
 }
    return (fat);
  }
  public static void main(String[] args){ 
  Scanner entrada = new Scanner(System.in);
  System.out.println("Digite um numero para saber seu fatorial:");
  int a =entrada.nextInt(); 
  System.out.println(a +"! =" + fatorial(a));
  }
}