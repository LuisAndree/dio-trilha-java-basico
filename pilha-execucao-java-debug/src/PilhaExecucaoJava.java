public class PilhaExecucaoJava {
    public static void main(String[] args) {
        PilhaExecucaoJava test = new PilhaExecucaoJava();
        test.methodA();
    }

    public void methodA() {
        System.out.println("Iniciando methodA");
        methodB();  // Chama o methodB
        System.out.println("Finalizando methodA");
    }

    public void methodB() {
        System.out.println("Iniciando methodB");
        methodC();  // Chama o methodC
        System.out.println("Finalizando methodB");
    }

    public void methodC() {
        System.out.println("Iniciando methodC");
        methodD();  // Chama o methodD
        System.out.println("Finalizando methodC");
    }

    public void methodD() {
        System.out.println("Iniciando methodD");
        Thread.dumpStack();
        System.out.println("Finalizando methodD");
    }
}
