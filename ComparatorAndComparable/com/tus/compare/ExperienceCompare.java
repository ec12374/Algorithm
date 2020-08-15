import java.util.Comparator;

public class ExperienceCompare implements Comparator<Employee> {

	public int compare(Employee e1, Employee e2) {

		return (int) (e1.getExperience() - e2.getExperience());
	}

}
