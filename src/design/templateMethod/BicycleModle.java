/**
 * 
 */
package design.templateMethod;

/**
 * 模版方法模式
 * @author mxd
 * 2017-4-18
 * 汽车模型 抽象类
 */
public abstract class BicycleModle {
	
	protected abstract void start();
	
	protected abstract void stop();
	
	protected abstract void alarm();
	
	final public void run(){
		
		//启动
		this.start();
		
		//按喇叭
		this.alarm();
		
		//停车
		this.stop();
	}
}
