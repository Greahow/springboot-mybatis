package com.blueasdfg.springbootmybatis.mapper;


import com.blueasdfg.springbootmybatis.bean.Member;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

//指定这是一个操作数据库的mapper,@Mapper或者@MapperScan将接口扫描到装配的容器中

@Mapper
public interface MemberMapper {

     @Select("select * from member where id=#{id}")
     public Member getMemById(Integer id);


}
