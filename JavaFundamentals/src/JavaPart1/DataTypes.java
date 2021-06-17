package JavaPart1;

/**
 * 
 * @author NaveenKhunteta
 * This code is for data types practice
 */
public class DataTypes {

	public static void main(String[] args) {

		//Data Types:
		//1. primitive: int, double, float, char, boolean
		//2. non primitive: user defined types of data, class, array, dynamic array, String
		
		// Numeric--> Integral and Character
		//Integral --> int and float
		//int --> char, byte, short, int, long
		//float--> float, double
		
		//int: size/range: 4 bytes, -214783648 to 214783647
		int i = 10;
		 i = 20;
		 i = 30;
		 int j = -10;
		 int k = 0;
		 
		 System.out.println(i);
		 System.out.println(j);
		 System.out.println(i+j);
		 System.out.println(100+200);
		 
		 //byte: 1 byte, -128 to 127
		 byte b1 = 1;
		 
		 //short: 2 bytes, -32768 to 32767
		 short s1 = 20;
		 
		 //long: 8 bytes
		 long l = 121212;
		 
		 //float: 4 bytes
		 float f = 12.33f;
		 float f1 = (float)32.22;
		 
		 //double: 8 bytes
		 double d1 = 12.33;
		 double d2 = 100;//100.00
		 
		 //char: 2 bytes
		 char c1 = 'a'; //a-z A-Z
		 char t1 = 'b';
		 char c2 = '1';//0-9
		 char c3 = '$';
		// ASCII
		 //a-z:97-122
		 //A-Z:65-90
		 //0-9:48-57
		 
		 System.out.println(c1);
		 System.out.println(c1+t1);//97+98
		 
		 //boolean: T/F -- 1 bit (1 byte = 8 bits)
		 boolean b2 = true;
		 boolean b3 = false;
		 
		
		 //String : is not a primitive data type, its pre defined class in Java
		 String str = "Hello World";
		 String str1 = "hey this is my java code";
		 String str2 = "1000";
		 String str3 = "123.33";
		 System.out.println(str);
		 System.out.println(str1);
		 System.out.println(str+" "+str1);
		 System.out.println("this is selenium");
		 
		 
	}

}
