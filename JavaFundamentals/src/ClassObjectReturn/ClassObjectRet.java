package ClassObjectReturn;

public class ClassObjectRet {

	public static void main(String[] args) {

		LoginAppPage lp = new LoginAppPage();
		HomePage hp = lp.doLogin();
		hp.headerHomePage();

	}

}
