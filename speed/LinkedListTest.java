/**
 * 
 */
package speed;
import java.util.LinkedList;
import java.util.UUID;

/**
 * @author lenovo
 *
 */
public class LinkedListTest {
public static void main(String[] args) {
		
		long t=0;
		int n=10000;
		LinkedList<String> list = new LinkedList<String>();// 此list用于存储随机字符串并测试读取速度

		// UUID工具类生成随机字符储存在list集合中
		for (int i = 0; i < n; i++) {
			String s = UUID.randomUUID().toString();
			list.add(s);


		}
		//检测数据存储是否成功
		System.out.println("list长度为"+list.size());

		
		//测试ArrayList的读取速度；
		for (int i = 0; i < n; i++) {
			String s = list.get(i);//获取每个元素，依次进行查找

			// 设置开始时间
			long beginTime = System.nanoTime();// 查找时间单位为纳秒 
			// 在list中查找这个元素
			boolean b = list.contains(s);
			// 设置结束时间
			long endTime = System.nanoTime();
			
			// 将每次查找时间累加除以长度得到list平均查找速度
			long time=(endTime-beginTime);
			t=t+time;
			if(b == true && i == n-1) {

				t=t/n;
				System.out.println("平均查找速度为:"+t+"纳秒");
			
			}
		}
	}

}
