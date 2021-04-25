package cap.library;


interface i
{
	void get();
}
interface j extends i 
{
	void put();
}
class AB implements j
{

	@Override
	public void get() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void put() {
		// TODO Auto-generated method stub
		
	}
	
}
public class Item {
private int uin;
private String title;
private int noOfCopies;
final static  int size=50;
static Item []items=new Item[size];
static int count=0;


 
int addItem(Item item)
{
	if(count<=size)
	{
	items[count++]=item;
	return 1;
	}
	else
		return 0;
}

}
