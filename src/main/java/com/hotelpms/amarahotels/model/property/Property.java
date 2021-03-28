package com.hotelpms.amarahotels.model.property;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "property")
public class Property {

   @Id
   private int id;

   @OneToOne(targetEntity = Address.class, mappedBy = "property")
   private Address address;
}
