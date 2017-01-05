
public class RedTiger extends Tiger implements PrintColor
{
	public static void main(String[] args)
	{
		String color = "Red";
		RedTiger redT = new RedTiger();
		redT.setColor(color);
		redT.printTigetColor();
		
	}
	
	@Override
	public void printTigetColor() {
		System.out.println(super.color +" Tiger");
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void setColor(String color) {
		super.color = color;
		// TODO Auto-generated method stub
		
	}

}
