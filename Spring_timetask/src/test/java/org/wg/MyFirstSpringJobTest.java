package org.wg;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import javax.annotation.Resource;

/**
 * Created by run on 2017/6/15.
 */
@ContextConfiguration("classpath:spring.xml")
public class MyFirstSpringJobTest extends AbstractJUnit4SpringContextTests {

    @Resource
    private AnnotationModeJob myFirstSpringJob;

    @Test
    public void testRun() {

        myFirstSpringJob.run();
    }
}
