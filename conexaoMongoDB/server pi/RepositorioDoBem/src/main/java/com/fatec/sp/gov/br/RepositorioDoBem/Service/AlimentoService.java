package com.fatec.sp.gov.br.RepositorioDoBem.Service;

import com.fatec.sp.gov.br.RepositorioDoBem.Entity.Alimento;
import com.fatec.sp.gov.br.RepositorioDoBem.Repository.AlimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class AlimentoService {

    @Autowired
    private AlimentoRepository alimentoRepository;

    public Alimento addAlimento(@RequestBody Alimento alimento){

        return alimentoRepository.save(alimento);
    }

    public List<Alimento> getAllAlimento(){
        return alimentoRepository.findAll();
    }

    public void deleteAlimento(String alimentoId){alimentoRepository.deleteById(alimentoId);
    }
}
