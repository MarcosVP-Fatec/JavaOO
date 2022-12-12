package pereira.vinicio.marcos.JavaOO.controller.lists.dto;

import java.math.BigDecimal;

public class ListaFuncionarioSalarioBeneficioDto {

    private String nome;
    private BigDecimal salarioMaisBeneficio;

    public ListaFuncionarioSalarioBeneficioDto( String nome
                                              , BigDecimal salarioMaisBeneficio){
        this.setNome(nome);                                        
        this.setSalarioMaisBeneficio(salarioMaisBeneficio);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getSalarioMaisBeneficio() {
        return salarioMaisBeneficio;
    }

    public void setSalarioMaisBeneficio(BigDecimal salarioMaisBeneficio) {
        this.salarioMaisBeneficio = salarioMaisBeneficio;
    }

}
