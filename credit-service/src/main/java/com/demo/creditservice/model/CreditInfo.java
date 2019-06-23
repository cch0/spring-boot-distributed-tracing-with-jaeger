package com.demo.creditservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class CreditInfo {
    long id;
    Date date;
}
