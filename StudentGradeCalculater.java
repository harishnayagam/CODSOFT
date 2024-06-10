import java.util.Scanner;
class Calculation {
    public static void main(String[] args) {
        System.out .println("Give the mark of your subjects");
        Scanner mark=new Scanner(System.in);
        int sub1=mark.nextInt();
        int sub2=mark.nextInt();
        int sub3=mark.nextInt();
        int sub4=mark.nextInt();
        int sub5=mark.nextInt();
        mark.close();
        int total=(sub1+sub2+sub3+sub4+sub5);
        double AP=(total/5);
         System.out.println("Your total mark is   "+total);
         System.out.println("Your average percentage is  "+AP+"%");
        if(AP>=90)
        { System.out.println("'O' Grade");}
        else if(AP<90 && AP>=80)
        { System.out.println("'A+' Grade");}
        else if(AP<80 && AP>=70)
        { System.out.println("'A' Grade");}
        else if(AP<70 && AP>=60)
        { System.out.println("'B+' Grade");}
        else if(AP<60 && AP>=50)
        { System.out.println("'B' Grade");}
         else
        { System.out.println("'C' Grade");}
    }
}
