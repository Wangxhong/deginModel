package chainmodel;

/**
 * ��������ôһЩ��ɢ�Ĺ��ܽڵ㣬���Ǹ��Գе����Ե����񣬷ֹ���ȷ����˾��ְ��Ϊ�˸���Ч���������ؽ���ͻ������⣬���Ƿ����ŶӾ���
 * ���മ�������γ�һ����������δ�������
 * ������������ģʽ�����ˡ���Ȼ�����ĽṹҲ��һ���ǵ��������������������ͷֲ�ṹ����Ҫ����ҵ�񳡾�������ȥ������ã��������������Ϊ�˴���ĳ������������
 * ����ȷ��ҵ��һ�����ߵ���Ӧ�����νڵ��ϲ��õ���Ӧ�Ĵ���
 * 
 * @author xhwang
 */
public abstract class Approver
{
	protected Approver mApprover;
	protected String name;

	public Approver(String name)
	{
		this.name = name;
	}

	// ��ʽģʽ����ÿ�����󶼳����ϼ������� ���൱�����ޣ�
	protected Approver setNextApprover(Approver approver)
	{
		this.mApprover = approver;

		return mApprover;
	}

	// �������ʵ�ָ÷���
	public abstract boolean approve(int amount);
}
