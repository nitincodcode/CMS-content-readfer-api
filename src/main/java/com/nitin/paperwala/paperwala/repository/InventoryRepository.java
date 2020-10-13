package com.nitin.paperwala.paperwala.repository;

import com.nitin.paperwala.paperwala.domains.Inventory;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InventoryRepository extends MongoRepository<Inventory, String> {
    Inventory findByStatus(String status);
}
