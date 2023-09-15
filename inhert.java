/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*************
******************************************************************/

public class inhert
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
		   developer d1 = new developer(24, "Anuj");
		   /// just by calling developer we can inherit the property of person class too coool nnaaaa
		   d1.walk();
	   	
		
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
    void dowork(){
        System.out.println("DO something");
    }
}
class developer extends person{
    public developer(int age, String name){
        /// super--->> call the constructor of class paarent
        super(age,name);
/// this is the type of polymorphism in this  if if the walk function is present in child class it wont look for another this is knw as compiler polymorphism 	    
	    
	void walk(){
          system.out.println("developer" + name + "walking);
        
    }
}
