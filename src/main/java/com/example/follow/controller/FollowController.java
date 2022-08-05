package com.example.follow.controller;

import com.example.follow.document.Follow;
import com.example.follow.service.FollowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/engagement")
@CrossOrigin(value = "*")
public class FollowController {

    @Autowired
    FollowService followService;


    @PostMapping("/unfollow/{fId}/{tId}")
    public void unFollowRequest(@PathVariable("fId") String fId,@PathVariable("tId") String tId){
        followService.unFollowRequest(fId,tId);
    }

    @PostMapping("/follow/{fId}/{tId}")
    public void followRequest(@PathVariable("fId") String fId, @PathVariable("tId") String tId){
          followService.followRequest(fId,tId);
    }

    @PostMapping("/accept/{fId}/{tId}")
    public void acceptRequest(@PathVariable("fId") String fId, @PathVariable("tId") String tId){
        followService.acceptRequest(fId,tId);
    }

    @PostMapping("/decline/{fId}/{tId}")
    public void declineRequest(@PathVariable("fId") String fId, @PathVariable("tId") String tId){
        followService.declineRequest(fId,tId);
    }


}
