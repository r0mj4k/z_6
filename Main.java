import java.util.Scanner;
  
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n=0;
    for(int i=0;i<5;i++){
      int a = scanner.nextInt();
      if(a%3==0)
        n+=a;
    }
    System.out.println("Suma = " + n);
  }
}