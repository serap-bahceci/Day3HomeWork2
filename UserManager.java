

public class UserManager {
	private StudentManager studentManager;
	private InstructorManager instructorManager;
	public UserManager(StudentManager studentManager) {
		super();	
		this.studentManager =studentManager;
}
	public UserManager(InstructorManager instructorManager) {
		super();	
		this.instructorManager =instructorManager;
		
}
	public UserManager() {
		}
	
	public void add() {
		
		this.studentManager.add();
	}
	
	public void del() {
		
		this.studentManager.del();
		}
	public void update() {
		
		this.instructorManager.update();
		}

		
	}

