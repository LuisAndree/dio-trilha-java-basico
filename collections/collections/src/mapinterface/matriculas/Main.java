package mapinterface.matriculas;

public class Main {
    public static void main(String[] args) {
        Professor professorJoao = new Professor("João Almeida", "Banco de Dados", "111.222.333-44");
        Professor professorMaria = new Professor("Maria Costa", "Estruturas de Concreto", "555.666.777-88");

        Curso sistemasInfo = new Curso("Sistemas de Informação", 8, professorJoao);
        Curso engenhariaCivil = new Curso("Engenharia Civil", 10, professorMaria);

        GerenciadorDeEstudantes gerenciador = new GerenciadorDeEstudantes();

        Estudante estudante1 = new Estudante("Lucas Silva", "123.456.789-00", sistemasInfo);
        Estudante estudante2 = new Estudante("Ana Pereira", "987.654.321-00", engenhariaCivil);
        Estudante estudante3 = new Estudante("Mariana Souza", "456.789.123-00", sistemasInfo);

        gerenciador.adicionarEstudante("20231001", estudante1);
        gerenciador.adicionarEstudante("20231002", estudante2);
        gerenciador.adicionarEstudante("20231003", estudante3);

        gerenciador.removerEstudante("20231002");

        gerenciador.listarEstudantes();
    }
}
