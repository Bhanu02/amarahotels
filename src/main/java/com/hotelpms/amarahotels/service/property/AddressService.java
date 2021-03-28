package com.hotelpms.amarahotels.service.property;

import com.hotelpms.amarahotels.model.property.Address;
import com.hotelpms.amarahotels.repository.property.IAddresRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService  implements IAddressService{

    @Autowired
    private IAddresRepo addresRepo;
    @Override
    public Address save(Address address) {
        return addresRepo.save(address);
    }
}
