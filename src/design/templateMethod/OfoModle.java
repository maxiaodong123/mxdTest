/**
 * 
 */
package design.templateMethod;

/**
 * @author mxd
 * 2017-4-18
 * OFO自行车
 */
public class OfoModle extends BicycleModle{

	@Override
	protected void start() {
		System.out.println("ofo启动~~~");
	}

	@Override
	protected void stop() {
		System.out.println("ofo停车~~~");
	}

	@Override
	protected void alarm() {
		System.out.println("ofo按喇叭~~~");
	}

}
