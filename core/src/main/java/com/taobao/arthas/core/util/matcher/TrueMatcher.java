package com.taobao.arthas.core.util.matcher;

/**
 * @author ralf0131 2017-01-06 13:48.
 */
public final class TrueMatcher<T> implements Matcher<T> {

    @Override
    public boolean matching(T target) {
        return true;
    }

}