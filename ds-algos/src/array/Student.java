package array;

public class Student {

	private String name;
	private int rollNo;

	private Student() {

	}

	public static class StudentBuilder {
		private String name;
		private int rollNo;

		public StudentBuilder withName(String name) {

			this.name = name;
			return this;
		}

		public StudentBuilder withrollNo(int rollNo) {

			this.rollNo = rollNo;
			return this;
		}

		public Student build() {
			Student student = new Student();
			student.name = this.name;
			student.rollNo = this.rollNo;

			return student;
		}
	}
}
