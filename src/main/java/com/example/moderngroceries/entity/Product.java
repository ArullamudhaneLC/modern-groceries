package com.example.moderngroceries.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "product")
public class Product {

  @Id
  private Long id;

  private String name;

  private String Details;

  private String Category;
}
