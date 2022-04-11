package entities;

public class Individual extends TaxPayer{
	
	private Double healthExpenditures;
	
	public Individual() {
	}
	
	public Individual(String name, double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}
	
	public Double getHealthExpenditures() {
		return healthExpenditures;
	}
	
	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double tax() {
		double basicTax;
		if(getAnualIncome() < 20000.0) {
			basicTax = (getAnualIncome() * 0.15) - (healthExpenditures * 0.50);
		}
		else {
			basicTax = (getAnualIncome() * 0.25) - (healthExpenditures * 0.50);
		}
		if (basicTax < 0.0) {
			return 0.0;
		}
		else {
			return basicTax;
		}
	}

}
