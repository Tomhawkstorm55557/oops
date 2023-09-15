/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*************
******************************************************************/

public class constructor
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
	    	one.walk();
	    	one.walk(2);
	    	/// we are accesing cont even though we didnt pass any value because we make it statics
		   System.out.println(one.cont);
		
		
	}
}
/// new ka baad joo bhi hota hai we call constructor person( ) yeh default hai 
/// making classs it wont take part in run time 
/// in polymorphism when there are multiple forms
class person{
    String name;
    int age;
    /// static ---> u are makking it an property of classs
    static int cont;
    public person(){
        cont++;
        System.out.println(cont);
    }
    public person ( int age, String name){
        /// calling another constructor from one cnstructor 
        this();
        /// next use case of this ki yeh name ki value isi mai use karo isi class mai yeh udhar mat bhejo
        this.name = name;
        this.age = age;
    }
    void walk(){
        System.out.println(name + " walk ");
    }
    void walk(int steps){
        System.out.println(name + " walked "+ steps);
    }
}
