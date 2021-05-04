
public class InstructorManager extends UserManager {
	private Instructor instructor;
	public   InstructorManager(Instructor instructor) {
	
		this.instructor=instructor;
	}
	
	@Override
	
	public void update() {
		System.out.println("Id : "+instructor.getId()+" "+instructor.getFirstName()+" "+instructor.getLastName()+" adlý eðitmen  güncellendi.");
		}
}
