package com.blueasdfg.springbootmybatis.controller;

import com.blueasdfg.springbootmybatis.bean.Member;
import com.blueasdfg.springbootmybatis.bean.Users;
import com.blueasdfg.springbootmybatis.mapper.MemberMapper;
import com.blueasdfg.springbootmybatis.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemController {

     @Autowired
     MemberMapper memberMapper;

     @Autowired
     UsersMapper usersMapper;

     @GetMapping("/member/{id}")
     public Member getMember(@PathVariable("id") Integer id) {
          return memberMapper.getMemById(id);
     }


     @GetMapping("/user/{id}")
     public Users getUsers(@PathVariable("id") Integer id){
          return usersMapper.getUsers(id);
     }

}

















