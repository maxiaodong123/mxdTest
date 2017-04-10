
package design.strategy;

/**
 * @author mxd
 * 2017-4-10
 */
public class BackDoor implements IStrategy{

	@Override
	public void operate() {
		System.out.println("走后门~~~");
	}

}
