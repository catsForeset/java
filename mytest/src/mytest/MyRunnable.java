package mytest;

//eclipse������ʱ������Interfacesѡ�����Ҫ�̳е���/�ӿڣ����Զ����سɼ̳����
public class MyRunnable implements Runnable {
	private volatile boolean active;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		active = true;
		int i = 0;
		while (active) {
			i++;
			System.out.println(i);
		}
	}
	
	public void stop()
	{
		active = false;
	}
	
	public static void main(String[] args)
	{
		MyRunnable mr = new MyRunnable();
		mr.run();
		mr.stop();
	}
}