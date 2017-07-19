package com.obs.pojos;

import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name="customers")
public class Customer {

	private Integer id;

	@Column(name="user_name")
	@NotEmpty(message="Name must not be blank")
	private String name;

	@Column(name="user_email")
	@NotEmpty(message="Email must not be blank")
	@Email(message="Invalid Email")
	private String email;

	@Column(name="user_password")
	@NotEmpty(message="Password must be supplied")
	@Pattern(regexp="((?=.*\\d)(?=.*[a-z])(?=.*[#@$*]).{5,20})",message="Blank or Invalid Password")
	private String password;
	
	private boolean enabled;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="reg_date")
	private Date regDate;

//	@CreationTimestamp
//	@Temporal(TemporalType.DATE)
//	@Column(name = "create_date", nullable=false)
//	private Date createDate;// = new Date();
//	
//	@UpdateTimestamp
//	@Temporal(TemporalType.DATE)
//	@Column(name = "modify_date", nullable=false)
//	private Date modifyDate;// = new Date();

	public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
	
	public Customer() {
		System.out.println("in cust constr");
	}

	public Customer(String name, String email, String password) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(length=20)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(length=20,unique=true)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

	@Column(length=20)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password +  "]";
	}

}
