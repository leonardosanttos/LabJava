

import java.io.*; 
import java.net.*; 
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ClienteApp extends TCPBase{

private static Socket socket;
private static TCPBase tcpbase;
private static Mensagem mensagem;
private static Scanner s ;
private static String address;
private static  int door;



private static Mensagem receberMensagem() throws IOException{
/*Neste momento as informações do usuário são capazes de indicar o endereco e a porta usando os métodos da classe TCPBase */
        socket = new Socket(tcpbase.getEndereco(),tcpbase.getPorta());
        System.out.println("Conexão realizada com sucesso...\n");
            
       
        return null;
        }
        

private static void enviarMensagem (Mensagem msg) throws IOException{
/* O método enviar mensagem, primeiro manda a mensagem do usuário através da classe ClienteApp para a Classe ServidorApp*/
    mensagem = new Mensagem();
    
    System.out.println("Atencao: para SAIR digite 's' a qualquer momento");
    Scanner sc = new Scanner(System.in);
    PrintStream saida = new PrintStream(socket.getOutputStream());
   
    while(sc.hasNextLine()){
            
            saida.println(sc.nextLine());
/*Fiz uma forma de o usuário sair do looping pressionando a tecla s da entrada padrao*/      
            System.out.print("Deseja Sair s ou n?...: ");
            if("s".equals(sc.nextLine())){
              
                  socket.close();
                  sc.close();
                  System.out.println("\n Encerrando aplicacao...: ");
                  JOptionPane.showMessageDialog(null, " Obrigado por utilizar meu sistema");
                  /*Quando o sistema é interrompido gera uma caixa de mensagem*/
                } else
            {
                
            }  
        }
    
           
}

     
      public static void main(String[] args) throws Exception {
          
          /*Aqui foi instanciado um objeto da classe Scanner*/
        s = new Scanner(System.in); 
        /*Aqui foi instanciado o objeto da Classe TCPBase*/
        tcpbase =new TCPBase();
        
        System.out.print("Digite o endereco da máquina/servidor : ex:localhost ou 127.0.0.1: ->");
        /* a VARIÁVEL ADDRESS é uma String e foi declarado como static (global) para ser usada em qualquer lugar a classe*/
        address = s.nextLine();
        /*Aqui ela foi passada como parametro*/
        tcpbase.setEndereco(address);
        
        System.out.print("Agora digite o numero da porta:     -> ") ;
       /* a VARIÁVEL DOOR é do tipo inteiro e foi declarado como static (global) para ser usada em qualquer lugar a classe*/
        door = s.nextInt();
         /*Aqui ela foi passada como parametro*/
        tcpbase.setPorta(door);
        
        
        ClienteApp.receberMensagem();
        ClienteApp.enviarMensagem(mensagem);
         
      
    }
}
