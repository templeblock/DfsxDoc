package com.dfsx.core.network.datarequest;

/**
 * Created by liuwb on 2016/9/12.
 */
public interface IGetToken {
    String getTokenSync();

    void getTokenAsync(TokenListener listener);
}
