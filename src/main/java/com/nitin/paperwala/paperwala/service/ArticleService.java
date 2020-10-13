package com.nitin.paperwala.paperwala.service;

import com.nitin.paperwala.paperwala.domains.Inventory;
import com.nitin.paperwala.paperwala.domains.Article;

import java.util.List;


public interface ArticleService {
   List<Article> getAllByArticleTitle(String title);
   Article getArticle(String pageURL);
   Boolean save(Article article);

   List<Article> findAll();
}
