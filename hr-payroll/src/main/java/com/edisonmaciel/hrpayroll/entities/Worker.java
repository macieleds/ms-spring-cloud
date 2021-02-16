package com.edisonmaciel.hrpayroll.entities;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Worker implements Serializable {

    private Long id;
    private String name;
    private Double dailyIncome;

}