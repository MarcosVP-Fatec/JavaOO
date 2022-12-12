package pereira.vinicio.marcos.JavaOO.model.entity;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * @apiNote Entidade Cargo
 */

@Entity
@Table(name = "cargo")
public class Cargo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "descr")
    private String descr;

    @Column(name = "salario")
    private BigDecimal salario;

    @Column(name = "adic_ano")
    private BigDecimal adicionalAno;

    @Column(name = "benef_pct")
    private BigDecimal beneficioPorcento;

    // @Transient
    // @OneToMany(mappedBy = "cargo", fetch = FetchType.LAZY)
    // private List<Funcionario> funcionarios;

    //CONSTRUCTOR
    public Cargo(){}
    public Cargo(Long id){
        this.setId(id);
    }

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
    public void setDescr(String descr) {
        this.descr = descr;
    }

    public BigDecimal getSalario() {
        return salario;
    }
    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
    public BigDecimal getAdicionalAno() {
        return adicionalAno;
    }
    public void setAdicionalAno(BigDecimal adicionalAno) {
        this.adicionalAno = adicionalAno;
    }
    public BigDecimal getBeneficioPorcento() {
        return beneficioPorcento;
    }
    public void setBeneficioPorcento(BigDecimal beneficioPorcento) {
        this.beneficioPorcento = beneficioPorcento;
    }
    
}
