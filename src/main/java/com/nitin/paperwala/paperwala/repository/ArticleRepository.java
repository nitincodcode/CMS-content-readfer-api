package com.nitin.paperwala.paperwala.repository;

import com.nitin.paperwala.paperwala.domains.Author;
import com.nitin.paperwala.paperwala.domains.Article;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface ArticleRepository extends MongoRepository<Article, String> {
    Article findByPageURL(String url);
    List<Article> findAllByAuthor(Author author);
    List<Article> findAllByTitle(String title);
}
