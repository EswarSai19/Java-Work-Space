package ques4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User Details : ");
		System.out.println("======================\n"
		+ "Username should contain only alphabets and length should be min 3 and max 8 characters.\n");
		System.out.println("Enter username :");
		String usrnm = sc.next();
		
		System.out.println("\nPassword should be alpha-numeric and also min 3 and max 8 characters.\n");
		System.out.println("Enter Password :");
		String pass = sc.next();
		
		System.out.println("\nit should be an Indian mobile number starting with 6,7,8,9 and the\r\n"
				+ "length should be 10.\n");
		System.out.println("Enter Mobile Number :");
		String mobNum = sc.next();
		
		System.out.println("\nAdd ***@gmail.com at the end and Space is not allowed\n");
		System.out.println("Enter email :");
		String email = sc.next();
		if(matches("[a-zA-z]{3,8}", usrnm) && matches("[a-zA-Z0-9\\S]{3,8}", pass) &&
				matches("[6789]{1}[0-9]{9}",mobNum) &&  matches("[a-zA-Z0-9]@gmail.com",email)) {
			System.out.println("success");
			Customer c1 = new Customer(usrnm,pass,mobNum,email);
			System.out.println("***************************");
			System.out.println("User Name is : "+c1.getUsername());
			System.out.println("Password is : "+c1.getPassword());
			System.out.println("Mobile Number is : "+c1.getMobileNumber());
			System.out.println("Email is : "+c1.getEmail());
			System.out.println("***************************");
		}else {
			if(!matches("[a-zA-z]{3,8}", usrnm)){
				System.out.println("Invalid User Name");
			}
			if(!matches("[a-zA-Z0-9]{3,8}", pass)) {
				System.out.println("Invalid Password");
			}
			if(!matches("[6789]{1}[0-9]{9}",mobNum)) {
				System.out.println("Invalid Mobile Number");
			}
			if(matches("[a-zA-Z0-9][@gmail.com]",email)){
				System.out.println("Invalid Email");
			}
		}
//		
		sc.close();
	}
	
	public static  boolean matches(String regex, String target) {
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(target);
		return m.find();
	}
}
