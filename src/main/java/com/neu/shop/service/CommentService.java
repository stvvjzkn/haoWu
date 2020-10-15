package com.neu.shop.service;

import com.neu.shop.pojo.Comment;
import com.neu.shop.pojo.CommentExample;

import java.util.List;

/**
 * Created by hmy on 2020/10/15.
 */
public interface CommentService {
    public void insertSelective(Comment comment);

    public List<Comment> selectByExample(CommentExample commentExample);
}
