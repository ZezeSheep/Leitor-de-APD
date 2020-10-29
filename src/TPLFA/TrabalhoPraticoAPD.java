package TPLFA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;



public class TrabalhoPraticoAPD {

	public static void main(String[] args) {
		Stack pilha = new Stack();
		Scanner inputPalavra = new Scanner(System.in);
		LeitorAPD leitor = new LeitorAPD();
		APD apd = leitor.lerArquivo(args[0]);
		/*
		System.out.printf("%s\n",apd.getEstados());
		System.out.printf("%s\n",apd.getAlfabeto());
		System.out.printf("%s\n",apd.getSimbolosPilha());
		ArrayList<String[]> regras = apd.getRegras();
		while(regras.isEmpty()==false) {
			String[] regra = regras.remove(0);
			for(int i=0;i<5;i++)
				System.out.printf("%s ",regra[i]);
			System.out.println();
		}
		System.out.printf("%s\n",apd.getEstadoInicial());
		System.out.printf("%s\n",apd.getEstadosFinais());
		*/ 
		while(true) {
			String palavra = inputPalavra.next();
			if(palavra.equals("q"))
				break;
			else {
				if(apd.verificarPalavra(palavra)) {
					System.out.println("Sim");
				}
				else
					System.out.println("N�o");
			}
		}
	}
		
}


