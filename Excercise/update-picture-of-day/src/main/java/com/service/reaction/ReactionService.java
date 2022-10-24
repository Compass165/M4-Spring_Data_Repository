package com.service.reaction;

import com.model.Feedback;

public interface ReactionService {
    void reactions(String like, Feedback feedback);
}