package mytest;

//�������ڰ�
// import java.util.Date;
import java.util.*;
import java.text.*;

public class DateTest{
	
	public static void main(String[] args){
		Date date = new Date();
		System.out.println(date.toString());
		//MM ���·ݣ�mm �Ƿ֡�HH �� 24 Сʱ�ƣ�hh �� 12 Сʱ�ơ�
		//���һ�����ĸ��������Զ�Ӧ yyyy��������������λ�������Զ�����λ��ĸ��ʾ��
		SimpleDateFormat simple = new SimpleDateFormat("G yyyy-MM-dd hh:mm:ss");
		System.out.println("SimpleDateFormate: " + simple.format(date));
		//����������ڱ�ʾ����ĸ������չʾ������λ��Ҳ��Լ��٣��������ڿ�������λ����λ��ʾ������ʱ���������һλ����λ��ʾ��һλ��ʾʱ��ǰ׺ 0 �ᱻ���ԡ�
		SimpleDateFormat simple2 = new SimpleDateFormat("G E yy-M-d h:m:s");
		System.out.println("SimpleDateFormate: " + simple2.format(date));
		
		
		//printf ��ʽ������
		//%t��ʾ��ʽ������ʱ�����ͣ�%T��ʱ�����ڵĴ�д��ʽ����%t֮�����ض�����ĸ��ʾ��ͬ�������ʽ
		System.out.printf("ȫ�����ں�ʱ����Ϣ��%Tc",date);//%n ���� c
		System.out.printf("%1$tD%n", date);		
		//
		System.out.printf("��-��-�ո�ʽ��%tF%n",date);  
		// 
		System.out.printf("��/��/���ʽ��%tD%n",date);  
		//
		System.out.printf("HH:MM:SS PM��ʽ��12ʱ�ƣ���%tr%n",date);  
		// 
		System.out.printf("HH:MM:SS��ʽ��24ʱ�ƣ���%tT%n",date);  
		// 
		System.out.printf("HH:MM��ʽ��24ʱ�ƣ���%tR",date);  
	}
}
