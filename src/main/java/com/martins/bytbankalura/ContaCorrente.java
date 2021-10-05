package com.martins.bytbankalura;

public class ContaCorrente extends Conta{
    public ContaCorrente(int agencia, int numero) {
        super(numero, agencia);
    }
    
    @Override
    public boolean saca(double valor) {
        double valorDeSaque = valor + 0.2;
        
        // TODO Auto-generated method stub
        return super.saca(valorDeSaque);
    }

    @Override
    public void deposita(double valor){
        super.saldo = super.saldo + valor;
    }

        @Override
	public String toString() {
		return "ContaCorrente, " + super.toString();
    }
    
        
}
