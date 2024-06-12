package accountexample;
import java.util.Scanner;
class AccountDetails{
	private long acc_num;
	private String username;
	private String mail;
	private float amt;
	public long getAcc_num() {
		return acc_num;
	}
	public void setAcc_num(long acc_num) {
		this.acc_num = acc_num;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public float getAmt() {
		return amt;
	}
	public void setAmt(float amt) {
		this.amt = amt;
	}
	
}
public class BankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountDetails ad=new AccountDetails();
		Scanner in=new Scanner(System.in);
		long Acc_num=in.nextLong();
		//ad.acc_num=in.nextLong();
		
		ad.setAcc_num(Acc_num);
		
		String UserName=in.nextLine();
		ad.setUsername(UserName);
		String MailId=in.next();
		ad.setMail(MailId);
		float amount=in.nextFloat();
		ad.setAmt(amount);
		
	}

}
