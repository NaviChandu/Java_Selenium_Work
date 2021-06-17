package JavaPart1;

public class ArrayConcept {

	public static void main(String[] args) {

		//two major limitations:
		//1. size is fixed: Static Array: To overcome this problem, we use dynamic array (ArrayList)
		//2. Similar Data types values: ArrayList we have to use
		
		//1. int:
		int []i = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		int marks[] = {10,30,90,45};
		System.out.println(marks.length);
		
		System.out.println(i[0]);
		System.out.println(i[3]);
		//System.out.println(i[4]);//ArrayIndexOutOfBoundsException
		//System.out.println(i[-1]);//ArrayIndexOutOfBoundsException
		
		System.out.println(i.length);
		int len = i.length;
		
		//print all the values from array:for loop:
		for(int j=0; j<len; j++){
			System.out.println(i[j]);
		}
		
		for(int j=0; j<=len-1; j++){
			System.out.println(i[j]);
		}
		
		//2. double array:
		double d[] = new double[3];
		
		//3. char array:
		char c[] = new char[4];
		
		//4. String array:
		String s[] = new String[3];
		s[0] = "python";
		s[1] = "Java";
		s[2] = "dot net";
		
		System.out.println(s[0]+s[1]);
		System.out.println("my fav language is: " + s[1]);
		
		for(int counter=0; counter<s.length; counter++){
			System.out.println(s[counter]);
			if(s[counter].equals("Java")){
				System.out.println("I LOVE "+ s[counter]);
			}
		}
		
		String language[] = new String [5];
		language[0]="Hindi";
		language[1]="Punjabi";
		language[2]="Marathi";
		language[3]="Telugu";
		language[4]="Malyalam";
		
		for(int lancounter = 0; lancounter<language.length; lancounter++){
			if(language[lancounter].equals("Telugu")){
				System.out.println("I love Charminar");
			}
			else if(language[lancounter].equals("Marathi")){
				System.out.println("I love Mumbai");
			}
			else if(language[lancounter].equals("Punjabi")){
				System.out.println("I love Punjabi Food");
			}
			else if(language[lancounter].equals("Tamil")){
				System.out.println("I love Idli Sambhar");
			}
			else if(language[lancounter].equals("Hindi")){
				System.out.println("I love my India");
			}
			else{
				System.out.println("nothing is defined for "+ language[lancounter]);
			}
		}
		
		//Store employee data in an Array:
		//Object Array:
		Object emp[] = new Object[5];
		emp[0] = "Sachin";
		emp[1] = 30;
		emp[2] = 'm';
		emp[3] = true;
		emp[4] = 150.55;

		//no of days in a week/ no of months in a year
		
		
		
	}

}
