package edu.luisandre.anatomiadasclasses;
public class MinhaClasse {
    public static void main(String[] args) {
        System.out.println("Hello World!!");

        String primeiroNome = "Luis";
        String segundoNome = "Andre";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Nome Completo: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}

// Convenções de nomeclatura: 

// 1. Classes e Interfaces
//    - Padrão: PascalCase (ou UpperCamelCase)
//    - Ex: `MyClass`, `CustomerManager`, `ListProcessor`
//    - Classes e interfaces devem ser nomeadas com substantivos que descrevem o que a classe representa.

// 2. Métodos
//    - Padrão: camelCase (lowerCamelCase)
//    - Ex: `calculateTotal()`, `getUserName()`, `printDetails()`
//    - Métodos devem ser nomeados com verbos que descrevem a ação que o método realiza.

// 3. Variáveis
//    - Padrão: camelCase
//    - Ex: `totalValue`, `userName`, `isAvailable`
//    - Variáveis devem ser nomeadas de forma a indicar claramente o que armazenam. Prefira nomes descritivos.

// 4. Constantes (variáveis final)
//    - Padrão: UPPER_SNAKE_CASE (tudo em maiúsculas e com underscore para separar palavras)
//    - Ex: `MAX_VALUE`, `DEFAULT_TIMEOUT`
//    - Usado para valores que não mudam durante a execução do programa.

// 5. Pacotes
//    - Padrão: Letras minúsculas e, em geral, sem underscores
//    - Ex: `com.company.project`, `org.example.utils`
//    - Pacotes são geralmente nomeados seguindo o domínio da empresa, em ordem reversa.

// 6. Parâmetros de métodos
//    - Padrão: camelCase
//    - Ex: `processData(int numberOfItems)`
//    - Parâmetros de métodos devem seguir o mesmo padrão de variáveis locais e devem ser descritivos.

// 7. Nomes de Arquivos
//    - O nome do arquivo deve corresponder exatamente ao nome da classe pública que ele contém, incluindo letras maiúsculas e minúsculas.

//Para Pacotes:

// 1. Nome de Domínio Reverso
//    - A convenção mais comum é usar o nome do domínio da empresa em ordem reversa no início do nome do pacote, seguido pelo nome do projeto ou módulo. Isso evita conflitos de nomes entre pacotes de diferentes organizações.
//    - Ex: 
//      - Para uma empresa com domínio `example.org`, o pacote pode ser:
//        ```java
//        org.example.myproject
//        ```
//    - Se a empresa tem subdomínios, eles também podem ser incluídos:
//      ```java
//      com.company.department.project
//      ```

// 2. Tudo em Minúsculas
//    - Nomes de pacotes devem ser sempre em letras minúsculas. Isso facilita a portabilidade, especialmente em sistemas de arquivos que podem ser sensíveis a maiúsculas e minúsculas.
//    - Ex:
//      ```java
//      com.example.utility
//      ```

// 3. Subdivisão Lógica
//    - Pacotes podem ser divididos de forma hierárquica para refletir a organização lógica do projeto. Isso facilita a modularidade e a organização.
//    - Ex:
//      - Pacote para utilitários: `com.example.util`
//      - Pacote para classes de serviços: `com.example.service`
//      - Pacote para classes relacionadas ao banco de dados: `com.example.database`

// 4. Evitar Underscore ou Números
//    - Evite usar underscores (`_`) ou números nos nomes dos pacotes. Isso é uma prática comum para manter a clareza e simplicidade.
//    - Ex(evitar):
//      ```java
//      com.example.my_project_2  // Não recomendado
//      ```

// 5. Evitar Uso de Plurais e Siglas
//    - O uso de nomes no plural ou siglas não é recomendado. Prefira nomes descritivos e diretos, no singular.
//    - Ex:
//      - Melhor: `com.example.service`
//      - Evitar: `com.example.services`

// 6. Abordagem Funcional
//    - Os pacotes devem ser nomeados de acordo com sua função, e não pela tecnologia usada. Isso mantém os pacotes independentes da implementação.
//    - Ex:
//      - Melhor: `com.example.customerdata`
//      - Evitar: `com.example.sqlimplementation`

// 7. Pacotes de Testes
//    - Pacotes de testes geralmente seguem o mesmo esquema dos pacotes principais, mas são colocados em uma árvore de pacotes separada, como `src/test/java`.
//    - Ex:
//      ```java
//      com.example.myproject.service   // Código principal
//      com.example.myproject.service.test  // Pacote de testes
//      ```
