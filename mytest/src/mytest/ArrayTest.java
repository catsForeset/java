package mytest;

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
	}
	
}