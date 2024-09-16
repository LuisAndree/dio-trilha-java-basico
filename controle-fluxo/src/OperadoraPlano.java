public class OperadoraPlano {
    public static void main(String[] args) {
        String plano = "T";

        switch (plano) {
            case "T":
                System.out.println("5GB Youtube");
            case "M":
                System.out.println("ATIZAP e Instagram gratis");
            case "B":
                System.out.println("100 min de ligação");
            default:
                break;
        }

        // O switch normalmente tem o break apos cada case, assim ele se comporta como if-else, 
        // mas se usarmos sem o break apos cada case ele se ira executar todas as opçoes de baixo pra cima e isso pode ser util. 
    }
}
