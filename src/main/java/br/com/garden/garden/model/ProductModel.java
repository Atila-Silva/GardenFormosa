package br.com.garden.garden.model;
/**
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "PRODUCT")
public class ProductModel {
	
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
	private Date date;
	
	public ProductModel() {	}

	public ProductModel(@NotNull(message = "Nome obrigatório") String nomeProduct,
			@NotNull(message = "Nome obrigatório") String detailProduct, Date date) {
		super();
		this.nomeProduct = nomeProduct;
		this.detailProduct = detailProduct;
		this.date = date;
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	

}
*/
