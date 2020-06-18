package mytest;

//CTRL + F11,���п�ݼ�
public class InstanceCounter {
	//final��������������
	final int value = 10;
	public static final int BOXWIDTH = 6; //ͨ�� static �� final �����������ೣ��
	static final String TITLE = "Manager";
	//static������������ʹ�÷���
	private static int numInstances = 0;
	   protected static int getCount() {
	      return numInstances;
	   }
	 
	   private static void addInstance() {
	      numInstances++;
	   }
	 
	   InstanceCounter() {
	      InstanceCounter.addInstance();
	   }
	 
	   public static void main(String[] arguments) {
	      System.out.println("Starting with " +
	      InstanceCounter.getCount() + " instances");
	      System.out.println(numInstances);
	      for (int i = 0; i < 500; ++i){
	         new InstanceCounter();
	      }
	      System.out.println("Created " +
	      InstanceCounter.getCount() + " instances");
	      System.out.println(numInstances);
	      numInstances = 99;
	      System.out.println(numInstances);
	      //final
	      System.out.println(BOXWIDTH);
//	      BOXWIDTH = 14; value = 10;//���б�������Ϊfinal���η��ı������ܱ����¸�ֵ
	   }
}