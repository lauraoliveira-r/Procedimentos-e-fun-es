import java.util.*;
class Main {
  public static int maior(int a, int b){
  if (a>b){
    return (a);
  }
  else {
    return (b);
  }}
  public static void main(String[] args){ 
  Scanner entrada = new Scanner(System.in);
  System.out.println("Digite um número:");
  int a =entrada.nextInt(); 
  System.out.println("Digite outro número:");
  int b =entrada.nextInt();
   
  System.out.println("O maior numero é:" + maior(a,b));
  }
}