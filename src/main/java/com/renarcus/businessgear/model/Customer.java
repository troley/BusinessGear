package com.renarcus.businessgear.model;

import com.renarcus.businessgear.model.validator.phone.Phone;
import org.hibernate.validator.constraints.Email;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

/**
 * Created by troley on 11-5-17.
 */
@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private int customer_id;

    @NotNull
    @Column(name = "first_name")
    private String fname;

    @NotNull
    @Column(name = "last_name")
    private String lname;

    @NotNull
    private Date birthdate;

    @Email
    @NotNull
    private String email;

    @Phone
    @NotNull
    private String telnumber;

    @NotNull
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinTable(name = "customer_products", joinColumns = {
            @JoinColumn(name = "customer_id", nullable = false, updatable = false)},
            inverseJoinColumns = {
            @JoinColumn(name = "product_id", nullable = false, updatable = false)}
    )
    private List<Product> products;


    public Customer() {
    }

    public Customer(String fname, String lname, Date birthdate, String email, String telnumber) {
        this.fname = fname;
        this.lname = lname;
        this.birthdate = birthdate;
        this.email = email;
        this.telnumber = telnumber;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelnumber() {
        return telnumber;
    }

    public void setTelnumber(String telnumber) {
        this.telnumber = telnumber;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
