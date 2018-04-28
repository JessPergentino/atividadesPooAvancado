package br.ucsal.atividade.duplicateCode;

public abstract class DuplicateCode {
	
	public abstract int[] getModuleGrades(String module);
	
	public void printModules() {
		System.out.println("4CS001 Average: " + calculateGrades("4CS001"));
		System.out.println("6CS002 Average: " + calculateGrades("6CS002"));
		System.out.println("5CS003 Average: " + calculateGrades("5CS003"));
	}
	
	public int calculateGrades(String grade) {
		int[] grades = getModuleGrades(grade);
		int sum = 0;
		for (int i = 0; i < grades.length; i++) {
			sum += grades[i];
		}
		return sum/grades.length;
		
	}
}
