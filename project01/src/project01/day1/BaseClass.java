package project01.day1;

public class BaseClass extends TigerClass implements PrintInterface{

	public static void main(String[] args) {
		BaseClass base = new BaseClass();
		base.setTigerColor("»¡°£");
		base.print();
	}

	@Override
	public void setTigerColor(String color) {
		super.color = color;
	}
	@Override
	public void print() {
		String tigerType = color + "È£¶ûÀÌ";
		System.out.println(tigerType);
	}
}
