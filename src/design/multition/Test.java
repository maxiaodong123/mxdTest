/**
 * 
 */
package design.multition;

/**
 * @author mxd 2017-4-10
 */
@SuppressWarnings("all")
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int ministerNum = 10; // 10个大臣
		for (int i = 0; i < ministerNum; i++) {
			Emperor emperor = Emperor.getInstance();
			System.out.print("第" + (i + 1) + "个大臣参拜的是：");
			emperor.emperorInfo();
		}
	}
}
