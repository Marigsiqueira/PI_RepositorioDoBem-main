package com.fatec.sp.gov.br.RepositorioDoBem.Controller;

import com.fatec.sp.gov.br.RepositorioDoBem.Entity.Alimento;
import com.fatec.sp.gov.br.RepositorioDoBem.Service.AlimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AlimentoController {

    @Autowired
    private AlimentoService alimentoService;

    @PostMapping("/addAlimento")
    public Alimento addAlimento(@RequestBody Alimento alimento){
        return alimentoService.addAlimento(alimento);
    }

    @GetMapping("/getAllAlimento")
    public List<Alimento> getAllAlimento(){
        return alimentoService.getAllAlimento();
    }

    @DeleteMapping("/deleteAlimento/{alimentoId}")
    public String deleteUser(@PathVariable String alimentoId){
        alimentoService.deleteAlimento(alimentoId);
        return "Alimento Deletado com sucesso";
    }
}
