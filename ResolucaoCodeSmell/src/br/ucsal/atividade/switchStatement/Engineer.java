package br.ucsal.atividade.switchStatement;

public class Engineer extends Employee {

	
	public Engineer(String name, double salary, int tenure) {
		this.name = name;
		this.salary = salary;
		this.tenure = tenure;
	}
	
	@Override
	public int getType() {
		
		return Employee.ENGINEER;
	}

	@Override
	public double calculateBonus() {
		return (salary * 0.15) + (tenure * 200);
	}

}
