package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;
import tests.factory.FinanceFactory;

public class FinancingTests {
	
	@Test
	public void contructorShouldCreateObjectWhenValidData() {
		
		Financing fin=FinanceFactory.createdFinancing(100000.00, 2000.00, 80);
		
		Assertions.assertEquals(100000.00, fin.getTotalAmount());
		Assertions.assertEquals(2000.00, fin.getIncome());
		Assertions.assertEquals(80, fin.getMonths());


	}
	
	
	@Test
	public void contructorShouldThrowExceptionWhenDataObjectAreNotCorrect() {
		
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			Financing fin=FinanceFactory.createdFinancing(100000.00, 2000.00, 40);
		});

	}
	
	@Test
	public void setTotalAmountShouldUpdateDataWhenValidData() {
		Financing fin=FinanceFactory.createdFinancing(100000.00, 2000.00, 80);
		Double update=90000.00;
		fin.setTotalAmount(update);
		
		Assertions.assertEquals(update, fin.getTotalAmount());

	}
	
	@Test
	public void setTotalAmountShouldThrowIllegalArgumentExceptionWhenInvalidData() {
	
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			Financing fin=FinanceFactory.createdFinancing(100000.00, 2000.00, 80);
			fin.setTotalAmount(120000.00);
		});
	}
	
	@Test
	public void setIncomeShouldUpdateDataWhenValidData() {
		Financing fin=FinanceFactory.createdFinancing(100000.00, 2000.00, 80);
		Double update=2500.00;
		fin.setIncome(update);
		
		Assertions.assertEquals(update, fin.getIncome());

	}
	

	@Test
	public void setIncomeShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			Financing fin=FinanceFactory.createdFinancing(100000.00, 2000.00, 80);
			fin.setIncome(1000.00);
		});
		
	}

	
	@Test
	public void setMonthsShouldUpdateDataWhenValidData() {
		Financing fin=FinanceFactory.createdFinancing(100000.00, 2000.00, 80);
		Integer updateMonths=90;
		fin.setMonths(updateMonths);
		
		Assertions.assertEquals(updateMonths, fin.getMonths());

	}
	
	@Test
	public void setMonthsShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			Financing fin=FinanceFactory.createdFinancing(100000.00, 2000.00, 80);
			fin.setMonths(70);
		});
		
	}
	
	@Test
	public void entryShouldCalculateCorrectlyResult() {
		Financing fin=FinanceFactory.createdFinancing(100000.00, 2000.00, 80);
		Double expectedValue=20000.00;
		Assertions.assertEquals(expectedValue, fin.entry());

		
	}
	
	@Test
	public void quoteShouldCalculateCorrectlyResult() {
		Financing fin=FinanceFactory.createdFinancing(100000.00, 2000.00, 80);
		Double expectedValue=1000.00;
		
		Assertions.assertEquals(expectedValue, fin.quota());

		
	}
	
	

}
