

public class Course{

	private String name;
	private int numberOfStudent;
	private Student[] students = new Student[10];
	public Course(String name){
		this.name = name;
		this.numberOfStudent=0;
	}
	public Student[] getStudents(){
		return students;
	}
	public boolean isFull(){
		if(numberOfStudent>=10){
			return true;
		}
		return false;
	}
	
	public String getName(){
		return name;
	}
	public int getNumberOfStudent(){
		return numberOfStudent;
	}
	public void registerStudent(Student student){
		if (!this.isFull()){
			students[numberOfStudent]=student;
			numberOfStudent++;
			System.out.println("Registered successfully.");
		}else{
			System.out.println("sorry, this course is full, you can't register.");
		}
	
	}
		
}
