package pruebaPOO;

public class Curso {
	private int codCurso;
	private String descripcion;
	private boolean subvencionado;

	/** 
	 * Constructor completo (necesita todos los atributos)
	 * @param codCurso
	 * @param descripcion
	 * @param subvencionado
	 */
	public Curso(int codCurso, String descripcion, boolean subvencionado) {
		super();
		this.codCurso = codCurso;
		this.descripcion = descripcion;
		this.subvencionado = subvencionado;
	}
	
	public Curso() {
		this.codCurso = 0;
		this.descripcion = "XXXXXX";
		this.subvencionado = false;
	}
	public Curso(int codCurso) {
		this.codCurso = codCurso;
		this.descripcion = "XXXXXX";
		this.subvencionado = false;
	}

	public int getCodCurso() {
		return codCurso;
	}

	public void setCodCurso(int codCurso) {
		this.codCurso = codCurso;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isSubvencionado() {
		return subvencionado;
	}

	public void setSubvencionado(boolean subvencionado) {
		this.subvencionado = subvencionado;
	}
	
	@Override
	public String toString() {
		return "Curso [codCurso=" + codCurso + ", descripcion=" + descripcion + ", subvencionado=" + subvencionado
				+ "]";
	}
	
}