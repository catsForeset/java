package mytest;

public class Circulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
	      while( x < 20 ) {
	         System.out.print("value of x : " + x );
	         x++;
	         System.out.print("\n");
	      }
	      //��ִ��һ�Σ����ж�����
	      do {
	    	 System.out.print("value of x in do while : " + x );
	         x++;
	         System.out.print("\n");
	      }while(x < 20);
	      
	      
	      //��ǿ for ѭ��
	      int [] numbers = {39,350,44,45,339,99};
	      for(int num : numbers) {
	    	  System.out.print(num);
	    	  System.out.print(',');
	      }
	      System.out.print('\n');
	      String [] strs = {"ttt","www","kkk","ddjkdf"};
		  //java �ﵥ�������������char������ַ�����string���õ��������ַ������ᱨ����
		  //����˫���������õ����ַ�����ʱ����ַ��������Ѿ���string������char��
	      //String [] strs = {'ree','eertr'}; //���б���
	      for(String str : strs) {
	    	  System.out.print(str);
	    	  System.out.print(',');
	      }
	      System.out.print('\n');
	      
	      
	      //break �� continue
	      //break ������ǰ�����ѭ��������ִ�д�ѭ����䣬����ִ��ѭ����������
	      //continue ��ת����һ��ѭ��������ִ��ѭ�����
	      for(int num : numbers ) {
	         // x ���� 44 ʱ����ѭ��
	         if( num == 44 ) {
	            break;
	         }
	         System.out.print(num);
	         System.out.print(",");
	      }
	      System.out.print('\n');
	      
	      for(int num : numbers ) {
	         // x ���� 44 ʱִ����һ��ѭ��
	         if( num == 44 ) {
	            continue;
	         }
	         System.out.print(num);
	         System.out.print(",");
	      }
	      System.out.print('\n');
	}

}