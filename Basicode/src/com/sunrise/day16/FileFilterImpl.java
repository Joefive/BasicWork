package com.sunrise.day16;

import java.io.File;
import java.io.FileFilter;

/**
 * 实现过滤器接口
 */

public class FileFilterImpl implements FileFilter {

    //重写accept方法，设置过滤规则
    @Override
    public boolean accept(File pathname) {
        if (pathname.isDirectory()) {
            return true;
        }
        return pathname.getName().toLowerCase().endsWith(".docx");
    }
}
