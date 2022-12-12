package pereira.vinicio.marcos.JavaOO.controller.lists;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pereira.vinicio.marcos.JavaOO.controller.lists.dto.ListaFuncionarioSalarioBeneficioDto;
import pereira.vinicio.marcos.JavaOO.model.entity.Funcionario;
import pereira.vinicio.marcos.JavaOO.model.repository.FuncionarioRepository;

@RestController
@RequestMapping(value = "/lista")
@CrossOrigin
public class ListasController {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @GetMapping(value = "/salarios-beneficios/{ano}/{mes}/{funcionarios}/")
    //@SuppressWarnings("unchecked")
    public List<ListaFuncionarioSalarioBeneficioDto> salariosBeneficios(
                                          @PathVariable String ano
                                         ,@PathVariable String mes
                                         ,@PathVariable Long funcionarios[]
                                         ) {
        System.out.println("Lista Salários Benefícios " + mes.toString() + "/" + ano.toString() + " : " + Arrays.asList(funcionarios));                                        
        List<ListaFuncionarioSalarioBeneficioDto> lista = new ArrayList<ListaFuncionarioSalarioBeneficioDto>();

        try {
            List<Funcionario> dados = funcionarioRepository.listaSalariosBeneficios(ano);
            for (Funcionario funcionario : dados) {
                    lista.add( 
                        new ListaFuncionarioSalarioBeneficioDto( funcionario.getNome()
                                                                , funcionario.getCargo().getSalario() )                       
                    );
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }

//     @GetMapping(value = "/salarios-beneficios/{ano}/{mes}/{funcionarios}/")
//     public List<Funcionario> salariosBeneficios(
//                                           @PathVariable String ano
//                                          ,@PathVariable String mes
//                                          ,@PathVariable Long funcionarios[]
//                                          ) {
//         System.out.println("Lista Salários Benefícios " + mes.toString() + "/" + ano.toString() + " : " + Arrays.asList(funcionarios));                                        
//         final EntityManager em = PersistenceManager.getInstance().getEntityManager();
//         List<Funcionario> lista;

//         try {
//             String q = "select F from Funcionario F inner join F.cargo C";

// System.out.println("Gerou string "+q);
//             TypedQuery<Funcionario> query = em.createQuery( q ,Funcionario.class);
// System.out.println("Gerou query "+query);                        
//             lista = query.getResultList();
// System.out.println("Gerou resultado ");            
            
//         } catch (Exception e) {
//             //e.printStackTrace();
//             lista = new ArrayList<Funcionario>();
//         }

//         return lista;
//     }

    @GetMapping(value = "/salarios-no-mes")
    public String salariosNoMes(){
        return "Lista Salarios no Mês";
    }

    @GetMapping(value = "/beneficios-no-mes")
    public String beneficiosNoMes(){
        return "Lista Benefícios no Mês";
    }

    @GetMapping(value = "/maior-recebimento-no-mes")
    public String maiorRecebimentoNoMes(){
        return "Lista Maior Recebimento no Mês";
    }

    @GetMapping(value = "/maior-beneficio-no-mes")
    public String maiorBeneficioNoMes(){
        return "Lista Maior Benefício no Mês";
    }

    @GetMapping(value = "/maior-venda-no-mes")
    public String maiorVendaNoMes(){
        return "Lista Maior Venda no Mês";
    }
    

}