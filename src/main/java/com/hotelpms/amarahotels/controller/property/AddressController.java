package com.hotelpms.amarahotels.controller.property;

import com.hotelpms.amarahotels.model.property.Address;
import com.hotelpms.amarahotels.service.property.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@EnableSwagger2
@RequestMapping(name = "/address")
public class AddressController  {
    @Autowired
    public AddressService addressService;

    @PostMapping(path = "/addsave",produces = "application/json",consumes = "application/json")
    public Address savedetail(@RequestBody Address address)
    {
        return addressService.save(address);
    }
}
