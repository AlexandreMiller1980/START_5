package Exercicio01;

import Exercicio02.Imposto;

public class ContaCorrente extends Conta implements Imposto {

        
        public double rendimentoMensal() {
            setSaldo(getSaldo() + getSaldo() *0.03);
            return getSaldo();
        }

    
    public void calcularImposto() {

    }
}
