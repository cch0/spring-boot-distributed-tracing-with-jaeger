package com.demo.account.model;

import com.demo.account.client.model.PaymentInfo;
import com.demo.account.client.model.ProfileInfo;
import lombok.Data;

@Data
public class AccountInfo {
    PaymentInfo paymentInfo;
    String description;
    ProfileInfo profileInfo;
}
