package com.techlab.producto.service;
import com.techlab.producto.model.Article;
import java.util.List;
import java.util.Optional;

public interface ArticleService {
    List<Article> listArticles();
    
    Optional<Article> getArticleById(Long id);

    Article saveArticle(Article article);

    Article updateArticle(Long id, Article article);

    void deleteArticle(Long id);
}