package br.com.garden.garden.model;
/**
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Order")
public class OrderModel {
	

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "ID_ORDER")
	private Long idProduct;
	
	private List<ProductModel> product;
	
	@Column(name = "ID_CLIENT")
	@NotNull(message = "Nome obrigatório")
	private int idClient;
	
	@Column(name = "NOME_PRODUCT")
	@NotNull(message = "Nome obrigatório")
	private int idClerk;
	
	@Column(name = "DATA_PRODUCT")
	private Date date;
	
	public OrderModel() {	}

	

	public OrderModel(List<ProductModel> product, @NotNull(message = "Nome obrigatório") int idClient,
			@NotNull(message = "Nome obrigatório") int idClerk, Date date) {
		super();
		this.product = product;
		this.idClient = idClient;
		this.idClerk = idClerk;
		this.date = date;
	}



	public Long getIdProduct() {
		return idProduct;
	}



	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
	}


	
	public List<ProductModel> getProduct() {
		return product;
	}



	public void setProduct(List<ProductModel> product) {
		this.product = product;
	}



	public int getIdClient() {
		return idClient;
	}



	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}



	public int getIdClerk() {
		return idClerk;
	}



	public void setIdClerk(int idClerk) {
		this.idClerk = idClerk;
	}



	public Date getDate() {
		return date;
	}



	public void setDate(Date date) {
		this.date = date;
	}



	

	
	

}
*/
