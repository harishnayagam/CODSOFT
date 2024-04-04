import java.util.*;

public class AtmInterface
{
  public static void main(String[]args)
  {
        int pin =1234;
        int balance=5000;
        int AmountAdded=0;
        int AmountTaken=0;
          Scanner scan=new Scanner(System.in);
          System.out.println("Enter your Pin");
        int password=scan.nextInt();

    if(pin==password)
    {
                  System.out.println("Enter Your Name");
                String name=scan.next();
                  System.out.println(" Welcoome  "+ name);
      while(true)
        {
                  System.out.println(" Press 1 To Add Amount ");
                  System.out.println(" Press 2 To Take Amount ");
                  System.out.println(" Press 3 to Check Balance ");
                  System.out.println(" Press 4 to Take Receipt ");
                  System.out.println(" Press 5 to Exit ");
                int opt=scan.nextInt();
          switch(opt)
            {
              case 1:
                  System.out.println("Add Amout to your Account");
                AmountAdded=scan.nextInt();
                  System.out.println("Successfully Credited");
                balance = AmountAdded + balance ; 
              break;

              case 2:
                  System.out.println("Enter Your Amount To Take");
                AmountTaken=scan.nextInt(); 
              if(AmountTaken<balance)
                {
                balance=balance-AmountTaken;
                System.out.println("Successfully Depited"); 
                }
              else
                {
                System.out.println("Insufficient Balance");
                System.out.println("Try Less Than Your Available Balance");
                } 
              break;

              case 3:
                  System.out.println("Your Balance is "+ balance);
              break;

              case 4:
                  System.out.println("        Welcome       ");
                  System.out.println("Amount You Added is "+ AmountAdded);
                  System.out.println("Amount You Taken is "+ AmountTaken);
                  System.out.println("Amount In Your Balance is "+ balance);
                  System.out.println("Thank You For Coming");
            }
            if(opt==5){System.out.println("Thank You");
            break;}
          }
    }
    else
    {
    System.out.println("Entered Pin is Wrong");
    }
  }
} 