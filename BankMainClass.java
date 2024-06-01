package monit2;
import monit1.*;
import java.util.*;
public class BankMainClass {
static public void main(String[]args) {
	Scanner s = new Scanner(System.in);
	int count=0;
	pqr:
		while(true) {
			System.out.println("Enter the pinNo:");
			int pinNo=s.nextInt();
			CheckPinNo cpn = new CheckPinNo();
					boolean k= cpn.verify(pinNo);
			if(k) {
				System.out.println("==choice==");
				System.out.println("1.Withdraw\n2.deposit");
				System.out.println("Enter the choice");
				switch(s.nextInt()) {
				case 1:
					System.out.println("Enter the amt:");
				int a1 = s.nextInt();
				if(a1>0&&a1%100==0) {
					WithDraw wd = new WithDraw();
					wd.process(a1);
				}
				else {
					System.out.println("Invalid amt...");
					
				}
				break pqr;
				case 2:
					System.out.println("Enter the amt:");
				int a2 =s.nextInt();
				if(a2>0&&a2%100==0) {
					Deposit dp = new Deposit();
					dp.process(a2);
				}
				else {
					System.out.println("Invalid amt...");
				}
				break pqr;
				default:
					System.out.println("Invalid Choice...");
					break pqr;
				}
				
				}
				else {
					
					System.out.println("Invalid pinNo...");
					count++;
				}
				if(count==3) {
					System.out.println("Transaction blocked..");
					break;
				}
			}
}
}
