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
		
		
		//输出格式化字符串
		String fs;
		fs = String.format("浮点型:%f,"+"整形:%d,"+"字符串:%s", 2.21,2,"This is a string");
		System.out.println(fs);
		System.out.printf("浮点型:%f,"+"整形:%d,"+"字符串:%s", 2.21,2,"This is a string");
		System.out.print('\n');
		
		
		//charAt() 返回指定索引处的字符，范围我 0 到 length()-1
		String s = "String";
		System.out.println(s.charAt(2));
		
		
		//compareTo() 两个字符串逐字符比较ASCII码对比，对比到有差异的字符，返回它们之间的差值
		String str1 = "strings";
        String str2 = "Strings";
        String str3 = "Strings123";
        int result = str1.compareTo( str2 );
        System.out.println(str1 + " compareTo " + str2 + " : " + result);
        result = str2.compareTo( str3 );
        System.out.println(str2 + " compareTo " + str3 + " : " + result);
        result = str3.compareTo( str1 );
        System.out.println(str3 + " compareTo " + str1 + " : " + result);
		result = str1.compareToIgnoreCase( str2 );
        System.out.println(str1 + " compareToIgnoreCase " + str2 + " : " + result);
        result = str2.compareTo( str3 );
        System.out.println(str2 + " compareToIgnoreCase " + str3 + " : " + result);
        result = str3.compareTo( str1 );
        System.out.println(str3 + " compareToIgnoreCase " + str1 + " : " + result);
		
		
		//endsWith() 判断字符串对象是否以指定后缀结尾
		System.out.println("Is " + str3 + " endsWith 123 ? \t" + str3.endsWith("123"));
		
		
		//indexOf() 返回字符、字符串第一次出现的位置
		System.out.println("The indexOf the a in " + str1 + " is: " +str1.indexOf('a'));
		System.out.println("The indexOf the s in " + str1 + " is: " +str1.indexOf('s'));
		System.out.println("The indexOf the s begin in index 1 in " + str1 + " is: " +str1.indexOf('s',1));
		//lastIndexOf() 返回字符、字符串最后一次出现的位置
		System.out.println("The lastIndexOf the a in " + str1 + " is: " +str1.lastIndexOf('a'));
		System.out.println("The lastIndexOf the s in " + str1 + " is: " +str1.lastIndexOf('s'));
		System.out.println("The lastIndexOf the s begin in index 5 in " + str1 + " is: " +str1.lastIndexOf('s',5));//反向查询
		
		
		//matches() 检验字符串对象与给定的正则表达式是否匹配
		
		
		//replace() 将旧的字符换成指定的新字符,返回新的字符串对象
		System.out.println( str1 + "replace s to a : " + str1.replace('s','a'));
		
	};

}
