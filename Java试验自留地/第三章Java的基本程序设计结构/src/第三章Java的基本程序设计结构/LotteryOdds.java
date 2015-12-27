package 第三章Java的基本程序设计结构;

import java.util.Scanner;

public class LotteryOdds {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How many numbers do you need to draw?");
		int k = in.nextInt();
		
		System.out.println("What is the highest number you can draw?");
		int n = in.nextInt();
		/*
		 * compute binomial(二项式) coefficient n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3...*k)
		 */
		int lotteryOdds = 1;
		for (int i =1; i<=k; i++)
			lotteryOdds = lotteryOdds*(n-i+1)/i;
		
		System.out.println("Your odds are 1 in " + lotteryOdds + " .Good luck!");
		
		//从 Java SE 7 开始，case标签还可以是字符串字面量
		String r = "fsdfsd";
		switch (r){
		case "fsfsas":
			System.out.println("fsdf");break;
		case "fdase":
			break;
		}
	}

}
