/**
 * 
 */
package design.templateMethod;

/**
 * @author mxd
 * 2017-4-18
 * 膜拜自行车
 */
public class MobileModle extends BicycleModle{

	@Override
	protected void start() {
		System.out.println("膜拜启动~~~");
	}

	@Override
	protected void stop() {
		System.out.println("膜拜停车~~~");
	}

	@Override
	protected void alarm() {
		System.out.println("膜拜按喇叭~~~");
	}

	protected boolean isAlarm(){
		return false;
	}
}
