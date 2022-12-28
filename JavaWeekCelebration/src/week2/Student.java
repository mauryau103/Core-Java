package week2;

//implements comparable

public class Student implements Comparable<Student>{
    private String studentname;
    private int rollno;
    private int studentage;

    public Student(int rollno, String studentname, int studentage) {
         this.rollno = rollno;
         this.studentname = studentname;
         this.studentage = studentage;
    }

    public String getStudentname() {
         return studentname;
    }
    public void setStudentname(String studentname) {
 this.studentname = studentname;
    }
    public int getRollno() {
 return rollno;
    }
    public void setRollno(int rollno) {
 this.rollno = rollno;
    }
    public int getStudentage() {
 return studentage;
    }
    public void setStudentage(int studentage) {
  this.studentage = studentage;
    }
//@Override
//	public int compareTo(Student comparestu) {
//		// TODO Auto-generated method stub
//		int compareage = ((Student)comparestu).getStudentage();
//		//for Ascending order
//		//return this.studentage-compareage;
//		//for descending order
//		//return compareage-this.studentage;
//		
//	} 

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		int compareage = ((Student)o).getStudentage();
		
		return this.studentage-compareage;
	}

	@Override
	public String toString() {
		return "Student [studentname=" + studentname + ", rollno=" + rollno + ", studentage=" + studentage + "]";
	}
	
}
