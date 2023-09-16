/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



public class encap
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Laptop  l1= new Laptop();
		l1.setp(56);
	}
}
class Laptop {
    int ram;
    private int price;
    public void setp(int price){
        /// if it is admin
        boolean isadmin = false;
        if(!isadmin){
            System.out.println(" you cant change");
        }
        {
            this.price = price;
        }
        
    }

    /// getter 
    public int ram(){
        return ram;
    }
    //setter
    public  void ram(int ram){
        this.ram = ram;
    }
}
