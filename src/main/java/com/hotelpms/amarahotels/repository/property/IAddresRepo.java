package com.hotelpms.amarahotels.repository.property;

import com.hotelpms.amarahotels.model.property.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddresRepo extends JpaRepository<Address,Long> {

}