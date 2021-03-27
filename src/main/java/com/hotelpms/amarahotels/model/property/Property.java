package com.hotelpms.amarahotels.model.property;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Property {
   private GstInfo gstInfo;
   private ManagemenDetail managemenDetail;
   private String masterCheckIn;
   private String masterCheckOut;
   private String minimumPrice;
}
