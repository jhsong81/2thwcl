
public class Tiger extends Animals implements Do{

	public Tiger(String str){
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
		return " Tiger : Run" ;
	}

}
