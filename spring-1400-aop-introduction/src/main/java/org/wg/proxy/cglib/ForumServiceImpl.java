package org.wg.proxy.cglib;

import org.wg.proxy.ForumService;

import java.util.concurrent.TimeUnit;

public class ForumServiceImpl implements ForumService {


    @Override
    public void removeTopic(int topicId) {
        System.out.println("模拟删除Topic记录" + topicId);
        try {
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    @Override
    public void removeForum(int forumId) {
        System.out.println("模拟删除Forum记录" + forumId);
        try {
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
