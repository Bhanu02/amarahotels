package com.hotelpms.amarahotels.model.property;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "address")
public class Address {

    @Id
    @Column(name="address_id")
    private Long addressId;
    private String address;
    private String city;
    private String country;
    private String locality;
    private String pincode;
    private String state;
    @OneToOne(targetEntity = Property.class, cascade = CascadeType.ALL)
    private Property property;

}
