package exemploumclassevera;

public class ExemploUmClasseVera {

    public static void main(String[] args) {
        Pessoa p;
        p = new Pessoa();

        p.nome = "Gabriel";
        p.idade = 18;
        p.renda = 1050;

        System.out.println("Nome " + p.nome);
        System.out.println("Idade " + p.idade);
        System.out.println("renda " + p.renda);

        Cachorro c;
        c = new Cachorro();

        c.nome = "Nino";
        c.idade = 14;
        c.pulos = 125;

        System.out.println("Nome " + c.nome);
        System.out.println("idade " + c.idade);
        System.out.println("pulos " + c.pulo);

    }

}
