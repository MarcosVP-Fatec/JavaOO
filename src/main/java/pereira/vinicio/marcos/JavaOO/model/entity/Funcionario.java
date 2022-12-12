package pereira.vinicio.marcos.JavaOO.model.entity;

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
 * @apiNote Entidade Funcionario
 */

@Entity
@Table(name = "funcionario")
public class Funcionario {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public static final int TAMANHO_FUNCIONARIO_NOME = 40;
    @Column(name = "nome")
    private String nome;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_crg")
    private Cargo cargo;

    @Column(name = "ctr_ano")
    private String contratoAno;

    @Column(name = "ctr_mes")
    private String contratoMes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if (nome.length() > TAMANHO_FUNCIONARIO_NOME){
            throw new Exception("Tamanho do nome do funcionário maior que o limite de " + TAMANHO_FUNCIONARIO_NOME);
        }
        this.nome = nome;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public String getContratoAno() {
        return contratoAno;
    }

    public void setContratoAno(String contratoAno) {
        this.contratoAno = contratoAno;
    }

    public String getContratoMes() {
        return contratoMes;
    }

    public void setContratoMes(String contratoMes) {
        this.contratoMes = contratoMes;
    }
    
}
