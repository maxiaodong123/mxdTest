/**
 * 
 */
package list;

/**
 * @author mxd
 * 2017-6-2
 */
public class MaxTest {

	public static int max(int[] data){
		int max = data[0];
		for(int i :data){
			max = max > i ? max : i;
		}
		return max;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,3,44,22,34,19,66};
		System.out.println(max(arr));
	}
}
