package com.nitin.paperwala.paperwala.repository;

import com.nitin.paperwala.paperwala.domains.Author;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AuthorRepository extends MongoRepository<Author, String> {
}
