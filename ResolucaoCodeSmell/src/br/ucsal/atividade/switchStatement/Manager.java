package br.ucsal.atividade.switchStatement;

public class Manager extends Employee {

	public Manager(String name, double salary, int tenure) {
		this.name = name;
		this.salary = salary;
		this.tenure = tenure;
	}
	
	
	@Override
	public int getType() {
		
		return Employee.MANAGER;
	}

	@Override
	public double calculateBonus() {
		
		return (salary * 0.25) + (tenure * 500);
	}

}
