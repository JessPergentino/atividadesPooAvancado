package br.ucsal.atividade.switchStatement;

public class Technician extends Employee {

	public Technician(String name, double salary,int tenure) {
		this.name = name;
		this.salary = salary;
		this.tenure = tenure;
	}
	
	@Override
	public int getType() {
		return Employee.TECHNICIAN;
	}

	@Override
	public double calculateBonus() {
		return (salary * 0.10) + (tenure * 350);
	}

}
