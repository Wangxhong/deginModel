package chainmodel;

public class CEO extends Approver
{
	public CEO(String name)
	{
		super(name);
	}

	@Override
	public boolean approve(int amount)
	{
		if (amount <= 10000)
		{
			System.out.print(name + "�Ѿ�������OK");
			return true;
		}
		return false;
	}
}