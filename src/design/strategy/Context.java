/**
 * 
 */
package design.strategy;

/**
 * @author mxd
 * 2017-4-10
 */
public class Context {
	
	private IStrategy straegy;

	public Context(IStrategy straegy){
		this.straegy = straegy;
	}
	
	public void operate(){
		this.straegy.operate();
	}
}
