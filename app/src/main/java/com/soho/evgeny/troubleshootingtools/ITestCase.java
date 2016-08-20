package com.soho.evgeny.troubleshootingtools;

/**
 * Created by evgeny on 21.08.16.
 */
public interface ITestCase {
    /**
     * Start function. Every test case can be run
     */
    public void start();

    /**
     * Report function. Used for export generic data to Report object
     */
    public void report();
}
