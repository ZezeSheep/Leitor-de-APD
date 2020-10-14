import java.util.HashMap;

public class Estado {
	private String nome;
	private boolean isFinal;
	private HashMap<Integer,Estado> transicoes;
	
	public Estado(String nome) {
		this.nome = nome;
		isFinal = false;
	}
	
	public void setFinal() {
		isFinal = true;
	}
	
	public boolean isFinal() {
		return isFinal;
	}
	
	

}
