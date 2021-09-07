package bankingApp;
import java.io.Serializable;

public class CustomerAccount implements Serializable{

		private static final long serialVersionUID = 1L;
		
		private int balance=0;
		private int dailywithdrawal=0;
		
		CustomerAccount(int balance, int dailywithdrawal){
			
			setBalance(balance);
			setDailywithdrawl(0);
			
		}
		
		
		public int getBalance() {
			return balance;
		}
		
		public void setBalance(int arg) {
			this.balance=arg;
		}
		
		public void setBalanceafterdeposit(int arg) {
			this.balance = this.balance + arg;
		}
		
		public void setBalanceafterwithdrawal(int arg) {
			this.balance = this.balance - arg;
		}
		
		public void setBalanceaftertransferin(int arg) {
			this.balance = this.balance + arg;
		}
		
		public void setBalanceaftertransferout(int arg) {
			this.balance = this.balance - arg;
		}
		
		public int getDailywithdrawl() {
			return this.dailywithdrawal;
		}
		
		public void setDailywithdrawl(int arg) {
			this.dailywithdrawal = this.dailywithdrawal + arg;
		}
		


}
