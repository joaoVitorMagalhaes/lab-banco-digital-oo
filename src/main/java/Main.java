public class Main {
    public static void main(String[] args) {
        ClientePF joao = ClientePF.builder()
                .nome("João")
                .CPF("123.456.789-00")
                .build();

        ClientePJ empresaJoao = ClientePJ.builder()
                .nome("Empresa João")
                .CNPJ("123.456.789/0001-00")
                .build();

        Conta cc = new ContaCorrente(empresaJoao);
        Conta poupanca = new ContaPoupanca(joao);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        System.out.println(joao);
        System.out.println(empresaJoao);

        System.out.println(cc);
        System.out.println(poupanca);
    }
}