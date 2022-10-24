package com.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.model.Feedback;

import java.util.List;

public interface FeedBackRepository extends PagingAndSortingRepository<Feedback, Long> {
}
