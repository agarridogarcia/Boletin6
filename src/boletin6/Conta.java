
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
    public double getSaldo(){
        return saldo;
    }
    public void setNomeCliente(String nomeCli){
        nomeCliente=nomeCli;
    }
    public String getNomeCliente(){
        
        System.out.println("Nome : " + nomeCliente);
        return nomeCliente;
        
    }
    public void setNumeroConta(String numConta){
        numeroConta=numConta;
    }
    public String getNumeroConta(){
        return numeroConta;
    }
    public void ingresar (double n1){
        if (n1>=0){
            saldo=n1+saldo;
            System.out.println("O seu saldo actual é " + (saldo));
        }
        else
            System.out.println("Introduza unha nova cantidade");
    }
    public void retirar (double n1){
        if (n1<=saldo){
            saldo=saldo-n1;
            System.out.println("Acaba de retirar " + n1 + " o seu saldo actual é " + saldo);
        }
        else 
            System.out.println("Non ten suficiente saldo");
                    
    }
    public void transferencia (double cant1, String contaDestino){
        if(cant1>0)
            System.out.println("Acabas de transferir " + cant1 + " € da conta " + numeroConta + "a conta" + contaDestino );
        else
            System.out.println("Non ten suficiente saldo para esta operación");
           
    }
    
    }
    
        
    
    
            
    



