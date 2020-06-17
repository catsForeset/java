package mytest;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Srting 类的创建方法
		String newstr = new String("This is a string");
		System.out.println(newstr);
		//自动创建 String 类
		String str = "This is a string";
		System.out.println(str);
		//字符数组转为 String字符串
		char [] ch = {'w','o','r','d'};
		String chtostr = new String(ch);
		System.out.println(chtostr);
		//string 对象被创建之后，是无法改变的
		System.out.println(chtostr.length());
		//contact 连接字符串
		System.out.println("连接字符串".concat(chtostr));
		
	}

}
