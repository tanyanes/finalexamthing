package pkgCore;

import org.apache.poi.ss.formula.functions.*;

public class Retirement {

	private int iYearsToWork;
	private double dAnnualReturnWorking;
	private int iYearsRetired;
	private double dAnnualReturnRetired;
	private double dRequiredIncome;
	private double dMonthlySSI;
	
	//TODO: Build the constructor, getters and setters for the attributes above.

	public Retirement(int y, double w, int yr, double rr, double ri, double ssi) {
		iYearsToWork = y;
		dAnnualReturnWorking = w;
		iYearsRetired = yr;
		dAnnualReturnRetired = rr;
		dRequiredIncome = ri;
		dMonthlySSI = ssi;
	}
	
	public void SetiYearsToWork(int num) {
		this.iYearsToWork = num;
	}
	
	public int GetiYearsToWork() {
		return iYearsToWork;
	}
	
	public void SetdAnnualReturnWorking(double num) {
		this.dAnnualReturnWorking = num;
	}
	
	public double GetdAnnualReturnWorking() {
		return dAnnualReturnWorking;
	}
	
	public void SetiYearsRetired(int num) {
		this.iYearsRetired = num;
	}
	
	public int GetiYearsRetired() {
		return iYearsRetired;
	}
	
	public void setdAnnualReturnRetired(double num) {
		this.dAnnualReturnRetired = num;
	}
	
	public double getdAnnualReturnRetired() {
		return dAnnualReturnRetired;
	}
	
	public void setdRequiredIncome(double num) {
		this.dRequiredIncome = num;
	}
	
	public double getdRequiredIncome() {
		return dRequiredIncome;
	}
	
	public void setdMonthlySSI(double num) {
		this.dMonthlySSI = num;
	}
	
	public double getdMonthlySSI() {
		return dMonthlySSI;
	}
	
	//change to variables
	public double AmountToSave()
	{
		//TODO: Determine the amount to save each month based on TotalAmountSaved, YearsToWork
		//		and Annual return while working
		double r = dAnnualReturnRetired/12;
		double n = iYearsToWork * 12;
		double p = 0;
		double f = TotalAmountSaved();
		boolean t = false;
		
		double pmt = FinanceLib.pmt(r, n, p, f, t);
		
		return pmt;
	}
	
	//change to variables
	public double TotalAmountSaved()
	{
		//	TODO: Determine amount to be saved based on Monthly SSI, Required Income, Annual return during retirement
		//		and number of years retired.
		//
		double r = dAnnualReturnRetired/12;
		double n = iYearsRetired * 12;
		double y = dRequiredIncome - dMonthlySSI; //pmt per period
		double f = 0;
		boolean t = false;
		
		double pv = FinanceLib.pv(r, n, y, f, t);
		
		return pv;
	}
}
