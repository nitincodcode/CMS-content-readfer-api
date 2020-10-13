package com.nitin.paperwala.paperwala.controller;

import com.nitin.paperwala.paperwala.domains.Article;
import com.nitin.paperwala.paperwala.domains.Inventory;
import com.nitin.paperwala.paperwala.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pages")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @PostMapping
    public Boolean insertArticle(@RequestBody Article article){
        return articleService.save(article);
    }

    @GetMapping
    public List<Article> getAllArticle(){
        return articleService.findAll();
    }

    @GetMapping("{pageURL}")
    public Article getArticleByPageURL(@PathVariable String pageURL){
        return articleService.getArticle(pageURL);
    }

}
