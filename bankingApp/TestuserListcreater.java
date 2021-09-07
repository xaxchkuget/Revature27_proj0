package bankingApp;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
public abstract class TestuserListcreater{
		static Map<String,WormUser> wormBankuserList;

	public static void main(String[] args) {

			try{
//				WormUser a = new WormUser("testcustomerfirst1", "testcustomerlast1", "testcustomer1@email", "testcustomerpassword1", "testcustomer1@email", "1111111111","open");
//				WormUser b = new WormUser("testcustomerfirst2", "testcustomerlast2", "testcustomer2@email", "testcustomerpassword2", "testcustomer2@email", "1111111112","open");
//				WormUser c = new WormUser("testcustomerfirst3", "testcustomerlast3", "testcustomer3@email", "testcustomerpassword3", "testcustomer3@email", "1111111113","open");

//				WormUser a = new WormUser("testemployeefirst1", "testemployeelast1", "testemployee1@email", "testemployeepassword1", "testemployee1@email", null, "employee");
//				WormUser b = new WormUser("testemployeefirst2", "testemployeelast2", "testemployee2@email", "testemployeepassword2", "testemployee2@email", null, "employee");
//				WormUser c = new WormUser("testemployeefirst3", "testemployeelast3", "testemployee3@email", "testemployeepassword3", "testemployee3@email", null, "employee");
//				
				
//				WormUser a = new WormUser("testAdminfirst1", "testAdminlast1", "testAdmin1@email", "testAdminpassword1", "testAdmin1@email", null, "admin");
//				WormUser b = new WormUser("testAdminfirst2", "testAdminlast2", "testAdmin2@email", "testAdminpassword2", "testAdmin2@email", null, "admin");
//				WormUser c = new WormUser("testAdminfirst3", "testAdminlast3", "testAdmin3@email", "testAdminpassword3", "testAdmin3@email", null, "admin");
				
				CustomerAccount a = new CustomerAccount(200, 5);
				CustomerAccount b = new CustomerAccount(2000000, 0);
				CustomerAccount c = new CustomerAccount(534, 0);
				

				Map<String,CustomerAccount> testwormBankuserList = new HashMap<>();
				testwormBankuserList.put("1111111111",a);
				testwormBankuserList.put("1111111112",b);
				testwormBankuserList.put("1111111113",c);
								
					
		         FileOutputStream fileOut = new FileOutputStream("C:\\Users\\T3st\\eclipse-workspace\\revatureJava27\\src\\bankingApp\\wormAccountList.ser");
		         ObjectOutputStream out = new ObjectOutputStream(fileOut);
		         out.writeObject(testwormBankuserList);
		         out.close();
		         fileOut.close();
		         System.out.printf("Serialized data is saved in worm_bank_users.ser\n");
		         
		         
//		         wormBankuserList = WormReadFromFile.WormUsersRead();
//		         System.out.println(wormBankuserList.get("testAdmin3@email").getfirstname());

		         
		         
		         
		         
	      } catch (IOException i) {
	         i.printStackTrace();
	      }
		}
}