package chainmodel;

public class Manger extends Approver
{
	public Manger(String name)
	{
		super(name);
	}

	@Override
	public boolean approve(int amount)
	{
		if (amount <= 5000)
		{
			System.out.print(name + "ÒÑ¾­ÉóÅú£¬OK");
			return true;
		}
		return mApprover.approve(amount);
	}
}
