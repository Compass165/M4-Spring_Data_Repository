package com.repocrudblog.service.blog;

import com.repocrudblog.model.Blog;
import com.repocrudblog.model.Category;
import com.repocrudblog.service.IGeneralService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IBlogService extends IGeneralService<Blog> {
    Page<Blog> findAll(Pageable pageable);
    Page<Blog> findAllByContentContaining(String content, Pageable pageable);
    Page<Blog> findAllByCategory(Category category, Pageable pageable);
    Page<Blog> findAllByAuthorContainingAndCategory(String author, Category category, Pageable pageable);
}
