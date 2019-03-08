package chainmodel;

public class Staff extends Approver
{
	public Staff(String name)
	{
		super(name);
	}

	@Override
	public boolean approve(int amount)
	{
		if (amount <= 1000)
		{
			System.out.print(name + "�Ѿ�������OK");
			return true;
		}
		return mApprover.approve(amount);
	}
}
