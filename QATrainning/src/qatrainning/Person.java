import java.util.ArrayList;

public class Person {

	private String Name;
	private String JobTitle;
	private int age;	

	
	public Person(String Name,String JobTitle, int age)
	{
		this.Name = Name;
		this.JobTitle= JobTitle;
		this.age = age;
		
	}
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getJobTitle() {
		return JobTitle;
	}

	public void setJobTitle(String jobTitle) {
		JobTitle = jobTitle;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	ArrayList<Person> personList = new ArrayList<>();

	public String searchName(String Name)
	{

			for (Person p: personList) {
				if (p.Name.equals(Name)) {
					personList.remove(p);
				}
			}
			return Name;
	}


	public ArrayList<Person> getPersonList() {
		return personList;
	}

	public void setPersonList(ArrayList<Person> personList) {
		this.personList = personList;
	}

	@Override
	public String toString() {
		return "Person [Name= " + Name + ", JobTitle= " + JobTitle + ", age= " + age + "]";
	}

	public static void main (String[]args) {
		
	Person Mahmoud = new Person("Mahmoud","Consultant",22);
	Person Abdul = new Person ("Abdul", "Chef", 18);
	Person James = new Person ("James", "Professor", 45);

	ArrayList<Person> personList = new ArrayList<>();
	personList.add(Mahmoud);
	personList.add(Abdul);
	personList.add(James);

	Mahmoud.searchName("Mahmoud");
	
	for (Person person : personList)
        {
		System.out.println(person.getName());
		
	}
	
	
	
	}
	
	
}
