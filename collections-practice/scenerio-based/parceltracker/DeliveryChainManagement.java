class Stage{
	String name; 
	Stage next;
	
	Stage(String name)
	{
		this.name=name;
		this.next=null;
	}
}
public class DeliveryChainManagement
{
	public static void main(String[] args)
	{
		Stage packed=new Stage("Packed");
		Stage shipped=new Stage("Shipped");
		Stage transit=new Stage("In transit");
		Stage delivered=new Stage("Delivered");
		
		//linking stages
		packed.next=shipped;
		shipped.next=transit;
		transit.next=delivered;
		
		//add custom checkpoints
		Stage customs=new Stage("customs check");
		shipped.next=customs;
		customs.next=transit;
		
		//track parcel
		Stage current=packed;
		System.out.println("parcel tracking status:");
		while(current!=null)
		{
			System.out.println(current.name);
			current=current.next;
		}
	}
}
