package tests.factory;

import entities.Financing;

public class FinanceFactory {

	public static Financing createdFinancing(Double totalAmount, Double income, Integer months) {
		return new Financing(totalAmount, income, months);
	}
	
}
