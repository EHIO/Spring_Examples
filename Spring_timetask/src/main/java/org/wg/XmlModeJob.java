package org.wg;

import org.springframework.stereotype.Component;

/**
 * xml方式的Job
 */
@Component
public class XmlModeJob {

    public void run() {

        System.err.println("XmlModeJob run ...");
    }
}
