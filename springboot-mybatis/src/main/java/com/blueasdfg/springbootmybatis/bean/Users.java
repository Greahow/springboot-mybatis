package com.blueasdfg.springbootmybatis.bean;

public class Users {

     private Integer id;
     private String username;
     private String likeeat;

     public Integer getId() {
          return id;
     }

     public void setId(Integer id) {
          this.id = id;
     }

     public String getUsername() {
          return username;
     }

     public void setUsername(String username) {
          this.username = username;
     }

     public String getLikeeat() {
          return likeeat;
     }

     public void setLikeeat(String likeeat) {
          this.likeeat = likeeat;
     }

     @Override
     public String toString() {
          return "Users{" +
                  "id=" + id +
                  ", username='" + username + '\'' +
                  ", likeeat='" + likeeat + '\'' +
                  '}';
     }
}
