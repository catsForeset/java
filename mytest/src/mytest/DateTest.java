package mytest;

//�������ڰ�
// import java.util.Date;
import java.util.*;
import java.text.*;

public class DateTest{
	
	public static void main(String[] args){
		Date date= new Date();
		System.out.println(date.toString());
		//MM ���·ݣ�mm �Ƿ֡�HH �� 24 Сʱ�ƣ�hh �� 12 Сʱ�ơ�
		//���һ�����ĸ��������Զ�Ӧ yyyy��������������λ�������Զ�����λ��ĸ��ʾ��
		SimpleDateFormat simple = new SimpleDateFormat(" G yyyy-MM-dd hh:mm:ss");
		System.out.println("SimpleDateFormate: " + simple.format(date));
		//����������ڱ�ʾ����ĸ������չʾ������λ��Ҳ��Լ��٣��������ڿ�������λ����λ��ʾ������ʱ���������һλ����λ��ʾ��һλ��ʾʱ��ǰ׺ 0 �ᱻ���ԡ�
		SimpleDateFormat simple2 = new SimpleDateFormat(" G yy-M-d h:m:s");
		System.out.println("SimpleDateFormate: " + simple2.format(date));
	}
}
