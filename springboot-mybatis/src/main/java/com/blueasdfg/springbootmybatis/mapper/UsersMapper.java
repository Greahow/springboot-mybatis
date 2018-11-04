package com.blueasdfg.springbootmybatis.mapper;

import com.blueasdfg.springbootmybatis.bean.Users;
import org.apache.ibatis.annotations.Mapper;


//指定这是一个操作数据库的mapper,@Mapper或者@MapperScan将接口扫描到装配的容器中
@Mapper
public interface UsersMapper {

     public Users  getUsers(Integer id);

     public void insertUser(Users user);

}
