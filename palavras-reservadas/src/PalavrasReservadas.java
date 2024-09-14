public class PalavrasReservadas {

    // 1. Controle de fluxo

    public void controleFluxo() {
        // Condicional
        if (true) {
            // Executa este bloco se a condição for verdadeira.
        } else {
            // Executa este bloco se a condição for falsa.
        }

        switch (1) {
            case 1:
                // Executa se o valor for 1.
                break;  // Interrompe o fluxo.
            default:
                // Caso nenhum "case" seja atendido, executa este bloco.
        }

        // Loops
        for (int i = 0; i < 10; i++) {
            // Loop com início, condição e incremento.
        }

        while (true) {
            // Loop infinito até que "break" seja chamado.
            break;
        }

        do {
            // Executa pelo menos uma vez antes de verificar a condição.
        } while (false);
        
        // Controle de interrupção
        return;  // Finaliza a execução do método.

        // Exceções
        // try {
        //     // Código que pode lançar uma exceção.
        // } catch (Exception e) {
        //     // Tratamento da exceção.
        // } finally {
        //     // Bloco que sempre será executado.
        // }
    }

    // 2. Declarações e definições de tipos

    // Definindo uma classe.
    public class MinhaClasse {

        public String nomePublico;
        // Classe interna.
    }

    // Definindo uma interface.
    public interface MinhaInterface {
        // Interface com métodos abstratos.
    }

    // Enumeração de constantes.
    public enum DiasDaSemana {
        SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA
    }

    // Definindo pacotes e importando classes.
    // package br.com.meu.pacote;
    // import java.util.List;

    // 3. Modificadores de acesso e comportamento

    // Modificadores de acesso
    public String nomePublico;
    private int idadePrivada;
    protected double salarioProtegido;

    // Modificadores de comportamento
    public static final double PI = 3.14159;  // "static" e "final" indicam que não muda.
    
    // Modificador de método abstrato (em uma classe abstrata).
    public abstract class Forma {
        public abstract void desenhar();  // Método sem corpo.
    }

    // Método "synchronized" para controle de acesso a um recurso compartilhado.
    public synchronized void acessarRecurso() {
        // Código sincronizado para acesso seguro por múltiplas threads.
    }

    // Modificador "volatile" para variáveis usadas em threads.
    private volatile boolean ativo;

    // "transient" para impedir que uma variável seja serializada.
    private transient String senha;

    // "native" indica que o método é implementado em outra linguagem (como C).
    public native void metodoNativo();

    // "strictfp" para garantir que os cálculos de ponto flutuante sigam as regras do IEEE 754.
    public strictfp double calcular() {
        return 0.0;
    }

    // 4. Tipos de dados primitivos
    byte b = 10;
    short s = 20;
    int i = 30;
    long l = 40L;
    float f = 5.5f;
    double d = 6.7;
    char c = 'A';
    boolean bool = true;

    // 5. Controle de memória e referências de objetos

    public void controleMemoria() {
        // Criação de um objeto.
        MinhaClasse objeto = new MinhaClasse();

        // Referência a um objeto nulo.
        MinhaClasse objetoNulo = null;

        // Referenciando o objeto atual.
        this.nomePublico = "Nome Atual";
    }

    public class MinhaSubClasse extends MinhaClasse {
        // Acessando a classe pai.
        public void metodoPai() {
            super.nomePublico = "Nome da Superclasse";
        }
    }

    // 6. Controle de blocos sincronizados (synchronized)
    public void blocoSincronizado() {
        synchronized (this) {
            // Bloco de código sincronizado.
        }
    }

    // 7. Palavras-chave literais
    boolean verdadeiro = true;
    boolean falso = false;
    MinhaClasse referenciaNula = null;

    // 8. Controle de herança e interfaces

    // Classe que herda de outra.
    public class MinhaNovaClasse extends MinhaClasse {
        // Usa "extends" para herdar de uma classe.
    }

    // Classe que implementa uma interface.
    public class ClasseComInterface implements MinhaInterface {
        // Usa "implements" para implementar métodos de uma interface.
    }

    // 9. Retornos de métodos

    public void metodoSemRetorno() {
        // O método "void" não retorna nenhum valor.
    }

    // 10. Genéricos
    public class Generica<T> {
        // Classe genérica que pode trabalhar com diferentes tipos.
    }

    public static void main(String[] args) {
        // Exemplo simples de uso das palavras reservadas.
        PalavrasReservadas exemplo = new PalavrasReservadas();
        exemplo.controleFluxo();
    }
}
