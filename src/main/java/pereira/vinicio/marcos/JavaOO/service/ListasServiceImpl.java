package pereira.vinicio.marcos.JavaOO.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import pereira.vinicio.marcos.JavaOO.model.entity.Cargo;

public class ListasServiceImpl implements ListasService {

    @Override
    public List<Cargo> salariosBeneficios(String ano, String mes, Long funcionarios[]) {
        System.out.println("Lista Salários Benefícios " + mes.toString() + "/" + ano.toString() + " : " + Arrays.asList(funcionarios));
        List<Cargo> cargos = new ArrayList<Cargo>();
cargos.add(new Cargo(1L)); 
        return cargos;
    }
    
}
