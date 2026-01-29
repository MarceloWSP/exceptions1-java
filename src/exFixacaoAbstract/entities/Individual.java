package exFixacaoAbstract.entities;

public class Individual extends TaxPayer {
	
	private Double healthExpenses;
	
	
	public Individual() {}
	
	
	public Individual(String name, Double income, Double healthExpenses) {
		super(name, income);
		this.healthExpenses = healthExpenses;
	}

	
	
	public Double getHealthExpenses() {
		return healthExpenses;
	}


	public void setHealthExpenses(Double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}

	
	@Override
	public Double tax() {
		// TODO Auto-generated method stub
		if (getIncome() < 20000.00) {
			return getIncome() * 0.15 - (healthExpenses * 0.5);
		}
		else return getIncome() * 0.25 - (healthExpenses * 0.5);
	}
	
}
