package com.service.reaction;

import com.repository.ReactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.model.Feedback;
import com.model.Reaction;
import com.repository.FeedBackRepository;


@Service
public class ReactionServiceImpl implements ReactionService {
    @Autowired
    private FeedBackRepository feedBackRepository;

    @Autowired
    private ReactionRepository reactionReposiory;

    @Override
    public void reactions(String like, Feedback feedback) {
        Reaction reaction = new Reaction(like, feedback);
        reaction = reactionReposiory.save(reaction);

        feedback.getReaction().add(reaction);
        feedBackRepository.save(feedback);
    }
}
