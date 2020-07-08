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
		System.out.print("\n");
		String str = String.format("%tc",date);
		System.out.println("String �����ȫ��������Ϣ��" + str);
		//Y ���ȫ�ƣ�y��ݼ��
		System.out.printf("���ȫ�ƣ�%tY%n",date);
		System.out.printf("��ݼ�ƣ�����λ����%ty%n",date);
		System.out.printf("��ݼ�飨ǰ��λ����%tC%n",date);
		System.out.printf(Locale.US,"Ӣ�����ȫ�ƣ�%tY%n",date);
		System.out.printf(Locale.US,"Ӣ����ݼ�ƣ�%ty%n",date);
		//B �·�ȫ��,b �·ݼ��
		System.out.printf("�·�ȫ�ƣ�%tB%n",date);
		System.out.printf("�·ݼ�ƣ�%tb%n",date);
		System.out.printf(Locale.US,"Ӣ���·�ȫ�ƣ�%tB%n",date);
		System.out.printf(Locale.US,"Ӣ���·ݼ�ƣ�%tb%n",date);
		//D ��/��/���ʽ��d ����ȫ��(������λ��0)��e���ڼ��
		System.out.printf("����ȫ�ƣ�%td%n",date);
		System.out.printf("���ڼ�ƣ�%te%n",date);
		//H 24Сʱ��(������λ��0)��I 12Сʱ��
		System.out.printf("24Сʱ�ƣ�%tH%n",date);
		System.out.printf("12Сʱ�ƣ�%tI%n",date);
		//M ����(������λ��0)��m �·�ȫ��(���֣�������λ��0)
		System.out.printf("����ȫ�ƣ�%tM%n",date);
		System.out.printf("m�·�ȫ�ƣ�%tm%n",date);
		//A ����ȫ�ƣ�a ���ڼ��
		System.out.printf("����ȫ�ƣ�%tA%n",date);
		System.out.printf("���ڼ�ƣ�%ta%n",date);
		System.out.printf(Locale.US,"Ӣ������ȫ�ƣ�%tA%n",date);
		System.out.printf(Locale.US,"Ӣ�����ڼ�ƣ�%ta%n",date);
		
		
		//�����ַ���Ϊʱ��,SimpleDateFormat �� parse �������ɽ�ָ���������ַ���ת��Ϊ���ڸ�ʽ��
		SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
		// SimpleDateFormat ft = new SimpleDateFormat ("yyyy/MM/dd");
	    String input = "2020-07-03";//����Ƿ� ��-��-�ո�ʽ���ᱨ�������� ��/��/�� ��ʽ����ô ft ������ yyyy-MM-dd ��ʽ��
	    // String input = "2020/07/03";// ��/��/�� ��ʽ, ft ������ yyyy-MM-dd ��ʽ
		System.out.print(input + " Parses as : ");
	    Date t; 
	    try { 
		  t = ft.parse(input);//���ַ���תΪ���� Date ��ʽ
		  System.out.println(t); 
	    } catch (ParseException e) { 
		  System.out.println("Unparseable using " + ft); 
	    }
		
		
		//sleep() ʹ��ǰ�߳̽���ָ��������ʱ�䣬��λ�Ǻ��롣���������в���������Ա��׳�����
		try{
			long start = System.currentTimeMillis();//��ǰ������,������ php �� microtime()
			System.out.println(new Date());
			Thread.sleep(1000*3);
			System.out.println(new Date());
			long end = System.currentTimeMillis();
			long diff = end - start;
			System.out.println("�����ִ�м��ʱ�䣨���룩�ǣ�" + diff);
		} catch(Exception e) {
			System.out.println("�׳�����" + e);
		}
		
	}
}
