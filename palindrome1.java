import java.util.*;

class Palindrome{
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		binaria bnobj=new binaria();

		int num;
		String bin;
		System.out.println("type in the number you want to check for palindromity");
		num=scn.nextInt();
		bin=bnobj.binator(num);
		String reversed=bnobj.reversor(bin);

		if (bin.equals(reversed)) {
			
		System.out.println(" \n the Binary value of "+num+" is "+bin+". and it's reversed form is "+reversed+" so it is a Palindrome");
		}
		else{
			System.out.println("\n "+num+" is not a Palindrome. because it's binary is "+bin+" and its's reversed "+reversed);

	}
}
}
 
 class binaria{
 	public String binator(int number1){
 		return Integer.toBinaryString(number1);
 	}
 	public String reversor(String rev){

		StringBuilder stb=new StringBuilder(rev);
		stb.reverse();
		return stb.toString();
 	}
 }
 