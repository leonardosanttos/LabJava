import javax.swing.*;

import java.io.*;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;


public class Alunos {

	private String nome;
	private int idade, qtde, novo_aluno;
	private Alunos[] alunos;
	
	
	
public Alunos (int q, String n, int id) {
		
		this.nome = n;
		this.idade = id;
		this.qtde = q;
		alunos = new Alunos[qtde];
		novo_aluno=0;

}		



public void exibirDados(){
	
	System.out.println("NOME: " +nome+ " ,IDADE: " +idade);
   }


public  void incluirRegistro (Alunos novo) throws IOException{
	
	alunos [novo_aluno] = novo;
	novo_aluno = novo_aluno + 1;
	
	List<Alunos> gravacao= new ArrayList<Alunos>();
	
	gravacao.add(novo);
	
	
	Alunos Tmp;
	
	for (int i = 0; i < gravacao.size(); i++){
	
		Tmp = gravacao.get(i);
		
		System.out.println("Alunos: ("+(i+1)+")" + Tmp);
		}
		

	
	File arquivo = new File("C:\\Atividades\\RegistraAlunos.log");
	FileWriter gravar = new FileWriter(arquivo);
	gravar.write("Registros de Alunos: " + alunos);
	gravar.close();
	
	
}

public void exibirRegistros(){
	
	for(int i = 0; i < alunos.length; i ++){
		if(alunos[i] !=null){
		
			alunos[i].exibirDados();
			
			
		}
	}
	}


}


