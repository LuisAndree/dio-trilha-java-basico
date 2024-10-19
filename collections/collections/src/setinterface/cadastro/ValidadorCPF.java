package setinterface.cadastro;

public class ValidadorCPF {
    public static boolean validar(String cpf) {
        if (cpf == null || cpf.length() != 11 || !cpf.matches("\\d+")) {
            return false;
        }
        return true;
    }
}
