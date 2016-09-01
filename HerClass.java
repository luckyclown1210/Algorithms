package newpackage;

import java.util.Scanner;

public class HerClass {

	public static void main(String[] args) {
	
Scanner line = new Scanner(System.in);

System.out.println("Input one number");
int i = line.nextInt();

int j=i;
int l = String.valueOf(i).length();
int num =10;
int pd;
int t2=0;

for(int c=0;c<l;c++)
{
	pd = j%10;
	t2= t2+pd;
	j= (j -pd)/10;
}


for(int k=0;k<l-2;k++)
{
	
	num = num *10;
	}
System.out.println("so du :"+i/num);


int tong = 0;
for(int k=0;k<l;k++)
{

tong = tong + i/num;
i = i-(i/num)*num;
num = num/10;

	}

System.out.println("Tong 1 :"+tong);
System.out.println("Tong 2 :"+t2);

}
}
