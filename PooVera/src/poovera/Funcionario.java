package poovera;

class Funcionario {

    public Funcionario f = new Funcionario();
    String nome;
    double salario;
    int anonasc;

    int idade(int x) {
        return 2024 - x;
    }

    void novoSalario(double a){
        double nS;
        
        nS = (a*0.15) + a;
        System.out.println("Novo salário: " + nS);
        
    }
    
}
