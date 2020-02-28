package capgemini_pro;
import java.util.Scanner;

public class ticket1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("1: BOOK TICKET");
	System.out.println("enter choice");
int c = sc.nextInt();
switch(c){
case 1 :
	infodisplayDao i = new infodisplayDao();
	i.display();
	break;
 default :
	 System.out.println("wrong choice");
	 break ;
}
}}
