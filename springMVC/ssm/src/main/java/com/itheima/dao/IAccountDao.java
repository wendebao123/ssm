package com.itheima.dao;

import com.itheima.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface IAccountDao {

    @Select("select * from account")
    List<Account> findAll();

    @Insert({"insert into account (name,money) values (#{name},#{money})"})
    void saveAccount(Account account);
}
