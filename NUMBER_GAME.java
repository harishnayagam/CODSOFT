import java.util.Scanner;
import java.util.Random;
class RandomNumberGuess{
  public static void main(String[] args) {
    System.out.println("What is your name");
    Scanner scan=new Scanner(System.in);
    String name=scan.nextLine();
    System.out.println("Well," + name + " ,I think a number between 1 to 100");
    
    int myNumber=getRandomNumber(1, 101);
    for (int i=0; i<6; i++) {
      System.out.println("Take a guess");
      Scanner scan2=new Scanner(System.in);
      int yourGuess=scan2.nextInt();
      if(myNumber==yourGuess){
        System.out.println("Your Guess is Correct");
        break;
      }
      else if (myNumber<yourGuess) {
        System.out.println("Your Guess is Too High");
      }else if(myNumber>yourGuess){
        System.out.println("Your Guess is Too Low");
      }
      if(i>=5){
        System.out.println();
        System.out.println("Nope.The Number I think was "+myNumber+" !");
      }
    }
  }
  public static int getRandomNumber(int min,int max){
    Random random=new Random();
    return random.ints(min,max).findFirst().getAsInt();
  }
}