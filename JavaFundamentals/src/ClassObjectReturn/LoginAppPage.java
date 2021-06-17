package ClassObjectReturn;

public class LoginAppPage {

	
	// used in page object model also...
	public HomePage doLogin() {
		System.out.println("Do login to app");
		return new HomePage();

	}

}
