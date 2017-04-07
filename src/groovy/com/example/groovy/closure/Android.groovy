package com.example.groovy.closure;

import com.example.groovy.bean.ProductFlavor;
import groovy.lang.Closure;

/**
 * Created by admin on 2017/4/5.
 */
class Android {
    private int mCompileSdkVersion
    private String mBuildToolsVersion
    private ProductFlavor mProductFlavor

    Android() {
        this.mProductFlavor = new ProductFlavor()
    }

    void compileSdkVersion(int compileSdkVersion) {
        this.mCompileSdkVersion = compileSdkVersion
    }

    void buildToolsVersion(String buildToolsVersion) {
        this.mBuildToolsVersion = buildToolsVersion
    }

    void defaultConfig(Closure closure) {
        closure.setDelegate(mProductFlavor)
        closure.setResolveStrategy(Closure.DELEGATE_FIRST)
        closure.call()
    }

    @Override
     String toString() {
        return "Android{" +
                "mCompileSdkVersion=" + mCompileSdkVersion +
                ", mBuildToolsVersion='" + mBuildToolsVersion + '\'' +
                ", mProductFlavor=" + mProductFlavor +
                '}'
    }
}
