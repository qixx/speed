/**
 * 
 */
package speed;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.UUID;
/**
 * @author lenovo
 *
 */
public class TreeSetTest {
public static void main(String[] args) {
		
		long t=0;
		int n=10000;
		TreeSet<String> tree= new TreeSet<>();// 此tree用于存储随机字符串并测试查找速度
		ArrayList<String> list= new ArrayList<String>();// 用于在tree集合内的查找
	
		// UUID工具类生成随机字符储存在tree集合中
		for (int i = 0; i < n; i++) {
			String s = UUID.randomUUID().toString();
			list.add(s);
			tree.add(s);

		}
		//检测数据存储是否成功
		System.out.println("tree长度为"+tree.size());

		
		for (int i = 0; i < n; i++) {
			String s = list.get(i);//获取每个元素，依次进行查找

			// 设置开始时间
			long beginTime = System.nanoTime();// 查找时间单位为纳秒 
			// 在tree中查找这个元素
			boolean b = tree.contains(s);
			// 设置结束时间
			long endTime = System.nanoTime();
			
			// 将每次查找时间累加除以长度得到set平均查找速度
			long time=(endTime-beginTime);
			t=t+time;
			if(b == true && i == n-1) {

				t=t/n;
				System.out.println("平均查找速度为:"+t+"纳秒");
			
			}
		}
	}
}
