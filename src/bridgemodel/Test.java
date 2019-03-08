package bridgemodel;

/**
 * �Ž�ģʽ �����໥�Խӣ��������� �𵽽���ϵ����� �Ž�ģʽ�ǽ����󲿷�������ʵ�ֲ��ַ��룬ʹ���Ƕ����Զ����ر仯��
 * 
 * @author xhwang
 * 
 */
public class Test
{

	// KongFu�ӿ�
	interface KongFu
	{
		void showYourKF();
	}

	//
	private class KongFuA implements KongFu
	{

		@Override
		public void showYourKF()
		{
			System.out.print("�貨΢��");
		}
	}

	private class KongFuB implements KongFu
	{

		@Override
		public void showYourKF()
		{
			System.out.print("������");
		}
	}

	//
	private abstract class Man
	{
		protected KongFu kongFu;

		public Man(KongFu kongFu)
		{
			this.kongFu = kongFu;
		}

		protected void action()
		{
			kongFu.showYourKF();
		}
	}

	private class ManA extends Man
	{

		public ManA(KongFu kongFu)
		{
			super(kongFu);
		}
	}

	private class ManB extends Man
	{

		public ManB(KongFu kongFu)
		{
			super(kongFu);
		}
	}

	public static void main(String[] args)
	{
		KongFu kongFuA = new Test().new KongFuA();
		KongFu kongFuB = new Test().new KongFuB();

		Man manA = new Test().new ManA(kongFuB);
		manA.action();

		Man manB = new Test().new ManA(kongFuA);
		manB.action();
	}

}
