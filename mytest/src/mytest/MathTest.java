package mytest;

public class MathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�� number ����ת��Ϊ xxx �������͵�ֵ������
		//���еİ�װ�ࣨInteger��Long��Byte��Double��Float��Short�����ǳ����� Number
		Integer x = 5;
		System.out.println(x.byteValue());
		System.out.println(x.doubleValue());
		System.out.println(x.longValue());
		System.out.println(x.floatValue());
		
		//������ͬ�������͵� Number ����Ƚ�
		System.out.println(x + " compare to 3:" + x.compareTo(3));
		System.out.println(x + " compare to 5:" +x.compareTo(5));
		System.out.println(x + " compare to 8:" +x.compareTo(8));
	}

}
