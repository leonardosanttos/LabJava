import javax.swing.*;
import java.io.*;
import java.util.List;
import java.util.ArrayList;




public class Cadastrar {
	
	public static void main(String[] args) throws Exception{
	
     	String nome;
		int idade;
		int qtde = 0;
		Alunos cadastro = null;
		
	    qtde = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos alunos você quer cadastrar ? : "));

	    for(int i=0; i < qtde; i++){
	    	
		    nome = JOptionPane.showInputDialog(null,"Digite o nome do aluno: ");
		    idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a idade do aluno: "));
		
		    cadastro = new Alunos(qtde,nome,idade);
		    cadastro.incluirRegistro(cadastro);
		    cadastro.exibirRegistros();
	    }
	
	    
	}
	
}

