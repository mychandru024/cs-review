package com.mmnaseri.cs.clrs.ch27.s1.impl;

import com.mmnaseri.cs.clrs.ch27.s1.Scheduler;
import com.mmnaseri.cs.clrs.ch27.s1.SchedulerFactory;

/**
 * @author Mohammad Milad Naseri (m.m.naseri@gmail.com)
 * @since 1.0 (2/27/16)
 */
public class SerialSchedulerFactory implements SchedulerFactory {
    @Override
    public Scheduler getScheduler() {
        return new SerialScheduler();
    }
}
