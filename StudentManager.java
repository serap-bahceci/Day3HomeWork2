

public class StudentManager extends UserManager{
	private Student student;
	public StudentManager(Student student) {
		this.student=student;
	}
	


	@Override
	public void add() {
		System.out.println("Id : "+student.getId()+" "+student.getFirstName()+" "+student.getLastName()+" adlı öğrenci eklendi.");
		}
	public void del() {
		System.out.println("Id :  "+student.getId()+student.getFirstName()+student.getLastName()+" adlı öğrenci silindi.");
		}
	
}
