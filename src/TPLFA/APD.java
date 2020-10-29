package TPLFA;

import java.util.ArrayList;
import java.util.Stack;

public class APD {
	ArrayList<String> estados;
	ArrayList<Character> alfabeto;
	ArrayList<Character> simbolosPilha;
	ArrayList<String[]> regras;
	String estadoInicial;
	ArrayList<String> estadosFinais;
	
	String estadoAtual;
	Stack<Character> pilha;
	
	void setEstados(ArrayList<String>estados) {
		this.estados = estados;
	}
	void setAlfabeto(ArrayList<Character>alfabeto) {
		this.alfabeto = alfabeto;
	}
	void setSimbolosPilha(ArrayList<Character>simbolosPilha) {
		this.simbolosPilha = simbolosPilha;
	}
	void setRegras(ArrayList<String[]> regras) {
		this.regras = regras;
	}
	void setEstadoInicial(String estadoInicial) {
		this.estadoInicial = estadoInicial;
	}
	void setEstadosFinais(ArrayList<String> estadosFinais) {
		this.estadosFinais = estadosFinais;
	}
	
	ArrayList<String> getEstados(){
		return estados;
	}
	
	ArrayList<String> getEstadosFinais(){
		return estadosFinais;
	}
	ArrayList<String[]> getRegras(){
		return regras;
	}
	ArrayList<Character> getAlfabeto(){
		return alfabeto;
	}
	ArrayList<Character> getSimbolosPilha(){
		return simbolosPilha;
	}
	
	String getEstadoInicial() {
		return estadoInicial;
	}
	
	void iniciarAPD() {
		estadoAtual = estadoInicial;
		pilha.clear();
	}
	

}
