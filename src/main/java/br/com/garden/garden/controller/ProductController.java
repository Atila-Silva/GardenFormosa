package br.com.garden.garden.controller;

import java.util.List;
import java.util.Optional;

import org.hibernate.type.LocalDateTimeType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.datetime.joda.LocalDateTimeParser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.garden.garden.model.ProductModel;
import br.com.garden.garden.repository.ProductRepository;

@RestController
@RequestMapping("/home")
public class ProductController {
	
	//private static final String HOME_FOLDER = "home/";
	
	@Autowired
	ProductRepository productRepositoty;
	
	@GetMapping 
	public String findCreat() {
		System.out.println("estou aqui no find");

		productRepositoty.save(new ProductModel("trepadeira", "sob na parede"));
		productRepositoty.save(new ProductModel("samanbaia", "sob na parede"));
		productRepositoty.save(new ProductModel("girasol", "sob na parede"));
		productRepositoty.save(new ProductModel("cupin", "sob na parede"));
		productRepositoty.save(new ProductModel("terra", "sob na parede"));
		productRepositoty.save(new ProductModel("semente", "sob na parede"));
		productRepositoty.save(new ProductModel("vaso", "sob na parede"));
		return "home";
	}
	
	@GetMapping("/produtos")
	public List<ProductModel> findAll() {
		System.out.println("estou aqui");
		return productRepositoty.findAll();
	}
	
	@GetMapping("/produto/{id}")
	public Optional<ProductModel> find(@PathVariable(value = "id") Long id) {
		System.out.println("estou aqui");
		return productRepositoty.findById(id);
	}
	
	@PostMapping("/produto")
	public ProductModel saveProduct(@RequestBody ProductModel produto) {
		return productRepositoty.save(produto);
	} 
	
	@PutMapping("/produto")
	public ProductModel updateProduct(@RequestBody ProductModel produto) {
		return productRepositoty.save(produto);
	} 
	
	@DeleteMapping("/produto/{id}")
	public boolean deleteProduct(@PathVariable(value = "id") Long id) {
		System.out.println("estou aqui");
		productRepositoty.deleteById(id);
		return true;
	}
	
	

}
