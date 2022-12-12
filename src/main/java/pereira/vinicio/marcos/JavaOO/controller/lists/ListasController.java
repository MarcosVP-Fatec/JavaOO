package pereira.vinicio.marcos.JavaOO.controller.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pereira.vinicio.marcos.JavaOO.model.entity.Cargo;

@RestController
@RequestMapping(value = "/lista")
@CrossOrigin
public class ListasController {

    private EntityManager em = Persistence.createEntityManagerFactory("default").createEntityManager();

    @GetMapping(value = "/salarios-beneficios/{ano}/{mes}/{funcionarios}/")
    public String salariosBeneficios(@PathVariable String ano
                                    ,@PathVariable String mes
                                    ,@PathVariable Long funcionarios[]
                                    ) throws Exception {
        System.out.println("Lista Salários Benefícios " + mes.toString() + "/" + ano.toString() + " : " + Arrays.asList(funcionarios));                                        
        List<Object> cargos = new ArrayList<>();

        try {
            TypedQuery<Cargo> query = em.createQuery( "select c from Cargo c",Cargo.class);
            return "dois";
            //Query query = em.createNativeQuery( "select c from cargo c");
            //cargos = query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            cargos = new ArrayList<>();
            Cargo c = new Cargo(1L);
            c.setDescr(e.toString());
            cargos.add(c);
        }

        //return cargos;
        return "nove";
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