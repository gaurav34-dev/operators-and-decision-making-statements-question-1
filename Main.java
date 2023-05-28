import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    //System.out.println("please enter a number");
    //Scanner s= new Scanner(System.in);
    while(true)
    {
    System.out.println("please enter a number");
    Scanner s= new Scanner(System.in);
    int a=s.nextInt();
    //int b=s.nextInt();
    if(a%5==0 && a%3==0)
    {
      System.out.println("Consultadd JAVA Training");
    }
    else if(a%3==0){
      System.out.println("Consultadd");
    }
    else if(a%5==0){
      System.out.println("JAVA Training");
    }
    }
}
}


//If a number is divisible by 5 it should print “JAVA Training” as a string
//If a number is divisible by 3 it should print “Consultadd” as a string
//If a number is divisible by both 3 and 5, it should print “Consultadd JAVA Training” as a string.