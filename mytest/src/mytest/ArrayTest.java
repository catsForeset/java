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
		printArray(myList);
		System.out.println();
		
		int[] li = reverse(new int[]{1,4,6,7});
		//Arrays.toString() 将数组转换为字符串
		System.out.println(Arrays.toString(li));
	}
	
	//数组作为参数，要声明参数类型。返回类型为 void 空，即不用返回值。如果强行使用 return 语句，则会报错。
	public static void printArray(double[] array) {
		for (int i = 0; i< array.length; i++ ) {
			System.out.print(array[i] + "  ");
		}
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