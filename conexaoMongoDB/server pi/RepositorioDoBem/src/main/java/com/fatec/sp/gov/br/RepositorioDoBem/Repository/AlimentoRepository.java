package com.fatec.sp.gov.br.RepositorioDoBem.Repository;

import com.fatec.sp.gov.br.RepositorioDoBem.Entity.Alimento;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlimentoRepository extends MongoRepository<Alimento, String> {
}
