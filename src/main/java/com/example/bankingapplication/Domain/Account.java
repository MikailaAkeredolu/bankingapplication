package com.example.bankingapplication.Domain;

import javax.persistence.*;

@Entity
public class Account {
    @Id
    @GeneratedValue
    @Column(name="ACCOUNT_ID")
    private Long id;

    @Column(name="TYPE")
    private Type type;

    @Column(name="NICKNAME")
    private String nickname;

    @Column(name="BALANCE")
    private Double balance;

    @ManyToOne
    @JoinColumn(name="CUSTOMER_ID")
    private Customer customer;


    public Account(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", type=" + type +
                ", nickname='" + nickname + '\'' +
                ", balance=" + balance +
                ", customer=" + customer +
                '}';
    }
}
