import java.util.Scanner;
public class miniproject {
    public static void main(String[]args){
        //mini project
        Scanner sc =new Scanner(System.in);
        int mynum = (int)(Math.random()*1000);
        int usernum=0;
        do{
            System.out.println("Guess my number(1-1000):");
         usernum=sc.nextInt();

        if(usernum==mynum)
        {
            System.out.println("WOWWWWW..CORRECT NUMBER!!!!");
            break;

        }
        else if(usernum>mynum){
            System.out.println("Your number is too LARGE ");
        }
        else
        {
            System.out.println("Your number is too SMALL");
        }}while(usernum>=0);{
            System.out.print("My number was:");
            System.out.println(mynum);
        }
    }
}
