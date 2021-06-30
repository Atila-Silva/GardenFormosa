package br.com.garden.garden.model;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Order1")
public class OrderModel {
	

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "ID_ORDER1")
	private Long idOrder;
	/**
	private List<ProductModel> product;
	
	@Column(name = "ID_CLIENT")
	@NotNull(message = "Nome obrigatório")
	private int idClient;
	
	@Column(name = "NOME_PRODUCT")
	@NotNull(message = "Nome obrigatório")
	private int idClerk;
	*/
	
	@Column(name = "DATA_PRODUCT")
	private LocalDateTime createDateOrder;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "LISTA_PRODUCT",
	joinColumns = { @JoinColumn(name = "ORDER1_ID")},
	inverseJoinColumns = { @JoinColumn(name = "PRODUCT_ID")})
	private Set<ProductModel> productOrder = new HashSet<ProductModel>();
	
	public OrderModel() {	}


	public OrderModel(LocalDateTime createDateOrder, Set<ProductModel> productOrder) {
		super();
		this.createDateOrder = createDateOrder;
		this.productOrder = productOrder;
	}


	public Long getIdProduct() {
		return idOrder;
	}



	public void setIdProduct(Long idOrder) {
		this.idOrder = idOrder;
	}


	public LocalDateTime getCreateDateOrder() {
		return createDateOrder;
	}


	public void setCreateDateOrder(LocalDateTime createDateOrder) {
		this.createDateOrder = createDateOrder;
	}


	public Set<ProductModel> getProductOrder() {
		return productOrder;
	}


	public void setProductOrder(Set<ProductModel> productOrder) {
		this.productOrder = productOrder;
	}

	
	

}

