/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class absrt
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		audi a1 = new audi();
		a1.start();
	}
}
class audi extends Car{
    @Override
    void start(){
        System.out.println("car is start");
    }
    
}
class bmw extends Car{
    @Override
    void start(){
        System.out.println(" yoo");
    }
}
/// abstract--> in abstract u can't make its object like c1 car = new car(), u can only use it in its childs
abstract class Car{
    int price;
    abstract void start();
}