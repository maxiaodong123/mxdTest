/**
 * 
 */
package design.strategy;

/**
 * @author mxd
 * 2017-4-10
 */
public class Test {

	public static void main(String[] args) {
		Context context = new Context(new BackDoor());
		context.operate();
		
		Context context2= new Context(new Gift());
		context2.operate();
	}
}
