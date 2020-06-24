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
		int[] intList = {1,4,2,6,7};
		printArray(intList);
		System.out.println();
		
		
		int[] reverseList = reverse(new int[]{1,4,2,6,7});
		//Arrays ��һ������ byte��short��int ������
		//Arrays.toString() ������ת��Ϊ�ַ���
		System.out.println(Arrays.toString(reverseList));
		
		//Arrays.sort() ��������������
		Arrays.sort(intList);
		printArray(intList);
		System.out.println();
		
		
		//Arrays.fill() �������������
		int[] arr = new int[5];
		Arrays.fill(arr,3);//�����еĲ������ֵ 3
		printArray(arr);
		Arrays.fill(arr,1,3,8);//�� 1~3 λ���ֵ 8
		printArray(arr);
		
		//Arrays.equals() �Ƚ���������Ĳ��������� true �� false
		int[] arr1 = {1,2,3};
		int[] arr2 = {1,2,3};
		System.out.println("Arrays.equals: "+Arrays.equals(arr1,arr2));
		//������ equals ���󣬱Ƚϵ�����������ĵ�ַ�Ƿ���ͬ
		System.out.println("equals: " + arr1.equals(arr2));
		
		//Arrays.binarySearch() �ö��ַ��ҳ�ָ��Ԫ�ص�����ֵ�������������������õ�
		int[] arr3 = {4,5,6,7,8,9,10,11,12};
		System.out.println("Arrays.binarySearch: " + Arrays.binarySearch(arr3,5));
		System.out.println("Arrays.binarySearch: " + Arrays.binarySearch(arr3,0,4,8));//�� 0 �� 3 λ��ֵ 8���ҵ�����ֵ������ 4 �η��� -4
		
		//Arrays.copyOf() ������ָ�����ȣ���0��ʼ����ֵ���µ�������
		int[] arrcopy = Arrays.copyOf(arr3,2);
		System.out.print("Arrays.copyOf 2 element of arr3: ");
		printArray(arrcopy);
		
		//Arrays.copyOfRange() ������ָ��λ�õ�ָ�����ȸ�ֵ���µ�������
		int[] arrrange = Arrays.copyOfRange(arr3,1,3);//������ arr3 �ĵ�һλ������λ��ֵ��������
		System.out.print("Arrays.copyOfRange index of 1 to 3 element of arr3: ");
		printArray(arrrange);
		
		//clone�� �����鸴�Ƶ���һ��������
		System.out.print("clone arr3: ");
		int[] arrclone = arr3.clone();
		printArray(arrclone);
		
		//
	}
	
	//������Ϊ������Ҫ�����������͡���������Ϊ void �գ������÷���ֵ�����ǿ��ʹ�� return ��䣬��ᱨ��
	public static void printArray(int[] array) {
		for (int i = 0; i< array.length; i++ ) {
			System.out.print(array[i] + "  ");
		}
		System.out.println();
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