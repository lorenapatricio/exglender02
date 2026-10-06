import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Ex02 {
    public static void main(String[] args) {
     
     Scanner scanner = new Scanner(System.in);
     
  // Primeira Data:
      
      System.out.println("Digite o dia da primeira data");
      int diaA = scanner.nextInt();
      
      while (diaA<= 0 || diaA > 31) {
      System.out.println("Dia inválido, tente novamente");
      diaA = scanner.nextInt(); }
      
      System.out.println("Digite o mês da primeira data");
      int mesA = scanner.nextInt();
      
         while (mesA <= 0 || mesA >12) {
          System.out.println("Mês inválido, tente novamente.");
          mesA = scanner.nextInt(); }

      System.out.println("Digite o ano da primeira data");
      int anoA = scanner.nextInt();
      
      while (anoA <= 0) {
          System.out.println("Ano inválido, tente novamente");
          anoA = scanner.nextInt(); }
          
          LocalDate data1 = LocalDate.of(anoA, mesA, diaA);
          
          // Segunda data: 
      
      System.out.println("Digite o dia da segunda data");
      int diaB = scanner.nextInt();
      
      while (diaB <= 0 || diaB > 31) {
          System.out.println("Dia inválido, tente novamente");
          diaB = scanner.nextInt();
      }
      
      System.out.println("Digite o mês da segunda data");
      int mesB = scanner.nextInt();
      
         while (mesB <= 0 || mesB >12) {
          System.out.println("Mês inválido, tente novamente.");
          mesB = scanner.nextInt(); }
      
      System.out.println("Digite o ano da primeira data");
      int anoB = scanner.nextInt();
      
      while (anoB <= 0) {
          System.out.println("Ano inválido, tente novamente");
          anoB = scanner.nextInt(); }
          
          LocalDate data2 = LocalDate.of(anoB, mesB, diaB);
          
          LocalDate maior;
          LocalDate menor;

          if (data1.isBefore(data2)) {
          menor = data1;
          maior = data2; }
          
          else {
          menor = data2;
          maior = data1; }
          
          long dias = ChronoUnit.DAYS.between(menor, maior);
          
          System.out.println("A quantidade de dias entre a data mais antiga e a mais recente é: " + dias);
          
          scanner.close();
    }
}
