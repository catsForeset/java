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
		
		
		
		//(pattern) 捕获组,从左到右，第一个小括号内的内容就是第一组，依次分组
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
		
		
		//(?:pattern) 匹配 pattern 但不捕获该匹配的子表达式。
		Pattern r3 = Pattern.compile("industr(?:y|ies)");//不匹配 industr，只可匹配 industry 和 industries
		Matcher m3 = r3.matcher("industry industries industr industroooo");
		while(m3.find()) {
			System.out.println("Found value 3: " + m3.group());
			System.out.println("Found value 3: " + m3.start());
			System.out.println("Found value 3: " + m3.end());
		}
		
		//(?=pattern) 执行正向预测先行搜索的子表达式, 匹配处于匹配 pattern 的字符串的起始点的字符串。
		Pattern r4 = Pattern.compile("industr(?=y|ies)");//不匹配 industr。只可匹配 industry 和 industries 里面的 industr 部分。
		Matcher m4 = r4.matcher("industry industries industr industroooo");//
		while(m4.find()) {
			System.out.println("Found value 4: " + m4.group());
			System.out.println("Found value 4: " + m4.start());
			System.out.println("Found value 4: " + m4.end());
		}
		
		//(?!pattern) 执行反向预测先行搜索的子表达式，该表达式匹配不处于匹配 pattern 的字符串的起始点的搜索字符串。
		Pattern r5 = Pattern.compile("industr(?!y|ies)");//匹配除 industry 和 industries 之外的所有字符串的 industr 部分。
		Matcher m5 = r5.matcher("industry industries industr industroooo");//
		while(m5.find()) {
			System.out.println("Found value 5: " + m5.group());
			System.out.println("Found value 5: " + m5.start());
			System.out.println("Found value 5: " + m5.end());
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
		//回车符，将光标返回行的开头处。可能会将这一行之前的输出覆盖掉。
		Pattern rpat = Pattern.compile("\\r");
		Matcher rmat = rpat.matcher("hello hhhhhhh\rgoodbye");
		System.out.println("hello hhhhhhh\rgoodbye");
		while(rmat.find()){
			System.out.println("\\r start()" + rmat.start());
			System.out.println("\\r end()" + rmat.end());
		}
		
		
		// \t 制表符匹配
		Pattern tpat = Pattern.compile("\\t");
		Matcher tmat = tpat.matcher("hhhhhhh\tmmm");
		System.out.println("hhhhhhh\tmmm");
		while(tmat.find()){
			System.out.println("\\t start()" + tmat.start());
			System.out.println("\\t end()" + tmat.end());
		}
		// \v 垂直制表符匹配,\v非法转义字符？
		// Pattern vpat = Pattern.compile("\\v");
		// Matcher vmat = vpat.matcher("123\v456");
		// System.out.println("123\v456");
		// while(vmat.find()){
			// System.out.println("\\v start()" + vmat.start());
			// System.out.println("\\v end()" + vmat.end());
		// }
		
		
		// \s 匹配任何空白字符。与 [ \f\n\r\t\v] 等效。记忆点：s 是 space（空白）的缩写。S则是非空白。
		System.out.println("\\s: " + Pattern.matches("\\s"," "));
		System.out.println("\\s: " + Pattern.matches("\\s","\t"));
		// \S 匹配任何非空白字符。与 [^ \f\n\r\t\v] 等效
		System.out.println("\\S: " + Pattern.matches("\\S","\t"));
		System.out.println("\\S: " + Pattern.matches("\\S","l"));
		
		
		// \w 匹配字类字符，包括下划线。与[A-Za-z0-9_]等效。记忆点：w 是 word 的缩写。W则是非字类。
		Pattern wpat = Pattern.compile("\\w");
		Matcher wmat = wpat.matcher("5");
		System.out.println("\\w: " + wmat.matches());
		// \W 匹配非字类字符，与[^A-Za-z0-9_]等效
		Pattern Wpat = Pattern.compile("\\W");
		Matcher Wmat = Wpat.matcher(" ");//空白也是非字符，在[^A-Za-z0-9_]范围内
		System.out.println("\\W: " + Wmat.matches());
		
		
		// \xn 匹配十六进制转义码。其中 n 是十六进制转义码，即 ASCII 表中的十六进制码。记忆点，前缀 x 值十六进制。
		System.out.println("\\xn: " + Pattern.matches("\\x41","A"));//字母 A 的 ASCII 码对应的十六进制码是 0x41
		
		
		// \num 反向引用捕获组的数据。num是一个正整数。
		Pattern numpat = Pattern.compile("(.)\\1");// 向后引用捕获组（.）的数据一次。即可匹配两个相同的字符。
		Matcher nummat = numpat.matcher("aa dfh bb asd uuuu");//第一次匹配到a，最后一个必须匹配到a，则是aa。其他同理。
		while(nummat.find()) {
			System.out.println("\\num: " + nummat.group());
			System.out.println("\\num statr(): " + nummat.start());
			System.out.println("\\num end(): " + nummat.end());
		}
		//第一个圆括号内的正则匹配字符a，则在字符串最后\1这个位置必须是字符a,第二个括号匹配字符b,在倒数第二个位置\2必须是字符b
		Pattern numpat2 = Pattern.compile("([a-z])([a-z])\\2\\1");
		Matcher nummat2 = numpat2.matcher("abba aaaa bbbb baab");
		//第一组匹配到 a(a)，第二组匹配到 b(ab)，第三组匹配到 c(abc)，\3表示最后一个必须是第三组匹配的 c(abcc)，\1表示表示倒数第二个必须是第一组匹配到的 a(abcac)，\2表示倒数第三个必须是第二组匹配到的 b(abcbac)。
		// Pattern numpat2 = Pattern.compile("([a-z])([a-z])([a-z])\\2\\1\\3");//可匹配到abcbca
		// Matcher nummat2 = numpat2.matcher("abcbca");
		while(nummat2.find()) {
			System.out.println("\\nums: " + nummat2.group());
			System.out.println("\\nums statr(): " + nummat2.start());
			System.out.println("\\nums end(): " + nummat2.end());
		}
		
		
		// \n 如果 n 是八进制数，则 \n 是八进制转义。如果 n 前面有捕获子表达式，则 \n 是反向引用。
		System.out.println("\\n 八进制: " + Pattern.matches("\\0101","A"));//字母 A 的 ASCII 码对应的八进制码是 0101
		System.out.println("\\n 反向引用: " + Pattern.matches("(.)\\1","AA"));
		
		
		// \nm 如果 \nm 之前有 nm 个子表达式，则 \nm 是反向引用。如果 \nm 之前有 n 个子表达式，则 \n 是反向引用，后面跟有字符 m。
		System.out.println("\\nm 反向引用加字符: " + Pattern.matches("(.)\\1a","AAa"));
		System.out.println("\\nm 反向引用加字符: " + Pattern.matches("(.)\\12","AA2"));
		System.out.println("\\nm 反向引用: " + Pattern.matches("(.)(.)(.)(.)(.)(.)(.)(.)(.)(.)(.)\\11","AAAAAAAAAAAA"));//最后一位（第12位）和第 11 组匹配的一致
		
		
		// \nml 当 n 是八进制数 (0-3)，m 和 l 是八进制数 (0-7) 时，匹配八进制转义码 nml。
		System.out.println("\\nml 八进制: " + Pattern.matches("\\0175","}"));//符号 } 的 ASCII 码对应的八进制码是 0175
		
		
		// \\un 匹配 Unicode 字符。n 是以四位十六进制数表示的 Unicode 字符。可参考 Unicode 码表。记忆点：前缀 u 指的是 Unicode 字符。 匹配 Unicode 字符。n 是以四位十六进制数表示的 Unicode 字符。可参考 Unicode 码表。记忆点：前缀 u 指的是 Unicode 字符。
		System.out.println("\\un Unicode: " + Pattern.matches("\\u0041","A"));//字母 A 的 Unicode 码是 U+0041。
		
		
		// ^ 匹配输入字符串开始的位置
		Pattern start = Pattern.compile("^1");// ^1 的含义是，如果匹配的字符串第一个字符是1，则匹配成功，否则失败
		Matcher mstart = start.matcher("111");//如果匹配的是"211"，则匹配不到
		while(mstart.find()) {
			System.out.println("^匹配字符串起始的位置: " + mstart.group());
		}
		
		// $ 匹配输入字符串结尾的位置
		Pattern end = Pattern.compile("[0-9]$");//如果以数字结尾，则匹配成功，否则失败
		Matcher mend = end.matcher("fdhdjk588");
		while(mend.find()) {
			System.out.println("^匹配字符串结尾的位置: " + mend.group());
		}
		
		
		//常用正则表达式
		System.out.println("中文：" + Pattern.matches("[\u4e00-\\u9fa5]","换"));
		System.out.println("双字节字符：" + Pattern.matches("[^\\x00-\\xff]","，"));//中文逗号
		
		Pattern upat = Pattern.compile("[a-zA-z]+://[^\\s]*");//准确的正则：(https?|ftp|file)://[-A-Za-z0-9+&@#/%?=~_|!:,.;]+[-A-Za-z0-9+&@#/%=~_|]
		Matcher umat = upat.matcher("http://www.baidu.com");
		while(umat.find()) {
			System.out.println("匹配url地址：" + umat.group());
		}
		
		Pattern mobile = Pattern.compile("[1-9][0-9]{4,}");
		Matcher mmobile = mobile.matcher("1158745236");
		while(mmobile.find()) {
			System.out.println("匹配qq号：" + mmobile.group());
		}
		
		Pattern post = Pattern.compile("[1-9]\\d{5}(?!\\d)");
		Matcher mpost = post.matcher("621102f3");
		while(mpost.find()) {
			System.out.println("匹配中国邮政编码：" + mpost.group());
		}
		
	
		Pattern id = Pattern.compile("^(\\d{6})(\\d{4})(\\d{2})(\\d{2})(\\d{3})([0-9]|X)$");//6位前缀，4位年份，2位月份，2位日期，尾数4位（其中一位可能为X）
		Matcher mid = id.matcher("548648199606082556");
		while(mid.find()) {
			System.out.println("简单匹配18位身份证号码：" + mid.group());
		}
		
		String pinteger = "^-?[1-9]\\d*$";//正整数 "^[1-9]\\d*$";负整数 "^-[1-9]\\d*$";整数 "^-?[1-9]\\d*$";非负整数 "^[1-9]\\d*|0$";非正整数 "^-[1-9]\\d*|0$"
		Pattern integer = Pattern.compile(pinteger);
		Matcher minteger = integer.matcher("-45");
		while(minteger.find()) {
			System.out.println("匹配整数：" + minteger.group());
		}
		
		Pattern floats = Pattern.compile("^[1-9]\\d*\\.\\d*|0\\.\\d*[1-9]\\d*$");// . 匹配除"\r\n"之外的任何单个字符。\\.匹配字符"."
		//负浮点数 "^-[1-9]\\d*\\.\\d*|0\\.\\d*[1-9]\\d*$"
		Matcher mfloats = floats.matcher("0.1");
		while(mfloats.find()) {
			System.out.println("匹配浮点数：" + mfloats.group());
		}
		
	}
}