//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
	public static void main(String[] args) {
	//task1
	int i=1;
	for (i=1; i<=10; i++){
	System.out.println(i);
	}
	//task2
	int j=10;
	for (j=10; j>=1; j--){
	System.out.println(j);
	}
	//task3
	int k=0;
	for (k=0; k<=17; k=k+2){
	System.out.println(k);
	}
	
	//task4
	int m=10;
	for (m=10; m>=-10; m--){
	System.out.println(m);
	}
	
	//task5
	int y=1904;
	for(y=1904; y<=2096; y=y+4) {
		System.out.println(y+" Год является високосным");
	}
	//task6
	int p=7;
	for (p=7; p<=98; p=p+7) {
		System.out.print(p + " ");
	}{System.out.println(" ");
	}
	//task7
	
	int x=1;
	for (x=1; x<=512; x=x*2){
	System.out.print(x+" ");
	}{System.out.println(" ");
	}
	
	//task8
	int bank=29000;
	int total=0;
	for (int t=1; t<=12; t++) {
	total = total + bank;
	System.out.println("Мусяц "+t+", сумма накоплений равна "+total+" рублей");
	}
	
	//task9
		int add=29000;
		int ful=0;
		for (int s=1; s<=12; s++) {
			ful=ful+ful/100;
			ful = ful + add;
			System.out.println("Мусяц "+s+", сумма накоплений равна "+ful+" рублей");
		}
	//task10
	int rezult=1;
	for (int z=1; z<=10; z++) {
		rezult = z*2;
		System.out.println("2*"+z+"="+rezult);
	}
	
	}
}