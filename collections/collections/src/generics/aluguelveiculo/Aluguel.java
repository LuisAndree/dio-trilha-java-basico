package generics.aluguelveiculo;

import java.time.LocalDate;

public class Aluguel<T extends Veiculo> {
    private Cliente cliente;
    private T veiculo;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private double total;

    public Aluguel(Cliente cliente, T veiculo, LocalDate dataInicio, LocalDate dataFim) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        calcularTotal();
    }

    private void calcularTotal() {
        long dias = java.time.temporal.ChronoUnit.DAYS.between(dataInicio, dataFim);
        this.total = dias * veiculo.getPrecoDiaria();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public T getVeiculo() {
        return veiculo;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Aluguel: " + veiculo + " | Cliente: " + cliente.getNome() +
               " | De: " + dataInicio + " Até: " + dataFim + " | Total: R$" + total;
    }
}
