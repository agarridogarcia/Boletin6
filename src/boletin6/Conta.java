
package boletin6;

import javax.swing.JOptionPane;


public class Conta {
    //atributos
    private String nomeCliente, numeroConta;
    private double saldo;
   
    //constructores
    public Conta(){
    nomeCliente="0"; 
    numeroConta="0";
    saldo=0;
}
    public Conta(String nomeCli, String numConta, double sal){
      
    nomeCliente=nomeCli; 
    numeroConta=numConta;
    saldo=sal;
    }
    //métodos
    public void setSaldo(double sal){
        saldo=sal;
    }
    
    public void setNomeCliente(String nomeCli){
        System.out.println("Nombre: " + nomeCli);
        nomeCliente=nomeCli;
    }
    
    public void setNumeroConta(String numConta){
        System.out.println("Nº de conta: " + numConta);
        numeroConta=numConta;
    }
    
    public void ingresar (double n1){
        if (n1>=0){
            saldo=n1+saldo;
            System.out.println("O seu saldo actual é de " + saldo + " €");
        }
        else
            System.out.println("Introduza unha nova cantidade");
    }
    public void retirar (double n1){
        if (n1<=saldo){
            saldo=saldo-n1;
            System.out.println("Acaba de retirar " + n1 + " € " );
        }
        else 
            System.out.println("Non ten suficiente saldo");
                    
    }
    public void transferencia (double cant1, String contaDestino){
        if(cant1>0)
            System.out.println("Acabas de transferir " + cant1 + " € da conta " + numeroConta  + " a conta " + contaDestino );
        else
            System.out.println("Non ten suficiente saldo para esta operación");
           
    }
    public void visualizar(){
        System.out.println( nomeCliente  + " o seu número de conta é : " + numeroConta +  " e actualmente ten " + saldo + " € na súa conta" );
    }
    
    }
    
        
    
    
            
    



