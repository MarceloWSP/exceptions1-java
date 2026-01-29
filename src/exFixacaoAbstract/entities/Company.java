package exFixacaoAbstract.entities;

public class Company extends TaxPayer{

	private Integer numberOfEmployees;
	
	public Company() {
		super();
	}
	
	
	
	public Company(String name, Double income, Integer numberOfEmployees) {
		super(name, income);
		this.numberOfEmployees = numberOfEmployees;
	}
	
	

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}



	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	
	@Override
	public Double tax() {
		// TODO Auto-generated method stub
		if (numberOfEmployees < 10) {
			return getIncome() * 0.16;
		} else return getIncome() * 0.14;
	}

}
