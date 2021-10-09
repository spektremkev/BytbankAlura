package util;

import com.martins.bytbankalura.ContaCorrente;
import com.martins.bytbankalura.ContaPoupanca;

public class TesteContas {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(111, 111);
            cc.deposita(100.0);

            ContaPoupanca cp = new ContaPoupanca(222, 222);
            cp.deposita(200.0);

            cc.transfere(10.0, cp);

            System.out.println("Saldo cc: " + cc.getSaldo());
            System.out.println("Saldo cp: " + cp.getSaldo());

    
}
}