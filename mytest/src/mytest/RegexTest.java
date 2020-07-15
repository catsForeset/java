package mytest;

//引入正则表达式包
import java.util.regex.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
	public static void main(String[] args)
	{
		//正则表达式
		//. 点号匹配任意字符,* 星号零次或多次匹配前面的字符或子表达式。
		String str = "test string";
		//.*test.* 表示：无论 test 前（前一个.*）后（后一个.*）是什么字符，只要出现 test，则表示正则匹配成功。
		String pattern = ".*test.*";
		boolean isMatch = Pattern.matches(pattern,str);
		System.out.println("字符串是否含有子字符串'test'：" + isMatch);
		String pat = "test";//当字符串是 "test"，且没有空白和其他字符时，正则才能匹配成功。
		boolean m = Pattern.matches(pat,str);
		System.out.println("字符串是否为'test'：" + m);
		
		
		//{n} n 是非负整数。表示{n} 之前的字符正好匹配 n 次。
		String f = "food";
		String g = "group";
		String p1 = ".*o{2}.*";//字符 o 出现两次 
		boolean mf = Pattern.matches(p1,f);
		System.out.println("字符串'" + f + "'是否含有两个'o'：" + mf);
		System.out.println("字符串'" + g + "'是否含有两个'o'：" + Pattern.matches(p1,g));
		//{n,} n 是非负整数。表示{n,} 之前的字符至少匹配 n 次。
		String s = "start";
		String p2 = ".*o{1}.*";
		System.out.println("字符串'" + f + "'是否至少含有一个'o'：" + Pattern.matches(p2,f));
		System.out.println("字符串'" + g + "'是否至少含有一个'o'：" + Pattern.matches(p2,g));
		System.out.println("字符串'" + s + "'是否至少含有一个'o'：" + Pattern.matches(p2,s));
		//{n,m} n 和 m 是非负整数,n <= m,匹配之前的字符至少 n 次，至多 m 次
		String p3 = ".*o{2,4}.*";
		System.out.println("字符串'" + f + "'是否含有两个到四个'o'：" + Pattern.matches(p3,f));
		System.out.println("字符串'" + g + "'是否含有两个到四个'o'：" + Pattern.matches(p3,g));
		System.out.println("字符串'" + s + "'是否含有两个到四个'o'：" + Pattern.matches(p3,s));
		String p4 = ".*o{0,1}.*";
		System.out.println("字符串'" + f + "'是否不含有或者只含有一个'o'：" + Pattern.matches(p4,f));//匹配了第一个o
		System.out.println("字符串'" + g + "'是否不含有或者只含有一个'o'：" + Pattern.matches(p4,g));
		System.out.println("字符串'" + s + "'是否不含有或者只含有一个'o'：" + Pattern.matches(p4,s));
		
		//x|y 匹配 x或y
		System.out.println("字符串'" + f + "'是否含有字符'z'或字符'food'：" + Pattern.matches("z|food",f));
		
		//[xyz] 字符集，匹配包含的任一字符
		String px = ".*[abcd].*";
		System.out.println("字符串'" + s + "'是否含有[abcd]集中的字符：" + Pattern.matches(px,s));
		System.out.println("字符串'" + f + "'是否含有[abcd]集中的字符：" + Pattern.matches(px,f));
		System.out.println("字符串'" + g + "'是否含有[abcd]集中的字符：" + Pattern.matches(px,g));
		
		//[^xyz] 反向字符集，匹配未包含的任何字符
		String unpx = ".*[^abcd].*";
		String a = "abc";
		String i = "91247";
		System.out.println("字符串'" + s + "'是否含有不在[abcd]集中的字符：" + Pattern.matches(unpx,s));
		System.out.println("字符串'" + i + "'是否含有不在[abcd]集中的字符：" + Pattern.matches(unpx,i));
		System.out.println("字符串'" + a + "'是否含有不在[abcd]集中的字符：" + Pattern.matches(unpx,a));
		
		//[a-z] 字符范围。匹配在指定范围内的任何字符。
		String str_a = "x";
		String str_b = "1";
		System.out.println("字符串'" + str_a + "'是否有在[a-d]集中的字符：" + Pattern.matches("[a-d]",str_a));
		System.out.println("字符串'" + str_b + "'是否有在[0-9]集中的字符：" + Pattern.matches("[0-9]",str_b));
		
		//[^a-z] 反向字符范围。匹配不在指定范围内的任何字符。
		System.out.println("字符串'" + str_a + "'是否有不在[a-d]集中的字符：" + Pattern.matches("[^a-d]",str_a));
		System.out.println("字符串'" + str_b + "'是否有不在[0-9]集中的字符：" + Pattern.matches("[^0-9]",str_b));
		
		
		//* 零次或多次匹配前面的字符或子表达式
		System.out.println("a* : " + Pattern.matches("a*","a"));//a*,能匹配:空字符串,a,aaa...a
		System.out.println("ab* ：" + Pattern.matches("ab*","ab"));//ab*,能匹配:a,b,ab,abbbb...b
		System.out.println("ab* ：" + Pattern.matches("a*b","ab"));
		//+ 一次或多次匹配前面的字符或子表达式
		System.out.println("a+ ：" + Pattern.matches("a+","aaa"));//a+,能匹配 a,aaa...a
		System.out.println("ab+ ：" + Pattern.matches("ab+","abbbbb"));//ab+,能匹配 ab,abbbb...b
		//? 零次或一次匹配前面的字符或子表达式
		System.out.println("a? ：" + Pattern.matches("a?","a"));//a*,能匹配:空字符串,a
		System.out.println("ab? ：" + Pattern.matches("ab?","a"));//ab?,能匹配 a,ab
		System.out.println("abc? ：" + Pattern.matches("abc?","a"));//ab?,能匹配 ab,abc
		
		
		
		//捕获组 从左到右，第一个小括号内的内容就是第一组，依次分组
		String line = "This order was placed for QT3000! OK?";
		String pattern2 = "(\\D*)(\\d+)(.*)";//在 java 中使用两个反斜杠\\等于其他语言的一个反斜杠\。\\D等价于\D,匹配非数字字符。
		Pattern r = Pattern.compile(pattern2);
		Matcher m2 = r.matcher(line);
		if(m2.find()) {
			System.out.println("Found value: " + m2.group(0) );//默认组
			System.out.println("Found value: " + m2.group(1) );//第一组(\\D*)，匹配非数字
			System.out.println("Found value: " + m2.group(2) );//第二组(\\d+)，匹配数字
			System.out.println("Found value: " + m2.group(3) );//第三组(.*)，匹配任何字符
		} else {
			System.out.println("NO MATCH");
		}
		
		
		// \b 匹配一个字的边界，即字与空格间的位置。记忆点：b 是 brim（边缘）的缩写，大写则是非边缘。
		Pattern bp = Pattern.compile("e\\b");
		Matcher bm = bp.matcher("The matches");
		//find() 尝试查找与该模式匹配的输入序列的下一个子序列。find()之后才能知道查找结果，才能执行start(),end(),group()等方法
		while(bm.find()) {
			System.out.println("\\b: " + bm.start());//返回匹配成功的索引
			System.out.println("\\b: " + bm.end());//返回最后匹配字符后一位索引
		}
		
		
		//lookingAt 匹配输入的序列，从第一个字符开始匹配，有符合匹配项的就返回 true ，不要求整个序列都匹配
		//matches 匹配输入的序列，要求整个序列都匹配
		Pattern ptest = Pattern.compile("b*");//或ab*,lookingAt都能匹配成功
		Matcher mtest = ptest.matcher("aaaaab");
		System.out.println("lookingAt() :" + mtest.lookingAt());
		System.out.println("matches() :" + mtest.matches());
		
		
		// \B 匹配非边界的字符，即不再空格旁边的字符
		Pattern Bpat = Pattern.compile("e\\B");
		Matcher Bmat = Bpat.matcher("The matches");
		while(Bmat.find()) {
			System.out.println("\\B: " + Bmat.start());
			System.out.println("\\B: " + Bmat.end());
		}
		
		
		// \d 匹配数字字符。记忆点，d 是 digital(数字)的缩写，D则是非数字字符。
		Pattern dpat = Pattern.compile("\\d");
		Matcher dmat = dpat.matcher("1223b");
		System.out.println("\\d lookingAt(): " + dmat.lookingAt());
		System.out.println("\\d matches(): " + dmat.matches());
		// \D 匹配非数字字符
		Pattern Dpat = Pattern.compile("\\D");
		Matcher Dmat = Dpat.matcher("~");
		System.out.println("\\D lookingAt(): " + Dmat.lookingAt());
		System.out.println("\\D matches(): " + Dmat.matches());
		
		
		// \f 匹配换页符
		Pattern fpat = Pattern.compile("\\f");
		Matcher fmat = fpat.matcher("gonna change page \f");
		while(fmat.find()) {
			System.out.println("\\f start()" + fmat.start());
			System.out.println("\\f end()" + fmat.end());
		}
		// \n 匹配换行符
		Pattern npat = Pattern.compile("\\n");
		Matcher nmat = npat.matcher("test\ntest\n");
		System.out.print("test\ntest\n ");
		while(nmat.find()) {
			System.out.println("\\n start()" + nmat.start());
			System.out.println("\\n end()" + nmat.end());
		}
		// \r 匹配回车符
		Pattern rpat = Pattern.compile("\\r");
		Matcher rmat = rpat.matcher("hello hhhhhhh\rgoodbye");//回车符，将光标返回行的开头处
		System.out.println("hello hhhhhhh\rgoodbye");
		while(rmat.find()){
			System.out.println("\\r start()" + rmat.start());
			System.out.println("\\r end()" + rmat.end());
		}
		
		
	}
}