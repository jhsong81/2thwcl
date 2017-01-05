

public class Lion extends Animals implements Do{
	public Lion(String str){
		color = str;
	}

	@Override
	protected String getColor() {
		// TODO Auto-generated method stub
		return color;
	}

	@Override
	public String Run() {
		// TODO Auto-generated method stub
		return " Lion : Run";
	}

}
