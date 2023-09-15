/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*************
******************************************************************/

public class oops1
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		/// making object 
		person one = new person();
		one.name = "vinayak";
		one.age = 34;
		
		person two = new person();
		two.name = " sharma";
		two.age = 67;
		
		System.out.println(one.age+" "+one.name);
		    
		
		
	}
}
/// making classs it wont take part in run time 
class person{
    String name;
    int age;
}
