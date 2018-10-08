/**
 * 
 */
package speed;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.UUID;
/**
 * @author lenovo
 *
 */
public class HashSetTest {
public static void main(String[] args) {
		
		long t=0;
		int n=10000;
		HashSet<String> set = new HashSet<String>();// ��set���ڴ洢����ַ��������Բ����ٶ�
		ArrayList<String> list= new ArrayList<String>();// ������set�����ڵĲ���
		
		// UUID��������������ַ�������set������
		for (int i = 0; i < n; i++) {
			String s = UUID.randomUUID().toString();
			list.add(s);
			set.add(s);

		}
		//������ݴ洢�Ƿ�ɹ�
		System.out.println("set����Ϊ"+set.size());

		
		//����ArrayList�Ķ�ȡ�ٶȣ�
		for (int i = 0; i < n; i++) {
			String s = list.get(i);//��ȡÿ��Ԫ�أ����ν��в���

			// ���ÿ�ʼʱ��
			long beginTime = System.nanoTime();// ����ʱ�䵥λΪ���� 
			// ��set�в������Ԫ��
			boolean b = set.contains(s);
			// ���ý���ʱ��
			long endTime = System.nanoTime();
			
			// ��ÿ�β���ʱ���ۼӳ��Գ��ȵõ�setƽ�������ٶ�
			long time=(endTime-beginTime);
			t=t+time;
			if(b == true && i == n-1) {

				t=t/n;
				System.out.println("ƽ�������ٶ�Ϊ:"+t+"����");
			
			}
		}
	}
}
