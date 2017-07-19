package com.obs.pojos;

import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;;

@Entity
@Table(name="products")
public class Product {

	private Integer product_id;
	private String product_code;
	private String product_name;
	private String product_desc;
	private long base_amount;
	private Integer category_id;
	private String seo_url;
	private String image_url;
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date_created", nullable = false)
    private Date created;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date_updated", nullable = false)
    private Date updated;

    @PrePersist
    protected void onCreate() {
    updated = created = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
    updated = new Date();
    }
	private boolean enabled;
	private Integer rank;

	
	public Product() {
		super();
		System.out.println("In product pojo");
	}
	
	public Product(Integer product_id, String product_code, String product_name, String product_desc, 
			long base_amount, Integer category_id, String seo_url, String image_url){
		this.product_id=product_id;
		this.product_code=product_code;
		this.product_name=product_name;
		this.product_desc=product_desc;
		this.base_amount=base_amount;
		this.category_id=category_id;
		this.seo_url=seo_url;
		this.image_url=image_url;
	}
	

	@Id
	public Integer getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}

	@Column(name = "product_code", length = 100)
	@Size(min = 3, message = "Product Code must be at least 3 characters!")
	public String getProduct_code() {
		return product_code;
	}

	public void setProduct_code(String product_code) {
		this.product_code = product_code;
	}

	@Column(name = "product_name", length = 100)
	@Size(min = 3, message = "Product Name must be at least 3 characters!")
	@NotEmpty(message="Name must not be blank")
	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	@Column(name = "product_desc", length = 100)
	@Size(min = 5, message = "Product Description must be at least 5 characters!")
	public String getProduct_desc() {
		return product_desc;
	}

	public void setProduct_desc(String product_desc) {
		this.product_desc = product_desc;
	}

	@Column(name = "product_base_amount", length = 100)
	@Size(min = 1, message = "Product base amount must be at least 3 characters!")
	public long getBase_amount() {
		return base_amount;
	}

	public void setBase_amount(long base_amount) {
		this.base_amount = base_amount;
	}

	@ManyToOne
	@JoinColumn(name = "category_id")
	@Column(name = "product_category_id", length = 100)
	@Size(min = 1, message = "Product category must be at least 3 characters!")
	public Integer getCategory_id() {
		return category_id;
	}

	public void setCategory_id(Integer category_id) {
		this.category_id = category_id;
	}

	@Column(name = "product_seo_url", length = 100)
	@Size(min = 3, message = "Product url must be at least 3 characters!")
	public String getSeo_url() {
		return seo_url;
	}

	public void setSeo_url(String seo_url) {
		this.seo_url = seo_url;
	}

	@Column(name = "product_image_url", length = 100)
	@Size(min = 3, message = "Product image url must be at least 3 characters!")
	public String getImage_url() {
		return image_url;
	}

	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Integer getRank() {
		return rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}
	
	
	
	
}
