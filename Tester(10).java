import java.util.Scanner;
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        MinMaxEven obj = new MinMaxEven();
        System.out.println("minimum value of default constructor is " + obj.getMin());
        System.out.println("maximum value of default constructor :" +obj.getMax());

        System.out.println();
        MinMaxEven obj1 = new MinMaxEven();
        System.out.println("enter the minimum and maximum value: ");
        obj1.setMinMax(sc.nextInt(),sc.nextInt());
        System.out.println("obj1: " + obj1.toString());

        System.out.println();
        MinMaxEven obj2 = new MinMaxEven(obj1.getMin(),obj1.getMax());
        System.out.println("value of obj1 has been passed in the constructor");
        System.out.println(" obj2:" + obj2.toString());
        System.out.println();
        MinMaxEven obj4 = new MinMaxEven();
        obj4.setMinMax(7,4);
        System.out.println("obj4 " + obj4.toString());
        obj4.setMax(3);
        System.out.println("obj4 after setmax to 3" + obj4.toString());
        obj4.setMin(9);
        System.out.println("obj4 after setmin to 9" + obj4.toString());
        obj4.add(7);
        System.out.println("obj4 after adding 7" + obj4.toString());
        obj4.multiply(-2);
        System.out.println("obj4 after mult -2" + obj4.toString());
        obj4 = obj1.add(obj2);
        System.out.println("obj4 sum of obj1 and 2" + obj4.toString());
        if(obj1.equals(obj2) == true) {
        	System.out.println("Obj1 is same as Obj2");
        }else {
        	System.out.println("Obj1 different from obj2");
        }

	}

}
