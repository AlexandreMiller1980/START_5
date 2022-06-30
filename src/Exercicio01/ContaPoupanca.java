package Exercicio01;

import Exercicio02.Imposto;

public class ContaPoupanca extends Conta implements Imposto {


    
    public double rendimentoMensal() {
        setSaldo(getSaldo() + getSaldo() * 0.05);
        return getSaldo();
    }

    
    public void calcularImposto() {


    }
} 
