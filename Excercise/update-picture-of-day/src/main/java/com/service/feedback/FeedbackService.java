package com.service.feedback;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.model.Feedback;

import java.util.List;

public interface FeedbackService {
    Feedback findById(Long id);

    void save(Feedback feedback);

    Page<Feedback> findAll(Pageable pageable);
}
