package com.example.follow.service.Impl;

import com.example.follow.document.Follow;
import com.example.follow.repository.FollowRepository;
import com.example.follow.service.FollowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FollowServiceImpl implements FollowService {

    @Autowired
    FollowRepository followRepository;
    @Override
    public Follow save(Follow follow) {
        return followRepository.save(follow);
    }

    @Override
    public void followRequest(String fId,String tId) {
         Follow followFrom = followRepository.findById(fId);
         Follow followTo = followRepository.findById(tId);
         followFrom.getRequested().add(tId);
         followTo.getPending().add(fId);
         followRepository.save(followFrom);
         followRepository.save(followTo);

    }

    @Override
    public void acceptRequest(String fId, String tId) {
        Follow followFrom = followRepository.findById(fId);
        Follow followTo = followRepository.findById(tId);
        followFrom.getFriends().add(tId);
        followTo.getFriends().add(fId);
        followFrom.getPending().remove(tId);
        followTo.getRequested().remove(fId);
        followRepository.save(followFrom);
        followRepository.save(followTo);
    }

    @Override
    public void declineRequest(String fId, String tId) {
        Follow followFrom = followRepository.findById(fId);
        Follow followTo = followRepository.findById(tId);
        followFrom.getPending().remove(tId);
        followTo.getRequested().remove(fId);
        followRepository.save(followFrom);
        followRepository.save(followTo);
    }

    @Override
    public void unFollowRequest(String fId, String tId) {
        Follow followFrom = followRepository.findById(fId);
        Follow followTo = followRepository.findById(tId);
        followFrom.getFriends().remove(tId);
        followTo.getFriends().remove(fId);
        followRepository.save(followFrom);
        followRepository.save(followTo);
    }


}
