import java.util.*;
class Main {
  public static int multiplicacao(int a, int b){
  int somatorio, i;
  for (i=0; i<=b; i++){
  somatorio= somatorio+i;
  }
    return (somatorio);
  }
  public static void main(String[] args){ 
  Scanner entrada = new Scanner(System.in);
  System.out.println("Digite o valor do primeiro numero:");
  int a =entrada.nextInt(); 
  System.out.println("Digite o valor do segundo numero:");
  int b =entrada.nextInt();
  System.out.println( + a +"*" + b + " = " + multiplicacao(a, b));
  }
}