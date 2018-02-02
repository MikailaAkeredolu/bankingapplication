package com.example.bankingapplication.Domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Customer {
        @Id
        @GeneratedValue
        @Column(name="CUSTOMER_ID")
        private Long id;

        @Column(name="FIRST_NAME")
        private String first_name;

        @Column(name="LAST_NAME")
        private String last_name;

        @OneToMany
        @JoinColumn(name="CUSTOMER_ID")
        private Set<Address> address;

    public Customer(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Set<Address> getAddress() {
        return address;
    }

    public void setAddress(Set<Address> address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", address=" + address +
                '}';
    }
}
