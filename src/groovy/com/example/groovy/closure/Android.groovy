package com.example.groovy.closure;

import com.example.groovy.bean.ProductFlavor;
import groovy.lang.Closure;

/**
 * Created by admin on 2017/4/5.
 */
class Android {

    private ProductFlavor productFlavor

    Android() {
        this.productFlavor = new ProductFlavor()
    }

    void defaultConfig(Closure closure) {
        closure.setDelegate(productFlavor)
        closure.setResolveStrategy(Closure.DELEGATE_FIRST)
        closure.call()
    }


    @Override
    String toString() {
        return "Android{" +
                "productFlavor=" + productFlavor +
                '}'
    }
}
