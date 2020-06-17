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
	      //先执行一次，再判断条件
	      do {
	    	 System.out.print("value of x in do while : " + x );
	         x++;
	         System.out.print("\n");
	      }while(x < 20);
	      
	      
	      //增强 for 循环
	      int [] numbers = {39,350,44,45,339,99};
	      for(int num : numbers) {
	    	  System.out.print(num);
	    	  System.out.print(',');
	      }
	      System.out.print('\n');
	      String [] strs = {"ttt","www","kkk","ddjkdf"};
		  //java 里单引号里的类型是char，多个字符串是string，用单引来引字符串，会报错。
		  //可用双引号来引用单个字符，这时这个字符的类型已经是string，不是char了
	      //String [] strs = {'ree','eertr'}; //此行报错
	      for(String str : strs) {
	    	  System.out.print(str);
	    	  System.out.print(',');
	      }
	      System.out.print('\n');
	      
	      
	      //break 和 continue
	      //break 跳出当前最里层循环，不再执行此循环语句，继续执行循环下面的语句
	      //continue 跳转到下一次循环，继续执行循环语句
	      for(int num : numbers ) {
	         // x 等于 44 时跳出循环
	         if( num == 44 ) {
	            break;
	         }
	         System.out.print(num);
	         System.out.print(",");
	      }
	      System.out.print('\n');
	      
	      for(int num : numbers ) {
	         // x 等于 44 时执行下一个循环
	         if( num == 44 ) {
	            continue;
	         }
	         System.out.print(num);
	         System.out.print(",");
	      }
	      System.out.print('\n');
	}

}
