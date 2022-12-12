package pereira.vinicio.marcos.JavaOO.model.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @apiNote Entidade Venda
 */
@Entity
@Table(name = "venda")
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_fun")
    private Funcionario funcionario;

    @Column(name = "ano")
    private String ano;

    @Column(name = "mes")
    private String mes;

    public static final BigDecimal LIMITE_VENDA_VALOR = new BigDecimal(9999999999.99);
    @Column(name = "valor")
    private BigDecimal valor;

    //GETTERS & SETTERS
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Funcionario getFuncionario() {
        return funcionario;
    }
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    public String getAno() {
        return ano;
    }
    public void setAno(String ano) {
        this.ano = ano;
    }
    public String getMes() {
        return mes;
    }
    public void setMes(String mes) {
        this.mes = mes;
    }
    public BigDecimal getValor() {
        return valor;
    }
    public void setValor(BigDecimal valor) throws Exception {
        if (valor.floatValue() > LIMITE_VENDA_VALOR.floatValue()){
            throw new Exception("Valor da venda acima do limite do campo de " + LIMITE_VENDA_VALOR);
        }
        this.valor = valor;
    }

    
    
}
