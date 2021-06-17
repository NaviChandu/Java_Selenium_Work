package Constructor;

public class Login {

	String username;
	String password;
	int otp;
	long phoneNumber;
	String socialMediaId;

	public Login() {
		System.out.println("Please provide proper credentials ");
	}

	public Login(String username, String password, int otp, long phoneNumber, String socialMediaId) {
		this.username = username;
		this.password = password;
		this.otp = otp;
		this.phoneNumber = phoneNumber;
		this.socialMediaId = socialMediaId;
	}

	public Login(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public Login(int otp) {
		this.otp = otp;
	}

	public Login(long phoneNumber, String socialMediaId) {
		this.phoneNumber = phoneNumber;
		this.socialMediaId = socialMediaId;
	}
	
	public static void main(String a[]){
		Login l1 = new Login();
		
		Login l2 = new Login(12345);
		System.out.println(l2.otp);
		
		System.out.println(l1.otp);
		
		l1 = l2;
		System.out.println(l1.otp);
		
		l2 = null;
		//System.out.println(l2.otp);
		System.out.println(l1.otp);
		
		
	}

}
