public class Data {
    int dia;
    int mes;
    int ano;

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    //Q9
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
