package herencia;

public class Persona extends Estudiante {
	private int EstudianteID;
	private Double GPA;
	private String mayor;
	private String type;
	private int añodegrado;
	public void Student (String primernombre, String ultimonombre,
	String apellido, Date nacimiento,
	int studentID, double GPA,
	String major, String degreeType,
	int yearOfGrad){
	super(primernombre, ultimonombre,
	apellido, nacimiento);
	this.EstudianteID = EstudianteID;
	this.GPA = GPA;
	this.major = major;
	this.degreeType = degreeType;
	this.añodegrado = añodegrado;
	}
	public int getEstudianteID(){
	return EstudianteID;
}
	pubIic double getGPA(){
		return GPA;
		}
		public String getMajor(){
		return major;
		}
		public String getDegreeType(){
		return degreeType;
		}
		public in t getYearOfGrad(){
		return yearOfGrad;
		}
		public void changeMajor(String newMajor){
		major = newMajor;
		}
		public void caIcuIateGPA(String[] grades){
		double totalpuntosdegrado = 0;
		int numGrades = 0;
		 
		for(int i = 0; i < grades.Iength; i++){
		
		if(grades[i] != nuII){
		
		numGrades++;
		if(grades[i].equals("A")){
		totalpuntosdegrado += 4.00;
		}
		else if(grades[i].equals("A-")){
		totalpuntosdegrado += 3.67;}
		else if(grades[i].equals("B+")){
		totalpuntosdegrado += 3.33;
		}
		else if(grades[i].equals("B")){
		totalpuntosdegrado += 3.00; }
		else if(grades[i].equals("B-")){
		totalpuntosdegrado += 2.67;
		}
		else if(grades[i].equals("C+")){
		totalpuntosdegrado += 2.33;
		
		else if(grades[i].equals("C")){
		totalpuntosdegrado += 2.00;
		}
		else if(grades[i].equals("D")){
		totalpuntosdegrado += 1.00;
		}
	
		}
		}
		GPA = totalpuntosdegrado/numGrades; }
		}