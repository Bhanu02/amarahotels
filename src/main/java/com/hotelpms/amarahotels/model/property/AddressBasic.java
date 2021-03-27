package com.hotelpms.amarahotels.model.property;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressBasic {

    String address;
    String city;
    String country;
    String locality;
    String pincode;
    String state;

}
