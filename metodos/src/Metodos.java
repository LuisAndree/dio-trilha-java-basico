public class Metodos {

    // Use nomes de métodos com verbos e em camelCase.
    public void calculateTotal() {
        // Método simples que deve realizar uma única tarefa.
    }

    // Evite muitos parâmetros; se necessário, crie uma classe para encapsular
    // dados.
    public void registerUser(User user) {
        // Usar uma classe como parâmetro ajuda a manter o código limpo.
    }

    // Métodos "get" e "set" seguem a convenção padrão para acessar ou modificar
    // atributos.
    private int age;

    public int getAge() {
        return age; // Getter
    }

    public void setAge(int age) {
        this.age = age; // Setter
    }

    // Exemplo de método estático, útil quando o método não depende do estado do
    // objeto.
    public static double calculatePi() {
        return 3.14159;
    }

    // Use sobrecarga de métodos quando fizer sentido.
    public void print(String message) {
        System.out.println(message); // Imprime uma mensagem
    }

    public void print(int number) {
        System.out.println(number); // Imprime um número
    }

    // Exceções devem ser específicas, evitando capturar Exception genérico.
    public void processPayment(double amount) throws InsufficientFundsException {
        // Lança uma exceção personalizada.
        if (amount <= 0) {
            throw new InsufficientFundsException("Saldo insuficiente");
        }
    }

    public static void main(String[] args) {
        // Cria uma instância da classe para chamar métodos não estáticos.
        Metodos exemplo = new Metodos();

        // Chama métodos de exemplo.
        exemplo.setAge(25);
        System.out.println("Idade: " + exemplo.getAge());

        // Chama método estático diretamente.
        System.out.println("Valor de Pi: " + Metodos.calculatePi());

        // Exemplo de sobrecarga de métodos.
        exemplo.print("AOBAAA, BAOO?!");
        exemplo.print(123);
    }
}

// Exemplo de classe auxiliar User para encapsular dados.
class User {
    private String name;
    private String email;

    // Construtor e métodos de acesso.
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

// Exemplo de exceção personalizada.
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// Classe auxiliar Item usada em exemplo de métodos.
class Item {
    private String name;
    private double price;

    // Construtor e métodos de acesso.
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
