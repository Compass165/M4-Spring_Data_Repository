package com.repocrudblog.repository;

import com.repocrudblog.model.Blog;
import com.repocrudblog.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBlogRepository extends PagingAndSortingRepository<Blog, Long> {
    Page<Blog> findAllByCategory(Category category, Pageable pageable);
    Page<Blog> findAllByContentContaining(String content, Pageable pageable);
    Page<Blog> findAllByAuthorContainingAndCategory(String author, Category category, Pageable pageable);
}
