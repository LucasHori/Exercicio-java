package br.com.exercico.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import br.com.entities.Entities;

public class ExercList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		List<Entities> list = new ArrayList<>();
		
		int n;
		
		System.out.println("How many employees will be registered? ");
		n = sc.nextInt();
		
		
		for(int i = 0; i <n; i++) {
			System.out.println("Employee $" + (i + 1) + ":");
			
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary");
			Double salary = sc.nextDouble();
			

			Entities emp = new Entities(name, id, salary);
			
			
			list.add(emp);
			
			
			
		}
		
		 System.out.println("Enter the employee id that will have salary increase :");
		 
		 int idSalary = sc.nextInt();
		 
		 Integer pos = position(list, idSalary);
		 
		 if(pos == null) {
			 System.out.println("this id does not exist!");
		 }
		 else {
			 System.out.print("Enter the porcentage: ");
			 double percent = sc.nextDouble();
			 list.get(pos).IncreaseSalary(percent);
			 
			 
		 }
		
		 System.out.println();
		 System.out.println("List of employees: ");
		 for(Entities emp : list) 
			 System.out.println(emp);
		 
		
		
	
		
		sc.close();
		
	}
	
	
		public static Integer position(List<Entities> list, int id) {
			for(int i =0; i<list.size(); i++) {
				if(list.get(i).getId() == id) {
					return i;
				}
			}
			
			return null;
			
		}


}
