package org.wg.proxy.original;

public class ForumServiceTest {

    public static void main(String[] args) {
		ForumServiceImpl forumService = new ForumServiceImpl();
		forumService.removeForum(10);
		forumService.removeTopic(100);

    }
}
