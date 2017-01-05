/**
 * Created by user on 2017-01-05.
 */
public class Tiger extends Animal implements output{

    @Override
    public void setColor(String color) {
        super.color = color;
    }

    @Override
    public void outputResult() {
        System.out.print(color + " "+ "호랑이");
    }

    public static void main(String args[]){
        String color ="빨간";
        Tiger tigerColor = new Tiger();
        tigerColor.setColor(color);
        tigerColor.outputResult();
    }


}
