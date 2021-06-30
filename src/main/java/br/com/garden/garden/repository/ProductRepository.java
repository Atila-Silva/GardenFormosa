package br.com.garden.garden.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.garden.garden.model.ProductModel;

public interface ProductRepository extends JpaRepository<ProductModel, Long> {

	

}
