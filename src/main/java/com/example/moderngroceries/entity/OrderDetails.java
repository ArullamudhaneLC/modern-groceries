package com.example.moderngroceries.entity;

import com.example.moderngroceries.dto.ProductSummary;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class OrderDetails {
  @Id
  private int id;

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "users_id")
  private Users users;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "product_details_id")
  private ProductDetails productDetails;

  private LocalDate dateOfDelivery;

  private String status;
}
