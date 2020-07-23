package mytest;

//����������ʽ��
import java.util.regex.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
	public static void main(String[] args)
	{
		//������ʽ
		//. ���ƥ�������ַ�,* �Ǻ���λ���ƥ��ǰ����ַ����ӱ��ʽ��
		String str = "test string";
		//.*test.* ��ʾ������ test ǰ��ǰһ��.*���󣨺�һ��.*����ʲô�ַ���ֻҪ���� test�����ʾ����ƥ��ɹ���
		String pattern = ".*test.*";
		boolean isMatch = Pattern.matches(pattern,str);
		System.out.println("�ַ����Ƿ������ַ���'test'��" + isMatch);
		String pat = "test";//���ַ����� "test"����û�пհ׺������ַ�ʱ���������ƥ��ɹ���
		boolean m = Pattern.matches(pat,str);
		System.out.println("�ַ����Ƿ�Ϊ'test'��" + m);
		
		
		//{n} n �ǷǸ���������ʾ{n} ֮ǰ���ַ�����ƥ�� n �Ρ�
		String f = "food";
		String g = "group";
		String p1 = ".*o{2}.*";//�ַ� o �������� 
		boolean mf = Pattern.matches(p1,f);
		System.out.println("�ַ���'" + f + "'�Ƿ�������'o'��" + mf);
		System.out.println("�ַ���'" + g + "'�Ƿ�������'o'��" + Pattern.matches(p1,g));
		//{n,} n �ǷǸ���������ʾ{n,} ֮ǰ���ַ�����ƥ�� n �Ρ�
		String s = "start";
		String p2 = ".*o{1}.*";
		System.out.println("�ַ���'" + f + "'�Ƿ����ٺ���һ��'o'��" + Pattern.matches(p2,f));
		System.out.println("�ַ���'" + g + "'�Ƿ����ٺ���һ��'o'��" + Pattern.matches(p2,g));
		System.out.println("�ַ���'" + s + "'�Ƿ����ٺ���һ��'o'��" + Pattern.matches(p2,s));
		//{n,m} n �� m �ǷǸ�����,n <= m,ƥ��֮ǰ���ַ����� n �Σ����� m ��
		String p3 = ".*o{2,4}.*";
		System.out.println("�ַ���'" + f + "'�Ƿ����������ĸ�'o'��" + Pattern.matches(p3,f));
		System.out.println("�ַ���'" + g + "'�Ƿ����������ĸ�'o'��" + Pattern.matches(p3,g));
		System.out.println("�ַ���'" + s + "'�Ƿ����������ĸ�'o'��" + Pattern.matches(p3,s));
		String p4 = ".*o{0,1}.*";
		System.out.println("�ַ���'" + f + "'�Ƿ񲻺��л���ֻ����һ��'o'��" + Pattern.matches(p4,f));//ƥ���˵�һ��o
		System.out.println("�ַ���'" + g + "'�Ƿ񲻺��л���ֻ����һ��'o'��" + Pattern.matches(p4,g));
		System.out.println("�ַ���'" + s + "'�Ƿ񲻺��л���ֻ����һ��'o'��" + Pattern.matches(p4,s));
		
		//x|y ƥ�� x��y
		System.out.println("�ַ���'" + f + "'�Ƿ����ַ�'z'���ַ�'food'��" + Pattern.matches("z|food",f));
		
		//[xyz] �ַ�����ƥ���������һ�ַ�
		String px = ".*[abcd].*";
		System.out.println("�ַ���'" + s + "'�Ƿ���[abcd]���е��ַ���" + Pattern.matches(px,s));
		System.out.println("�ַ���'" + f + "'�Ƿ���[abcd]���е��ַ���" + Pattern.matches(px,f));
		System.out.println("�ַ���'" + g + "'�Ƿ���[abcd]���е��ַ���" + Pattern.matches(px,g));
		
		//[^xyz] �����ַ�����ƥ��δ�������κ��ַ�
		String unpx = ".*[^abcd].*";
		String a = "abc";
		String i = "91247";
		System.out.println("�ַ���'" + s + "'�Ƿ��в���[abcd]���е��ַ���" + Pattern.matches(unpx,s));
		System.out.println("�ַ���'" + i + "'�Ƿ��в���[abcd]���е��ַ���" + Pattern.matches(unpx,i));
		System.out.println("�ַ���'" + a + "'�Ƿ��в���[abcd]���е��ַ���" + Pattern.matches(unpx,a));
		
		//[a-z] �ַ���Χ��ƥ����ָ����Χ�ڵ��κ��ַ���
		String str_a = "x";
		String str_b = "1";
		System.out.println("�ַ���'" + str_a + "'�Ƿ�����[a-d]���е��ַ���" + Pattern.matches("[a-d]",str_a));
		System.out.println("�ַ���'" + str_b + "'�Ƿ�����[0-9]���е��ַ���" + Pattern.matches("[0-9]",str_b));
		
		//[^a-z] �����ַ���Χ��ƥ�䲻��ָ����Χ�ڵ��κ��ַ���
		System.out.println("�ַ���'" + str_a + "'�Ƿ��в���[a-d]���е��ַ���" + Pattern.matches("[^a-d]",str_a));
		System.out.println("�ַ���'" + str_b + "'�Ƿ��в���[0-9]���е��ַ���" + Pattern.matches("[^0-9]",str_b));
		
		
		//* ��λ���ƥ��ǰ����ַ����ӱ��ʽ
		System.out.println("a* : " + Pattern.matches("a*","a"));//a*,��ƥ��:���ַ���,a,aaa...a
		System.out.println("ab* ��" + Pattern.matches("ab*","ab"));//ab*,��ƥ��:a,b,ab,abbbb...b
		System.out.println("ab* ��" + Pattern.matches("a*b","ab"));
		//+ һ�λ���ƥ��ǰ����ַ����ӱ��ʽ
		System.out.println("a+ ��" + Pattern.matches("a+","aaa"));//a+,��ƥ�� a,aaa...a
		System.out.println("ab+ ��" + Pattern.matches("ab+","abbbbb"));//ab+,��ƥ�� ab,abbbb...b
		//? ��λ�һ��ƥ��ǰ����ַ����ӱ��ʽ
		System.out.println("a? ��" + Pattern.matches("a?","a"));//a*,��ƥ��:���ַ���,a
		System.out.println("ab? ��" + Pattern.matches("ab?","a"));//ab?,��ƥ�� a,ab
		System.out.println("abc? ��" + Pattern.matches("abc?","a"));//ab?,��ƥ�� ab,abc
		
		
		
		//(pattern) ������,�����ң���һ��С�����ڵ����ݾ��ǵ�һ�飬���η���
		String line = "This order was placed for QT3000! OK?";
		String pattern2 = "(\\D*)(\\d+)(.*)";//�� java ��ʹ��������б��\\�����������Ե�һ����б��\��\\D�ȼ���\D,ƥ��������ַ���
		Pattern r = Pattern.compile(pattern2);
		Matcher m2 = r.matcher(line);
		if(m2.find()) {
			System.out.println("Found value: " + m2.group(0) );//Ĭ����
			System.out.println("Found value: " + m2.group(1) );//��һ��(\\D*)��ƥ�������
			System.out.println("Found value: " + m2.group(2) );//�ڶ���(\\d+)��ƥ������
			System.out.println("Found value: " + m2.group(3) );//������(.*)��ƥ���κ��ַ�
		} else {
			System.out.println("NO MATCH");
		}
		
		
		//(?:pattern) ƥ�� pattern ���������ƥ����ӱ��ʽ��
		Pattern r3 = Pattern.compile("industr(?:y|ies)");//��ƥ�� industr��ֻ��ƥ�� industry �� industries
		Matcher m3 = r3.matcher("industry industries industr industroooo");
		while(m3.find()) {
			System.out.println("Found value 3: " + m3.group());
			System.out.println("Found value 3: " + m3.start());
			System.out.println("Found value 3: " + m3.end());
		}
		
		//(?=pattern) ִ������Ԥ�������������ӱ��ʽ, ƥ�䴦��ƥ�� pattern ���ַ�������ʼ����ַ�����
		Pattern r4 = Pattern.compile("industr(?=y|ies)");//��ƥ�� industr��ֻ��ƥ�� industry �� industries ����� industr ���֡�
		Matcher m4 = r4.matcher("industry industries industr industroooo");//
		while(m4.find()) {
			System.out.println("Found value 4: " + m4.group());
			System.out.println("Found value 4: " + m4.start());
			System.out.println("Found value 4: " + m4.end());
		}
		
		//(?!pattern) ִ�з���Ԥ�������������ӱ��ʽ���ñ��ʽƥ�䲻����ƥ�� pattern ���ַ�������ʼ��������ַ�����
		Pattern r5 = Pattern.compile("industr(?!y|ies)");//ƥ��� industry �� industries ֮��������ַ����� industr ���֡�
		Matcher m5 = r5.matcher("industry industries industr industroooo");//
		while(m5.find()) {
			System.out.println("Found value 5: " + m5.group());
			System.out.println("Found value 5: " + m5.start());
			System.out.println("Found value 5: " + m5.end());
		}
		
		
		
		// \b ƥ��һ���ֵı߽磬������ո���λ�á�����㣺b �� brim����Ե������д����д���ǷǱ�Ե��
		Pattern bp = Pattern.compile("e\\b");
		Matcher bm = bp.matcher("The matches");
		//find() ���Բ������ģʽƥ����������е���һ�������С�find()֮�����֪�����ҽ��������ִ��start(),end(),group()�ȷ���
		while(bm.find()) {
			System.out.println("\\b: " + bm.start());//����ƥ��ɹ�������
			System.out.println("\\b: " + bm.end());//�������ƥ���ַ���һλ����
		}
		
		
		//lookingAt ƥ����������У��ӵ�һ���ַ���ʼƥ�䣬�з���ƥ����ľͷ��� true ����Ҫ���������ж�ƥ��
		//matches ƥ����������У�Ҫ���������ж�ƥ��
		Pattern ptest = Pattern.compile("b*");//��ab*,lookingAt����ƥ��ɹ�
		Matcher mtest = ptest.matcher("aaaaab");
		System.out.println("lookingAt() :" + mtest.lookingAt());
		System.out.println("matches() :" + mtest.matches());
		
		
		// \B ƥ��Ǳ߽���ַ��������ٿո��Աߵ��ַ�
		Pattern Bpat = Pattern.compile("e\\B");
		Matcher Bmat = Bpat.matcher("The matches");
		while(Bmat.find()) {
			System.out.println("\\B: " + Bmat.start());
			System.out.println("\\B: " + Bmat.end());
		}
		
		
		// \d ƥ�������ַ�������㣬d �� digital(����)����д��D���Ƿ������ַ���
		Pattern dpat = Pattern.compile("\\d");
		Matcher dmat = dpat.matcher("1223b");
		System.out.println("\\d lookingAt(): " + dmat.lookingAt());
		System.out.println("\\d matches(): " + dmat.matches());
		// \D ƥ��������ַ�
		Pattern Dpat = Pattern.compile("\\D");
		Matcher Dmat = Dpat.matcher("~");
		System.out.println("\\D lookingAt(): " + Dmat.lookingAt());
		System.out.println("\\D matches(): " + Dmat.matches());
		
		
		// \f ƥ�任ҳ��
		Pattern fpat = Pattern.compile("\\f");
		Matcher fmat = fpat.matcher("gonna change page \f");
		while(fmat.find()) {
			System.out.println("\\f start()" + fmat.start());
			System.out.println("\\f end()" + fmat.end());
		}
		// \n ƥ�任�з�
		Pattern npat = Pattern.compile("\\n");
		Matcher nmat = npat.matcher("test\ntest\n");
		System.out.print("test\ntest\n ");
		while(nmat.find()) {
			System.out.println("\\n start()" + nmat.start());
			System.out.println("\\n end()" + nmat.end());
		}
		// \r ƥ��س���
		//�س���������귵���еĿ�ͷ�������ܻὫ��һ��֮ǰ��������ǵ���
		Pattern rpat = Pattern.compile("\\r");
		Matcher rmat = rpat.matcher("hello hhhhhhh\rgoodbye");
		System.out.println("hello hhhhhhh\rgoodbye");
		while(rmat.find()){
			System.out.println("\\r start()" + rmat.start());
			System.out.println("\\r end()" + rmat.end());
		}
		
		
		// \t �Ʊ��ƥ��
		Pattern tpat = Pattern.compile("\\t");
		Matcher tmat = tpat.matcher("hhhhhhh\tmmm");
		System.out.println("hhhhhhh\tmmm");
		while(tmat.find()){
			System.out.println("\\t start()" + tmat.start());
			System.out.println("\\t end()" + tmat.end());
		}
		// \v ��ֱ�Ʊ��ƥ��,\v�Ƿ�ת���ַ���
		// Pattern vpat = Pattern.compile("\\v");
		// Matcher vmat = vpat.matcher("123\v456");
		// System.out.println("123\v456");
		// while(vmat.find()){
			// System.out.println("\\v start()" + vmat.start());
			// System.out.println("\\v end()" + vmat.end());
		// }
		
		
		// \s ƥ���κοհ��ַ����� [ \f\n\r\t\v] ��Ч������㣺s �� space���հף�����д��S���Ƿǿհס�
		System.out.println("\\s: " + Pattern.matches("\\s"," "));
		System.out.println("\\s: " + Pattern.matches("\\s","\t"));
		// \S ƥ���κηǿհ��ַ����� [^ \f\n\r\t\v] ��Ч
		System.out.println("\\S: " + Pattern.matches("\\S","\t"));
		System.out.println("\\S: " + Pattern.matches("\\S","l"));
		
		
		// \w ƥ�������ַ��������»��ߡ���[A-Za-z0-9_]��Ч������㣺w �� word ����д��W���Ƿ����ࡣ
		Pattern wpat = Pattern.compile("\\w");
		Matcher wmat = wpat.matcher("5");
		System.out.println("\\w: " + wmat.matches());
		// \W ƥ��������ַ�����[^A-Za-z0-9_]��Ч
		Pattern Wpat = Pattern.compile("\\W");
		Matcher Wmat = Wpat.matcher(" ");//�հ�Ҳ�Ƿ��ַ�����[^A-Za-z0-9_]��Χ��
		System.out.println("\\W: " + Wmat.matches());
		
		
		// \xn ƥ��ʮ������ת���롣���� n ��ʮ������ת���룬�� ASCII ���е�ʮ�������롣����㣬ǰ׺ x ֵʮ�����ơ�
		System.out.println("\\xn: " + Pattern.matches("\\x41","A"));//��ĸ A �� ASCII ���Ӧ��ʮ���������� 0x41
		
		
		// \num �������ò���������ݡ�num��һ����������
		Pattern numpat = Pattern.compile("(.)\\1");// ������ò����飨.��������һ�Ρ�����ƥ��������ͬ���ַ���
		Matcher nummat = numpat.matcher("aa dfh bb asd uuuu");//��һ��ƥ�䵽a�����һ������ƥ�䵽a������aa������ͬ��
		while(nummat.find()) {
			System.out.println("\\num: " + nummat.group());
			System.out.println("\\num statr(): " + nummat.start());
			System.out.println("\\num end(): " + nummat.end());
		}
		//��һ��Բ�����ڵ�����ƥ���ַ�a�������ַ������\1���λ�ñ������ַ�a,�ڶ�������ƥ���ַ�b,�ڵ����ڶ���λ��\2�������ַ�b
		Pattern numpat2 = Pattern.compile("([a-z])([a-z])\\2\\1");
		Matcher nummat2 = numpat2.matcher("abba aaaa bbbb baab");
		//��һ��ƥ�䵽 a(a)���ڶ���ƥ�䵽 b(ab)��������ƥ�䵽 c(abc)��\3��ʾ���һ�������ǵ�����ƥ��� c(abcc)��\1��ʾ��ʾ�����ڶ��������ǵ�һ��ƥ�䵽�� a(abcac)��\2��ʾ���������������ǵڶ���ƥ�䵽�� b(abcbac)��
		// Pattern numpat2 = Pattern.compile("([a-z])([a-z])([a-z])\\2\\1\\3");//��ƥ�䵽abcbca
		// Matcher nummat2 = numpat2.matcher("abcbca");
		while(nummat2.find()) {
			System.out.println("\\nums: " + nummat2.group());
			System.out.println("\\nums statr(): " + nummat2.start());
			System.out.println("\\nums end(): " + nummat2.end());
		}
		
		
		// \n ��� n �ǰ˽��������� \n �ǰ˽���ת�塣��� n ǰ���в����ӱ��ʽ���� \n �Ƿ������á�
		System.out.println("\\n �˽���: " + Pattern.matches("\\0101","A"));//��ĸ A �� ASCII ���Ӧ�İ˽������� 0101
		System.out.println("\\n ��������: " + Pattern.matches("(.)\\1","AA"));
		
		
		// \nm ��� \nm ֮ǰ�� nm ���ӱ��ʽ���� \nm �Ƿ������á���� \nm ֮ǰ�� n ���ӱ��ʽ���� \n �Ƿ������ã���������ַ� m��
		System.out.println("\\nm �������ü��ַ�: " + Pattern.matches("(.)\\1a","AAa"));
		System.out.println("\\nm �������ü��ַ�: " + Pattern.matches("(.)\\12","AA2"));
		System.out.println("\\nm ��������: " + Pattern.matches("(.)(.)(.)(.)(.)(.)(.)(.)(.)(.)(.)\\11","AAAAAAAAAAAA"));//���һλ����12λ���͵� 11 ��ƥ���һ��
		
		
		// \nml �� n �ǰ˽����� (0-3)��m �� l �ǰ˽����� (0-7) ʱ��ƥ��˽���ת���� nml��
		System.out.println("\\nml �˽���: " + Pattern.matches("\\0175","}"));//���� } �� ASCII ���Ӧ�İ˽������� 0175
		
		
		// \\un ƥ�� Unicode �ַ���n ������λʮ����������ʾ�� Unicode �ַ����ɲο� Unicode �������㣺ǰ׺ u ָ���� Unicode �ַ��� ƥ�� Unicode �ַ���n ������λʮ����������ʾ�� Unicode �ַ����ɲο� Unicode �������㣺ǰ׺ u ָ���� Unicode �ַ���
		System.out.println("\\un Unicode: " + Pattern.matches("\\u0041","A"));//��ĸ A �� Unicode ���� U+0041��
		
		
		// ^ ƥ�������ַ�����ʼ��λ��
		Pattern start = Pattern.compile("^1");// ^1 �ĺ����ǣ����ƥ����ַ�����һ���ַ���1����ƥ��ɹ�������ʧ��
		Matcher mstart = start.matcher("111");//���ƥ�����"211"����ƥ�䲻��
		while(mstart.find()) {
			System.out.println("^ƥ���ַ�����ʼ��λ��: " + mstart.group());
		}
		
		// $ ƥ�������ַ�����β��λ��
		Pattern end = Pattern.compile("[0-9]$");//��������ֽ�β����ƥ��ɹ�������ʧ��
		Matcher mend = end.matcher("fdhdjk588");
		while(mend.find()) {
			System.out.println("^ƥ���ַ�����β��λ��: " + mend.group());
		}
		
		
		//����������ʽ
		System.out.println("���ģ�" + Pattern.matches("[\u4e00-\\u9fa5]","��"));
		System.out.println("˫�ֽ��ַ���" + Pattern.matches("[^\\x00-\\xff]","��"));//���Ķ���
		
		Pattern upat = Pattern.compile("[a-zA-z]+://[^\\s]*");//׼ȷ������(https?|ftp|file)://[-A-Za-z0-9+&@#/%?=~_|!:,.;]+[-A-Za-z0-9+&@#/%=~_|]
		Matcher umat = upat.matcher("http://www.baidu.com");
		while(umat.find()) {
			System.out.println("ƥ��url��ַ��" + umat.group());
		}
		
		Pattern mobile = Pattern.compile("[1-9][0-9]{4,}");
		Matcher mmobile = mobile.matcher("1158745236");
		while(mmobile.find()) {
			System.out.println("ƥ��qq�ţ�" + mmobile.group());
		}
		
		Pattern post = Pattern.compile("[1-9]\\d{5}(?!\\d)");
		Matcher mpost = post.matcher("621102f3");
		while(mpost.find()) {
			System.out.println("ƥ���й��������룺" + mpost.group());
		}
		
	
		Pattern id = Pattern.compile("^(\\d{6})(\\d{4})(\\d{2})(\\d{2})(\\d{3})([0-9]|X)$");//6λǰ׺��4λ��ݣ�2λ�·ݣ�2λ���ڣ�β��4λ������һλ����ΪX��
		Matcher mid = id.matcher("548648199606082556");
		while(mid.find()) {
			System.out.println("��ƥ��18λ���֤���룺" + mid.group());
		}
		
		String pinteger = "^-?[1-9]\\d*$";//������ "^[1-9]\\d*$";������ "^-[1-9]\\d*$";���� "^-?[1-9]\\d*$";�Ǹ����� "^[1-9]\\d*|0$";�������� "^-[1-9]\\d*|0$"
		Pattern integer = Pattern.compile(pinteger);
		Matcher minteger = integer.matcher("-45");
		while(minteger.find()) {
			System.out.println("ƥ��������" + minteger.group());
		}
		
		Pattern floats = Pattern.compile("^[1-9]\\d*\\.\\d*|0\\.\\d*[1-9]\\d*$");// . ƥ���"\r\n"֮����κε����ַ���\\.ƥ���ַ�"."
		//�������� "^-[1-9]\\d*\\.\\d*|0\\.\\d*[1-9]\\d*$"
		Matcher mfloats = floats.matcher("0.1");
		while(mfloats.find()) {
			System.out.println("ƥ�両������" + mfloats.group());
		}
		
	}
}