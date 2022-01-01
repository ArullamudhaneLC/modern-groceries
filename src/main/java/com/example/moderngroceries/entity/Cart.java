package com.example.moderngroceries.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "cart")
public class Cart {

  @Id
  private Long id;

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "users_id")
  private Users users;

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "cart")
  private List<ProductsInCart> productsInCart;
}
