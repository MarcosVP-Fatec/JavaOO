package pereira.vinicio.marcos.JavaOO.model.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @apiNote Entidade Cargo
 */

@Entity
@Table(name = "cargo")
public class Cargo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public static final int TAMANHO_CARGO_DESCR = 20;
    @Column(name = "descr")
    private String descr;

    public static final BigDecimal LIMITE_CARGO_SALARIO = new BigDecimal(9999999999.99);
    @Column(name = "salario")
    private BigDecimal salario;

    public static final BigDecimal LIMITE_CARGO_ADICIONAL_ANO = new BigDecimal(9999999999.99);
    @Column(name = "adic_ano")
    private BigDecimal adicionalAno;

    public static final BigDecimal LIMITE_CARGO_BENEFICIO_PERCENTUAL = new BigDecimal(999.99);
    @Column(name = "benef_pct")
    private BigDecimal beneficioPorcento;

    //GETTERS & SETTERS
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        if (id > 0) this.id = id;
    }
    public String getDescr() {
        return descr;
    }
    public void setDescr(String descr) throws Exception {
        if (descr.length() > TAMANHO_CARGO_DESCR){
            throw new Exception("Descrição do Cargo maior que o limite de " + TAMANHO_CARGO_DESCR);
        }
        this.descr = descr;
    }

    public BigDecimal getSalario() {
        return salario;
    }
    public void setSalario(BigDecimal salario) throws Exception {
        if (salario.floatValue() > LIMITE_CARGO_SALARIO.floatValue()){
            throw new Exception("Salário informado maior que o limite de " + LIMITE_CARGO_SALARIO);
        }
        this.salario = salario;
    }
    public BigDecimal getAdicionalAno() {
        return adicionalAno;
    }
    public void setAdicionalAno(BigDecimal adicionalAno) throws Exception {
        if (adicionalAno.floatValue() > LIMITE_CARGO_ADICIONAL_ANO.floatValue()){
            throw new Exception("Salário informado maior que o limite de " + LIMITE_CARGO_ADICIONAL_ANO);
        }
        this.adicionalAno = adicionalAno;
    }
    public BigDecimal getBeneficioPorcento() {
        return beneficioPorcento;
    }
    public void setBeneficioPorcento(BigDecimal beneficioPorcento) throws Exception {
        if (beneficioPorcento.floatValue() > LIMITE_CARGO_BENEFICIO_PERCENTUAL.floatValue()){
            throw new Exception("Percentual do Benefício informado maior que o limite de " + LIMITE_CARGO_BENEFICIO_PERCENTUAL);
        }
        this.beneficioPorcento = beneficioPorcento;
    }

}
