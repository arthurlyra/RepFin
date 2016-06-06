package com.ea975.repfin;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table (name = "users")
public class Users {

    @Id
    @GeneratedValue
    private Integer user_id;

    @NotNull
    @Column(name = "name")
    private String name;

    @NotNull
    @Column(name = "password")
    private String password;

    @NotNull
    @Column(name = "balance")
    private String balance;

    @NotNull
    @Column(name = "exist")
    private Boolean exist;

    @ManyToOne
    @JoinColumn(name = "republica_id")
    private Republicas republica;

//    @OneToMany(mappedBy = "responsible_user_id", targetEntity = Transactions.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    private List<Transactions> transactions;

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public Boolean getExist() {
        return exist;
    }

    public void setExist(Boolean exist) {
        this.exist = exist;
    }

    public Republicas getRepublica() {
        return republica;
    }

    public void setRepublica(Republicas republica) {
        this.republica = republica;
    }

//    public List<Transactions> getTransactions() {
//        return transactions;
//    }
//
//    public void setTransactions(List<Transactions> transactions) {
//        this.transactions = transactions;
//    }
}
