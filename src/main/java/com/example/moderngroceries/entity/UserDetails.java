package com.example.moderngroceries.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "user_details")
public class UserDetails {

  @Id
  private Long id;

  @OneToOne(fetch = FetchType.LAZY)
  @JsonIgnoreProperties("userDetails")
  @JoinColumn(name = "users_id")
  private Users users;

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "userDetails")
  private List<Address> address;

  @NotNull
  private String gender;

  @NotNull
  private String phoneNumber;

  @NotNull
  private LocalDate DOB;

  private int age;


  public void setDOB(int day,int month, int year) {
    LocalDate today = LocalDate.now();
    LocalDate birthdayDate = LocalDate.of(year, month, day);
    Period period = Period.between(birthdayDate, today);
    this.DOB = birthdayDate;
    this.age = period.getYears();
  }

}
