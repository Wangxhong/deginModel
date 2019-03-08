package chainmodel;

/**
 * 曾经有这么一些零散的功能节点，他们各自承担各自的义务，分工明确，各司其职。为了更高效，更完整地解决客户的问题，他们发扬团队精神，
 * 互相串联起来形成一个有序的责任传递链表
 * ，于是责任链模式诞生了。当然，它的结构也不一定非得是链表，甚至可以是树型分叉结构，这要根据业务场景看怎样去灵活运用，但其核心意义是为了处理某种连续的流程
 * ，并确保业务一定能走到相应的责任节点上并得到相应的处理。
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

	// 链式模式，让每个对象都持有上级的引用 （相当于套娃）
	protected Approver setNextApprover(Approver approver)
	{
		this.mApprover = approver;

		return mApprover;
	}

	// 子类各自实现该方法
	public abstract boolean approve(int amount);
}
