package br.com.entities;

public class Entities {

	
	private Integer id;
	private String name;
	private Double salary;
	
	public Entities() {
		
	}
	
	public Entities(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public double getSalary() {
		return salary;
	}
	
	
	public void IncreaseSalary(double porcentage) {
		salary += salary * porcentage /100.00;	
		}
	
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}
	
	
}
