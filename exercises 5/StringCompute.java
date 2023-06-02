package exercises;

import java.util.Scanner;

public class StringCompute 
{
	private String str;
	
	public StringCompute (String str)
	{
		this.str = str;
	}
	
	public void setstr(String str)
	{
		this.str = str;
	}
	
	public String getstr()
	{
		return this.str;
	}
	
	public int countOccurances(char ch)
	{
		int count = 0;
		for (int i = 0; i < this.str.length(); i++)
		{
			if (str.charAt(i) == ch)
				count++;
		}
		return count;
	}
	
	public boolean hasOnlyDigits()
	{
		   for (char c : str.toCharArray()) {
	            if (!Character.isDigit(c)){
	            	System.out.println("No");
	                return false;
	            }
	        }
		   System.out.println("Yes");
	        return true;
	}
	
	public String removeChar(char ch)
	{
		return this.str.replace(ch+"", "");
	}
	
	public boolean isPalindrome()
	{
		String reverse="";
		String s1 = str;
		for (int i = str.length()-1; i>=0; i--)
			reverse+=str.charAt(i);
		return this.str.equals(reverse);
		
	}
	
	
	public static void main(String[] args)
	{
		Scanner keyborad = new Scanner(System.in);
		System.out.println("Please enter a String");
        String str = keyborad.nextLine();
        
        StringCompute s1 = new StringCompute(str);
        
        System.out.println("What character would you like to check?");
        char ch  = keyborad.next().charAt(0);
        s1.countOccurances(ch);
        
        System.out.println("Is this string only numbers?");
        s1.hasOnlyDigits();
        
        System.out.println("What character would you like to remove?");
        ch = keyborad.next().charAt(0);
        s1.removeChar(ch);
        
        System.out.println("Is ths string a palindrome?");
        s1.isPalindrome();
        
	}
	
}
