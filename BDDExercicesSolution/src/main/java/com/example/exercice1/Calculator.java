package com.example.exercice1;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

	private static List<Grocery> groceries = new ArrayList<Grocery>();
	private int payedMoney;
	
	public static void push(Grocery e) {
		groceries.add(e);
	}
	
	public int getPayedMoney() {
		return payedMoney;
	}
	
	public void setPayedMoney(int payedMoney) {
		this.payedMoney = payedMoney;
	}
	
	public int getSum(){
		int sum = 0;
		for (Grocery grocery : groceries) {
			sum += grocery.getPrice();
		}
		return sum;
	}
	
	public int getChange(){
		int sum = getSum();
		return payedMoney - sum;
	}
}
