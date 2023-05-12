
public class Receitas {
	private String titulo;
	private String texto;
	private String genero;
	private int codigo;
	private boolean favoritar = false;
	
	public Receitas(String titulo, String texto, String genero, int codigo) {
		this.titulo = titulo;
		this.texto = texto;
		this.genero = genero;
		this.codigo = codigo;
	}

	public boolean getFavoritar() {
		return favoritar;
	}

	public void setFavoritar(boolean favoritar) {
		this.favoritar = favoritar;
	}

	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public void descricaoDeReceita() {
		System.out.println (titulo+"\n\n"+texto+"\n\nGenero: "+genero+"\n");
	}
	
	public void printarTitulo() {
		System.out.println (titulo+"\n");
	}
}
