package com.example.moderngroceries.dto;

import com.example.moderngroceries.entity.ProductDetails;
import lombok.Data;

@Data
public class ProductSummary {

  private ProductDetails productDetails;

  private int quantity;
}
