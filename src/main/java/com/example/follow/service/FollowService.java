package com.example.follow.service;

import com.example.follow.document.Follow;

public interface FollowService {
    Follow save(Follow follow);
    void followRequest(String fId,String tId);
    void acceptRequest(String fId,String tId);
    void declineRequest(String fId,String tId);
    void unFollowRequest(String fId, String tId);
}
