package com.alkemy.wallet.dto;

import com.alkemy.wallet.enums.ECurrency;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class AccountDto {
    private Long id;
    private ECurrency currency;
    private Double transactionLimit;
    private Double balance;
}
