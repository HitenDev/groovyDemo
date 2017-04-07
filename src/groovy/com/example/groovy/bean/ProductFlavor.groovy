package com.example.groovy.bean

/**
 * Created by admin on 2017/4/5.
 */
class ProductFlavor {
    private int mVersionCode
    private String mVersionName
    private int mMinSdkVersion
    private int mTargetSdkVersion

    def versionCode(int versionCode) {
        mVersionCode = versionCode
    }

    def versionName(String versionName) {
        mVersionName = versionName
    }

    def minSdkVersion(int minSdkVersion) {
        mMinSdkVersion = minSdkVersion
    }


    def targetSdkVersion(int targetSdkVersion) {
        mTargetSdkVersion = targetSdkVersion
    }


    @Override
    String toString() {
        return "ProductFlavor{" +
                "mVersionCode=" + mVersionCode +
                ", mVersionName='" + mVersionName + '\'' +
                ", mMinSdkVersion=" + mMinSdkVersion +
                ", mTargetSdkVersion=" + mTargetSdkVersion +
                '}'
    }
}
