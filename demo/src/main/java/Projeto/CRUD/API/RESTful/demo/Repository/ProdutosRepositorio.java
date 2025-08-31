package Projeto.CRUD.API.RESTful.demo.Repository;

import Projeto.CRUD.API.RESTful.demo.Model.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutosRepositorio extends JpaRepository<Produtos, Long> {
}
