package herencia;

public class Estudiante {
	private String primernombre;
	private String ultimonombre;
	private String apellido;
	private Date nacimiento;
	public Person(string primernombre, string ultimonombre,
	string apellido, Date nacimiento){
	this.primernombre = primernombre;
	this.ultimonombre = ultimonombre;
	this.apellido= apellido;
	this.nacimiento = nacimiento;
	}
	
	public String getprimernombre(){
		return primernombre;
	}
	
	public String ultimonombre
(){
	}
	return ultimonombre;
	
	public String getapellido(){
	return apellido;
	}
	
	public String getName(){
	return primernombre + " " + ultimonombre + " " + apellido;
	}
	
	public Date getDateOfBirth(){
	return nacimiento;
	}
	

	}

