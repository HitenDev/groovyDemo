package com.example.groovy.bean

/**
 * Created by admin on 2017/4/5.
 */
class ProductFlavor {
    private int mVersionCode
    private String mVersionName

    def versionCode(int versionCode) {
        mVersionCode = versionCode
    }

    def versionName(String versionName) {
        mVersionName = versionName
    }

    private void doSmt(String str) {
        println "ProductFlavor object ${str}"
    }


    @Override
    String toString() {
        return "ProductFlavor{" +
                "mVersionCode=" + mVersionCode +
                ", mVersionName='" + mVersionName + '\'' +
                '}'
    }
}
