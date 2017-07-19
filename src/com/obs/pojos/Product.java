package com.obs.pojos;

import java.util.Date;
import javax.validation.constraints.Size;

import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="products")
public class Product {

	private Integer id;


	@Column(name = "product_name", length = 100)
	@Size(min = 3, message = "Product Name must be at least 3 characters!")
	private String productName;

	@Column(name = "product_code", length = 100)
	@Size(min = 3, message = "Product Code must be at least 3 characters!")
	private String productCode;

	@Column(name = "product_base_amount", length = 100)
	@Size(min = 1, message = "Product base amount must be at least 3 characters!")
	private Long productBaseAmount;

	@ManyToOne
	@JoinColumn(name = "category_id")
	@Column(name = "product_category_id", length = 100)
	@Size(min = 1, message = "Product category must be at least 3 characters!")
	private Category productCategoryId;

	@Column(name = "product_seo_url", length = 100)
	@Size(min = 3, message = "Product url must be at least 3 characters!")
	private String productSeoUrl;

	@Column(name = "product_image_url", length = 100)
	@Size(min = 3, message = "Product image url must be at least 3 characters!")
	private String productImageUrl;

	@Column(name = "product_desc", length = 100)
	@Size(min = 5, message = "Product Description must be at least 5 characters!")
	private String productDesc;

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



	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public Long getProductBaseAmount() {
		return productBaseAmount;
	}

	public void setProductBaseAmount(Long productBaseAmount) {
		this.productBaseAmount = productBaseAmount;
	}

	public Category getProductCategoryId() {
		return productCategoryId;
	}

	public void setProductCategoryId(Category productCategoryId) {
		this.productCategoryId = productCategoryId;
	}

	public String getProductSeoUrl() {
		return productSeoUrl;
	}

	public void setProductSeoUrl(String productSeoUrl) {
		this.productSeoUrl = productSeoUrl;
	}

	public String getProductImageUrl() {
		return productImageUrl;
	}

	public void setProductImageUrl(String productImageUrl) {
		this.productImageUrl = productImageUrl;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}


	/**
	 * @param name
	 * @param productName
	 * @param productCode
	 * @param productBaseAmount
	 * @param productCategoryId
	 * @param productSeoUrl
	 * @param productImageUrl
	 * @param productDesc
	 * @param created
	 * @param updated
	 * @param enabled
	 */

	public Product(String name, String productName, String productCode, Long productBaseAmount,
			Category productCategoryId, String productSeoUrl, String productImageUrl, String productDesc) {
		super();
		this.productName = productName;
		this.productCode = productCode;
		this.productBaseAmount = productBaseAmount;
		this.productCategoryId = productCategoryId;
		this.productSeoUrl = productSeoUrl;
		this.productImageUrl = productImageUrl;
		this.productDesc = productDesc;
	}

	public Product() {
		super();
		System.out.println("in prod constr");
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", productCode=" + productCode
				+ ", productBaseAmount=" + productBaseAmount + ", productCategoryId=" + productCategoryId
				+ ", productSeoUrl=" + productSeoUrl + ", productImageUrl=" + productImageUrl + ", productDesc="
				+ productDesc + ", created=" + created + ", updated=" + updated + ", enabled=" + enabled + "]";
	}



}
