package pereira.vinicio.marcos.JavaOO.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pereira.vinicio.marcos.JavaOO.model.entity.Funcionario;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{

    // @Query( "select f from Funcionario f inner join f.cargo c"
    //       + " where ( (c.ano = ?1 and c.mes <= ?2) or c.ano < ?1)"
    //       + "   and f.id in (?3)"
    //       )
    // public List<Funcionario> listaSalariosBeneficios(String ano
    //                                                 ,String mes
    //                                                 ,Long funcionarios[]);
    
    @Query("select f from Funcionario f inner join f.cargo c where c.ano = ?1") // c where c.ano = ?1
    public List<Funcionario> listaSalariosBeneficios(String ano);
}


