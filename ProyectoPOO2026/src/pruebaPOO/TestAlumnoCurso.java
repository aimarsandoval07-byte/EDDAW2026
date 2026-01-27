package pruebaPOO;

public class TestAlumnoCurso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Curso C1 = new Curso();
	Curso C2 = new Curso(123);
	Curso C3 = new Curso(348, "DAW3", true);
	
	System.out.println(C3);
	System.out.println(C2);
	System.out.println(C1);
	}
}