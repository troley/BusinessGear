package com.renarcus.businessgear.model;

import com.renarcus.businessgear.model.validator.phone.Phone;
import org.hibernate.validator.constraints.Email;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by troley on 11-5-17.
 */
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;

    @NotNull
    @Column(name = "first_name")
    @Min(2)
    private String fname;

    @NotNull
    @Column(name = "last_name")
    @Min(2)
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
    @ManyToOne
    @JoinColumn(name = "chosen_products", nullable = false)
    private Product chosenProducts;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
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

    public Product getChosenProducts() {
        return chosenProducts;
    }

    public void setChosenProducts(Product chosenProducts) {
        this.chosenProducts = chosenProducts;
    }
}
