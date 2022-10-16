import java.util.*;
class Main {
  public static int somatorio(int a){
  int somatorio = 0, i;
  for (i=0; i<=a; i++){
  somatorio= somatorio+i;
  }
    return (somatorio);
  }
  public static void main(String[] args){ 
  Scanner entrada = new Scanner(System.in);
  System.out.println("Digite um numero:");
  int a =entrada.nextInt(); 
  System.out.println("A somatoria de 1 até " + a + "é " + somatorio(a));
  }
}