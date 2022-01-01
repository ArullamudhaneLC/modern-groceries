package com.example.moderngroceries.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "address")
public class Address {

  @Id
  private Long id;

  private String Name;

  private String phoneNumber;

  private String address;

  private String city;

  private String state;

  private String pinCode;

  private String landMark;

  private String type;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "user_details_id")
  private UserDetails userDetails;

}
