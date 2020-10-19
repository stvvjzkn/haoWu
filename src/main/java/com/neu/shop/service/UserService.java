package com.neu.shop.service;

import com.neu.shop.pojo.User;
import com.neu.shop.pojo.UserExample;

import java.util.List;

/**
 * Created by hmy on 2020/10/2.
 */
public interface UserService {
    //通过id查询
    public User selectByPrimaryKey(int userId);
    /*public User selectByPrimaryKeyAndPassword(int userId,String password);*/
    public List<User> selectByExample(UserExample userExample);
//增
    public void insertSelective(User user);
//删
    public void deleteUserById(Integer userid);
//改
    public void updateByPrimaryKeySelective(User user);

}
