package bridgemodel;

/**
 * 桥接模式 可以相互对接，更换武器 起到解耦合的作用 桥接模式是将抽象部分与它的实现部分分离，使它们都可以独立地变化。
 * 
 * @author xhwang
 * 
 */
public class Test
{

	// KongFu接口
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
			System.out.print("凌波微步");
		}
	}

	private class KongFuB implements KongFu
	{

		@Override
		public void showYourKF()
		{
			System.out.print("六脉神剑");
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
