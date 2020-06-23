package mytest;

//����Arrays��
import java.util.Arrays;

public class ArrayTest {
	
	public static void main(String[] args) {
		double[] myList = new double[3];
		myList[0] = 2;
		myList[1] = 3;
		myList[2] = 5.5;
		double total = 0;
		double max = myList[0];
		for (int i = 0; i < myList.length; i++) {
			total += myList[i];
			if (myList[i] > max) {
				max = myList[i];
			}
		}
		System.out.println("total=" + total + ",max=" + max);
		
		//for-Each ѭ��,������ php �� foreach, value : array
		for (double my : myList) {
			System.out.println(my);
		}
		
		//��������Ϊ����ȥ������,��������Ҫ�ͺ���ָ��������һ�£����򱨴�
		printArray(myList);
		System.out.println();
		
		int[] li = reverse(new int[]{1,4,6,7});
		//Arrays.toString() ������ת��Ϊ�ַ���
		System.out.println(Arrays.toString(li));
	}
	
	//������Ϊ������Ҫ�����������͡���������Ϊ void �գ������÷���ֵ�����ǿ��ʹ�� return ��䣬��ᱨ��
	public static void printArray(double[] array) {
		for (int i = 0; i< array.length; i++ ) {
			System.out.print(array[i] + "  ");
		}
	}
	
	//������Ϊ�����ķ���ֵ��Ҫ�������������͡�Ҫ��������ֵ�����ͣ�����ֵ���������������͡�
	public static int[] reverse(int[] list) {
		int[] result = new int[list.length];
		for (int i = 0, j= result.length - 1; i < list.length; i++, j--) {
			result[j] = list[i];
		}
		return result; //������صĲ��Ǻ��������� int[] ���ͣ��򱨴����緵�� return result[0] �򱨴�
	}
	
}