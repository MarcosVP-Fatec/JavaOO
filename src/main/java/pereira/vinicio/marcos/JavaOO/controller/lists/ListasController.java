package pereira.vinicio.marcos.JavaOO.controller.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pereira.vinicio.marcos.JavaOO.model.PersistenceManager;
import pereira.vinicio.marcos.JavaOO.model.entity.Cargo;

@RestController
@RequestMapping(value = "/lista")
@CrossOrigin
public class ListasController {

    @GetMapping(value = "/salarios-beneficios/{ano}/{mes}/{funcionarios}/")
    public List<Cargo> salariosBeneficios(@PathVariable String ano
                                         ,@PathVariable String mes
                                         ,@PathVariable Long funcionarios[]
                                         ) {
        System.out.println("Lista Salários Benefícios " + mes.toString() + "/" + ano.toString() + " : " + Arrays.asList(funcionarios));                                        
        final EntityManager em = PersistenceManager.getInstance().getEntityManager();
        List<Cargo> cargos; // = new ArrayList<>();

        try {
            String q = "select c from Cargo c";
            TypedQuery<Cargo> query = em.createQuery( q ,Cargo.class);
            cargos = query.getResultList();
            
        } catch (Exception e) {
            //e.printStackTrace();
            cargos = new ArrayList<Cargo>();
        }

        return cargos;
    }

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