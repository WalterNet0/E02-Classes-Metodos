public class Main {

    public static void main(String[] args){

        Conta conta1 = new Conta();
        Cliente cliente = new Cliente();

        conta1.dono = cliente;
        conta1.numero = 1234;
        conta1.saldo = 4500.0;
        conta1.limite = 10000.0;

        cliente.cpf = "Seu CPF";
        cliente.endereco = "Seu Endereço";
        cliente.idade = 16; //Sua Idade
        cliente.nome = "Seu Nome";
        cliente.sexo = 'm'; //Seu Sexo

        Conta conta2 = new Conta();
        Cliente cliente2 = new Cliente();

        conta2.dono = cliente2;
        conta2.numero = 1234;
        conta2.saldo = 4500.0;
        conta2.limite = 10000.0;

        cliente2.cpf = "Outro CPF";
        cliente2.endereco = "Outro Endereço";
        cliente2.idade = 15; //Idade de alguém
        cliente2.nome = "Outro Nome";
        cliente2.sexo = 'f'; //Sexo de alguém

        if(conta1 == conta2) {
            System.out.println("Iguais!");
            imprimir(conta1.dono, conta1.numero, conta1.saldo, conta1.limite);
        }

        else
            System.out.println("Diferentes!");
    }

    static void imprimir(Cliente dono, int numeroConta, double saldo, double limite){

        System.out.println("Nome do atual dono da conta: "+ dono.nome);
        System.out.println("Numero da conta: "+ numeroConta);
        System.out.printf("Atual saldo da conta: R$%.2f\n", saldo);
        System.out.printf("Atual limite da conta: R$%.2f\n", limite);

    }

}
