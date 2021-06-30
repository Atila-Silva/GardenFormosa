package br.com.garden.garden.model;

import java.io.Serializable;
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
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "PRODUCT")
public class ProductModel implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "ID_PRODUCT")
	private Long idProduct;
	
	@Column(name = "NOME_PRODUCT")
	@NotNull(message = "Nome obrigatório")
	private String nomeProduct;
	
	@Column(name = "DETAIL_PRODUCT")
	@NotNull(message = "Nome obrigatório")
	private String detailProduct;
	
	@Column(name = "DATA_PRODUCT")
	private LocalDateTime createDateProduct;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "productOrder" )
	private Set<OrderModel> orders = new HashSet<OrderModel>();
	
	public ProductModel() {	}

	public ProductModel(@NotNull(message = "Nome obrigatório") String nomeProduct,
			@NotNull(message = "Nome obrigatório") String detailProduct) {
	
		this.nomeProduct = nomeProduct;
		this.detailProduct = detailProduct;
		this.createDateProduct = LocalDateTime.now();
	}

	public Long getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
	}
	
	@Size(min = 2, max = 20, message = "nome com minimo de 2 e maixo de 20!")
	public String getNomeProduct() {
		return nomeProduct;
	}

	public void setNomeProduct(String nomeProduct) {
		this.nomeProduct = nomeProduct;
	}

	@Size(min = 2, max = 400, message = "nome com minimo de 2 e maixo de 400!")
	public String getDetailProduct() {
		return detailProduct;
	}

	public void setDetailProduct(String detailProduct) {
		this.detailProduct = detailProduct;
	}

	public LocalDateTime getCreateDateProduct() {
		return createDateProduct;
	}

	public void setCreateDateProduct(LocalDateTime createDateProduct) {
		this.createDateProduct = createDateProduct;
	}

	

}

