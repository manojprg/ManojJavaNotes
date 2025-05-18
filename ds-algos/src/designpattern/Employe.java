package designpattern;

public class Employe {

	private String id;
	private String name;
	private double salary;
	
	private Employe() {
		
	}

	static class EmployeBuilder {

		private String id;
		private String name;
		private double salary;

		public EmployeBuilder withId(String id) {
			this.id = id;
			return this;
		}

		public EmployeBuilder withName(String name) {
			this.name = name;
			return this;
		}

		public EmployeBuilder withSalary(double salary) {
			this.salary = salary;
			return this;
		}

		public Employe build() {
			Employe emp = new Employe();
			emp.id = this.id;
			emp.name = this.name;
			emp.salary = this.salary;
			return emp;
		}

	}
}
