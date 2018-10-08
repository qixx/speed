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
		LinkedList<String> list = new LinkedList<String>();// ��list���ڴ洢����ַ��������Զ�ȡ�ٶ�

		// UUID��������������ַ�������list������
		for (int i = 0; i < n; i++) {
			String s = UUID.randomUUID().toString();
			list.add(s);


		}
		//������ݴ洢�Ƿ�ɹ�
		System.out.println("list����Ϊ"+list.size());

		
		//����ArrayList�Ķ�ȡ�ٶȣ�
		for (int i = 0; i < n; i++) {
			String s = list.get(i);//��ȡÿ��Ԫ�أ����ν��в���

			// ���ÿ�ʼʱ��
			long beginTime = System.nanoTime();// ����ʱ�䵥λΪ���� 
			// ��list�в������Ԫ��
			boolean b = list.contains(s);
			// ���ý���ʱ��
			long endTime = System.nanoTime();
			
			// ��ÿ�β���ʱ���ۼӳ��Գ��ȵõ�listƽ�������ٶ�
			long time=(endTime-beginTime);
			t=t+time;
			if(b == true && i == n-1) {

				t=t/n;
				System.out.println("ƽ�������ٶ�Ϊ:"+t+"����");
			
			}
		}
	}

}
