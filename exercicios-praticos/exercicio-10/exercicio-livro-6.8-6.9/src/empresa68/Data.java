package empresa68;
public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String formataData() {
        String dataFormatada;
        if (dia < 10 && mes < 10) {
            dataFormatada = "[0" + dia + "/0" + mes + "/" + ano + "]";
        } else if (dia < 10 && mes > 10) {
            dataFormatada = "[0" + dia + "/" + mes + "/" + ano + "]";
        } else if (dia > 10 && mes < 10) {
            dataFormatada = "[" + dia + "/0" + mes + "/" + ano + "]";
        } else {
            dataFormatada = "[" + dia + "/" + mes + "/" + ano + "]";
        }
        return dataFormatada;
    }

    @Override
    public String toString() {
        return formataData();
    }
}
