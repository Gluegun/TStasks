package com.tsystems.javaschool.tasks.pyramid;

public class CannotBuildPyramidException extends RuntimeException {
    @Override
    public String getMessage() {
        return "Impossible to create pyramid";
    }
}
