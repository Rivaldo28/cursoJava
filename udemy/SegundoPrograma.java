/*Calculara a rea de um triangulo*/
import java.util.*;
import java.util.Scanner;

public class SegundoPrograma{
  public static void main(String args[]){
    Scanner c = new Scanner(System.in);

    double base =0, altura=0, area=0;

    System.out.println("Bem-vindo ao sistema Risoftware");
    System.out.println("Digite a base:");
    base = c.nextDouble();
    System.out.println("Digite a altura:");
    altura = c.nextDouble();

    area = (base * altura) / 2;

    System.out.println("A area do triangulo é:"+area);
  }
}