import java.util.Scanner;
import java.util.Random;
class RandomNumberGuess{
  public static void main(String[] args) {
    System.out.println("What is your name");
    Scanner scan=new Scanner(System.in);
    String name=scan.nextLine();
    System.out.println("Well," + name + " ,I think a number between 1 to 100");
    
    int myNumber=getRandomNumber(1, 101);
    for (int i=0; i<6; i++)
    {
      System.out.println("Take a guess");
      
      int yourGuess=scan.nextInt();
     
   
      if(myNumber==yourGuess){
        System.out.println("Your Guess is Correct");
        if(i==0){
          System.out.println("You get 6 points");
        }
        else if(i==1){
          System.out.println("You get 5 points");
        }
        else if(i==2){
          System.out.println("You get 4 points");
        }
        else if(i==3){
          System.out.println("You get 3 points");
        }
        else if(i==4){
          System.out.println("You get 2 points");
        }
        else{
          System.out.println("You get 1 points , Better Luck Next Time");
        }
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
   scan.close();
   }
  public static int getRandomNumber(int min,int max){
    Random random=new Random();
    return random.ints(min,max).findFirst().getAsInt();
  }
}
