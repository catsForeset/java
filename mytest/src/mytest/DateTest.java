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
		System.out.printf("ȫ�����ں�ʱ����Ϣ��%Tc%n",date);//c ,ȫ�����ڸ�ʽ
		System.out.printf("��-��-�ո�ʽ��%tF%n",date);//F,��-��-�ո�ʽ
		System.out.printf("��/��/���ʽ��%1$tD%n",date);//D,��/��/���ʽ,%1$t ���� %t �в��������ţ�1$ ��ʾ���� 1���� $ ���Ž�β������ֻ��һ��������
		System.out.printf("HH:MM:SS PM��ʽ��12ʱ�ƣ���%tr%n",date);//r,HH:MM:SS PM��ʽ��12ʱ�ƣ�
		System.out.printf("HH:MM��ʽ��24ʱ�ƣ���%tR%n",date);//R,HH:MM��ʽ��24ʱ�ƣ�
		System.out.printf("HH:MM:SS��ʽ��24ʱ�ƣ���%tT%n",date);//T,
		
		//%1$s ��ʾ����һ���������ַ�����ʽ�����%2$tc ��ʾ���ڶ���������������ʽ��������������ڸ�ʽ�� c ����ʽ�����
		System.out.printf("%1$s %2$tc %n","String Part:",date);
		//��ʵ printf ��һ������������������ڸ�ʽ��ת�������� SimpleDateFormat ��ȫ��һ��
		System.out.printf("%1$s %2$ty-%2$tm-%2$td %2$tH:%2$tM:%2$tS %2$tL %n","printf ��� ��-��-�� ʱ:��:�� ���� : ",date);
		
		//< ��־��< ��־��ʾ��ǰ����ʽ���Ĳ���Ҫ���ٴ�ʹ��
		System.out.printf("%1$s %2$ty-%<tm-%<td %<tH:%<tM:%<tS %<tL %n","printf ��� ��-��-�� ʱ:��:�� ���� : ",date);//�˴��� < ֮ǰ���ֵ��� 2$,��ʾ�ڶ�λ��������� < Ҳ��ʾ�ڶ�λ����
		
		
		//String �������ת������ʵ���� printf ��ת����Ҳ�� string �ࡣ
		System.out.print("oo\n")
		String str = String.format("%tc",date);
		System.out.println("String �����ȫ��������Ϣ��" + str);
		//b �·ݼ�ƣ�B �·�ȫ��
		System.out.printf("�·�")
		
	}
}
