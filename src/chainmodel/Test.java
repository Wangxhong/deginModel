package chainmodel;

public class Test
{

	public Test()
	{
	}

	public static void main(String[] args)
	{
		Approver approver = new Staff("ÀÏ»Æ");
		approver.setNextApprover(new Manger("Â¦¾­Àí")).setNextApprover(
				new CEO("CEO"));
		boolean ok = approver.approve(5000);
		System.out.print("OK:" + ok);
	}
}
