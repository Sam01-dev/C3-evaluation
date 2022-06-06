package question4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Customer customer = new Customer();
		
		System.out.println("Enter Username");
		String user=scanner.next();
		
		System.out.println("Enter Password");
		String pass = scanner.next();
		
		System.out.println("Enter Mobile Number");
		String mobile = scanner.next();
		
		System.out.println("Enter Email");
		String email = scanner.next();
		
		if(user.length()>=3 && user.length()<=8) {
			Pattern p = Pattern.compile("[a-zA-Z]");
			Matcher m = p.matcher(user);
		
		if(m.find()){
			//System.out.println(m.group());
			customer.setUsername(user);
			System.out.println(customer.getUsername());
		}
		
		}
		
		if(pass.length()>=3 && pass.length()<=8)
		{
			Pattern p = Pattern.compile("[a-zA-Z0-9]");
			Matcher m = p.matcher(pass);
			
			if(m.find()){
				//System.out.println(m.group());
				customer.setPassword(pass);
				System.out.println(customer.getPassword());
			}
			else if(m.find()==false)
			{
				System.out.println("Invalid");
			}
			
		}
		
		if(mobile.length()==10)
		{
			Pattern p = Pattern.compile("[0-9]");
			Matcher m = p.matcher(mobile);
			
			if(m.find())
			{
				//System.out.println(m.group());	
				customer.setMobileNumber(mobile);
				System.out.println(customer.getMobileNumber());
			}
			else if(m.find()==false)
			{
				System.out.println("invalid");
			}
			
		}
		
		Pattern p = Pattern.compile("[^a-zA-Z0-9]");
		Matcher m = p.matcher(email);
		
		if(m.find())
		{
			//System.out.println(m.group());
			customer.setEmail(email);
			System.out.println(customer.getEmail());
		}
		else if(m.find()==false)
		{
			System.out.println("Invalid");
		}
		

	}

}
