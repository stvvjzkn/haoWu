package com.neu.shop.service;

import com.neu.shop.pojo.Chat;
import com.neu.shop.pojo.ChatExample;

import java.util.List;

/**
 * Created by hmy on 2020/10/6..
 */
public interface ChatService {
    public void insertChatSelective(Chat chat);

    public List<Chat> selectChatByExample(ChatExample chatExample);
}
