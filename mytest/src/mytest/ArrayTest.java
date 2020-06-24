package mytest;

//引入Arrays包
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
		
		//for-Each 循环,类似于 php 的 foreach, value : array
		for (double my : myList) {
			System.out.println(my);
		}
		
		//将数组作为参数去请求函数,参数类型要和函数指定的类型一致，否则报错
		int[] intList = {1,4,2,6,7};
		printArray(intList);
		System.out.println();
		
		
		int[] reverseList = reverse(new int[]{1,4,2,6,7});
		//Arrays 类一般用于 byte，short，int 数组中
		//Arrays.toString() 将数组转换为字符串
		System.out.println(Arrays.toString(reverseList));
		
		//Arrays.sort() 将数组升序排序
		Arrays.sort(intList);
		printArray(intList);
		System.out.println();
		
		
		//Arrays.fill() 给数组填充数据
		int[] arr = new int[5];
		Arrays.fill(arr,3);//给所有的参数填充值 3
		printArray(arr);
		Arrays.fill(arr,1,3,8);//给 1~3 位填充值 8
		printArray(arr);
		
		//Arrays.equals() 比较两个数组的参数，返回 true 或 false
		int[] arr1 = {1,2,3};
		int[] arr2 = {1,2,3};
		System.out.println("Arrays.equals: "+Arrays.equals(arr1,arr2));
		//函数的 equals 对象，比较的是两个数组的地址是否相同
		System.out.println("equals: " + arr1.equals(arr2));
		
		//Arrays.binarySearch() 用二分法找出指定元素的索引值，数组必须是升序排序好的
		int[] arr3 = {4,5,6,7,8,9,10,11,12};
		System.out.println("Arrays.binarySearch: " + Arrays.binarySearch(arr3,5));
		System.out.println("Arrays.binarySearch: " + Arrays.binarySearch(arr3,0,4,8));//从 0 到 3 位找值 8，找到不到值，找了 4 次返回 -4
		
		//Arrays.copyOf() 将数组指定长度（从0开始）赋值到新的数组中
		int[] arrcopy = Arrays.copyOf(arr3,2);
		System.out.print("Arrays.copyOf 2 element of arr3: ");
		printArray(arrcopy);
		
		//Arrays.copyOfRange() 将数组指定位置的指定长度赋值到新的数组中
		int[] arrrange = Arrays.copyOfRange(arr3,1,3);//将数组 arr3 的第一位到第三位赋值给新数组
		System.out.print("Arrays.copyOfRange index of 1 to 3 element of arr3: ");
		printArray(arrrange);
		
		//clone类 将数组复制到另一个数组中
		System.out.print("clone arr3: ");
		int[] arrclone = arr3.clone();
		printArray(arrclone);
		
		//
	}
	
	//数组作为参数，要声明参数类型。返回类型为 void 空，即不用返回值。如果强行使用 return 语句，则会报错。
	public static void printArray(int[] array) {
		for (int i = 0; i< array.length; i++ ) {
			System.out.print(array[i] + "  ");
		}
		System.out.println();
	}
	
	//数组作为函数的返回值：要声明参数的类型。要声明返回值的类型，返回值必须是声明的类型。
	public static int[] reverse(int[] list) {
		int[] result = new int[list.length];
		for (int i = 0, j= result.length - 1; i < list.length; i++, j--) {
			result[j] = list[i];
		}
		return result; //如果返回的不是函数声明的 int[] 类型，则报错。比如返回 return result[0] 则报错。
	}
	
}