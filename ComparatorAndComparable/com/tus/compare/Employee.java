public class Employee implements Comparable<Employee> {

	private int id;
	private String name;
	private int age;
	private long salary;
	private float experience;

	Employee(int employeeId, String employeeName, int employeeAge, int employeeSalary, int employeeExpereince) {

		this.id = employeeId;
		this.name = employeeName;
		this.age = employeeAge;
		this.salary = employeeSalary;
		this.experience = employeeExpereince;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public float getExperience() {
		return experience;
	}

	public void setExperience(float experience) {
		this.experience = experience;
	}

	@Override
	public int compareTo(Employee emp) {
		return (int) (this.salary - emp.salary);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		//System.out.println(id + " hashcode: " + result);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", experience="
				+ experience + "]";
	}

	
}
