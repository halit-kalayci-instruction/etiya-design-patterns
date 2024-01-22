package org.example.creational.abstractfactory.factories;

import org.example.creational.abstractfactory.caching.CachingBase;
import org.example.creational.abstractfactory.logging.LoggerBase;

public abstract class CrossCuttingConcernFactory {
    public abstract LoggerBase getLogger();
    public abstract CachingBase getCaching();
}
