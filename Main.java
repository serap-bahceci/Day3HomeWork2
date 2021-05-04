
public class Main {


	public static void main(String[] args) {
		Student student1=new Student();
		student1.setId(1);
		student1.setEmail("serapkirmit@gmail.com");
		student1.setUserId(11);
		student1.setFirstName("Serap");
		student1.setLastName("Bahçeci");
		
		Instructor instructor1=new Instructor();
		instructor1.setId(2);
		instructor1.setEmail("engin@gmail.com");
		instructor1.setUserId(22);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroğ");
		
		UserManager userManager1=new UserManager(new StudentManager(student1));
		userManager1.add();
		UserManager userManager2=new UserManager (new InstructorManager(instructor1));
		userManager2.update();
		

	}

}
 