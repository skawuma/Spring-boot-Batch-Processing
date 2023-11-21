package com.skawuma.config;

import org.springframework.batch.core.step.skip.SkipLimitExceededException;
import org.springframework.batch.core.step.skip.SkipPolicy;

import java.io.FileNotFoundException;

public class CustomSkipPolicy implements SkipPolicy {
    @Override
    public boolean shouldSkip(Throwable throwable, int i) throws SkipLimitExceededException {
        if (throwable instanceof FileNotFoundException) {
            return false;
        }
        if (throwable instanceof NumberFormatException) {
            return true;
        }
        return false;
    }
}
