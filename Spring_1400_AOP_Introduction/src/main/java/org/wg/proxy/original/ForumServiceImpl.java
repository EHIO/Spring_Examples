package org.wg.proxy.original;

import org.wg.proxy.ForumService;
import org.wg.proxy.PerformanceMonitor;

import java.util.concurrent.TimeUnit;

public class ForumServiceImpl implements ForumService {


    @Override
    public void removeTopic(int topicId) {
        PerformanceMonitor.begin("structural.proxy.javaproxy.proxy.ForumServiceImpl.removeTopic");
        System.out.println("模拟删除Topic记录");
        try {
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (Exception e) {
            throw new RuntimeException();
        }
        PerformanceMonitor.end();
    }

    @Override
    public void removeForum(int forumId) {
        PerformanceMonitor.begin("structural.proxy.javaproxy.proxy.ForumServiceImpl.removeForum");
        System.out.println("模拟删除Forum记录");
        try {
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (Exception e) {
            throw new RuntimeException();
        }
        PerformanceMonitor.end();
    }
}
