package com.hotelpms.amarahotels.model.property;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankDetail {

    String accountNumber;
    String address1;
    String address2;
    String bankName;
    String ifscCode;

}
