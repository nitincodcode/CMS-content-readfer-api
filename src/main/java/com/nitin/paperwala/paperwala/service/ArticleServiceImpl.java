package com.nitin.paperwala.paperwala.service;

import com.nitin.paperwala.paperwala.domains.Inventory;
import com.nitin.paperwala.paperwala.domains.Article;
import com.nitin.paperwala.paperwala.repository.ArticleRepository;
import com.nitin.paperwala.paperwala.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleRepository repository;


    @Override
    public List<Article> getAllByArticleTitle(String title) {
        return null;
    }

    @Override
    public Article getArticle(String pageURL) {
        return repository.findByPageURL(pageURL);

    }

    @Override
    public Boolean save(Article article) {
        Article newArticle = repository.save(article);
        return newArticle != null;
    }

    @Override
    public List<Article> findAll() {
        return repository.findAll();
    }
}
