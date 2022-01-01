package com.example.moderngroceries.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "product_details")
public class ProductDetails {

  @Id
  private Long id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "product_id")
  private Product product;

  private int quantity;

  private int quality;

  private Long mrp;

  private Long sellingPrice;

  private String vendor;

  private Long discountPrice;

  private int remainingInStock;

  private LocalDate expiryDate;

  private LocalDate dateOfPurchase;

  private int rating;

  private LocalDate latestPurchase;
}
