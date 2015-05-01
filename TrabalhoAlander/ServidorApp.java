

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ServidorApp extends TCPBase{
    /*preferi extender a classe TCPbase para ter fácil acesso a seus métodos*/
    
    private static ServerSocket srvSocket;
    private static TCPBase tcpbase;
    private static Mensagem mensagem;
    
    private static ServerSocket aguardarMensagem() throws IOException{
	
        int pt;
        Scanner ler = new Scanner(System.in);
              
        System.out.print("Escolha a porta do servidor:     -> ") ;
       
            pt = ler.nextInt();
           
        srvSocket  = new ServerSocket(pt);
        System.out.println("Porta "+ pt + " foi aberta!\n Aguardando uma nova mensagem...\n");
           
        return srvSocket;
        
    }
    
    
    private static void imprimirMensagem ( ) throws IOException {
        
         try (Socket cliente = srvSocket.accept()) {
            System.out.println("Novo cliente conectado com sucesso!\nDetalhes da conexão... \n" + "Ip do Cliente: " + cliente.getInetAddress().getHostAddress());
            Scanner sc = new Scanner(cliente.getInputStream());
            
            while (sc.hasNextLine()){
                
                mensagem.setMensagem(sc.nextLine());
                System.out.println(" Mensagem da classe mensagem: " + mensagem.getMensagem());
                
                                  
            }
            sc.close();
            srvSocket.close();
            cliente.close();
            
        }
        
    }
  
    public static void main (String [] args) throws IOException{ 
        
        mensagem = new Mensagem();
        ServidorApp.aguardarMensagem();
        ServidorApp.imprimirMensagem();
               
    
    }
}