package org.wg.proxy.cglib;


import org.wg.proxy.ForumService;

public class ForumServiceTest {

    public static void main(String[] args) {
		CglibProxy proxy = new CglibProxy();
		ForumService forumService = (ForumService) proxy.getProxy(ForumServiceImpl.class);
		forumService.removeForum(10);
		forumService.removeTopic(100);
    }
}
