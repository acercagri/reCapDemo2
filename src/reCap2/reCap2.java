package reCap2;

public class reCap2 {

	public static void main(String[] args) {
	double[] myList = {1.2,3.6,8.7};
	double total =0;
	double max = myList[0];
	for (double number:myList) {
		if(max<number) {
			max = number;
		}
		total = total + number;
				System.out.println(number);
		
	}
	System.out.println("toplam =" + total);
	System.out.println("enBüyük =" + max);
	
	}
}