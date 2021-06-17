package JavaPart1Assignments.Constructors;

import java.util.ArrayList;

public class ContructorBrowser {

	public String browserName;
	public String vendorName;
	public String currentVersion;
	ArrayList<String> ListOfPlugins = new ArrayList<String>();

	public ContructorBrowser(String browserName, String vendorName, String currentVersion,
			ArrayList<String> listOfPlugins) {
		this.browserName = browserName;
		this.vendorName = vendorName;
		this.currentVersion = currentVersion;
		ListOfPlugins = listOfPlugins;
	}

	public String getBrowserName() {
		return browserName;
	}

	public String getVendorName() {
		return vendorName;
	}

	public String getCurrentVersion() {
		return currentVersion;
	}

	public ArrayList<String> getListOfPlugins() {
		return ListOfPlugins;
	}

	public static void main(String[] args) {

		// Create a Array Lis
		ArrayList<String> plugin = new ArrayList<String>();
		plugin.add("Java");
		plugin.add("VLC");
		plugin.add("Windows Media Player");

		ContructorBrowser browObj = new ContructorBrowser("Chrome", "google", "ChromeVersoin74", plugin);
		System.out.println("Browser Name is: " + browObj.getBrowserName());
		System.out.println("Vendor Name is: " + browObj.getVendorName());
		System.out.println("Version Name is: " + browObj.getCurrentVersion());
		System.out.println("Plugin List is: " + browObj.getListOfPlugins());

	}

}
