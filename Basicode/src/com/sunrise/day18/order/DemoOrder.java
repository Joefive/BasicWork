package com.sunrise.day18.order;

import java.io.*;
import java.util.HashMap;

/**
 * 将出师表按照标号顺序排列
 * 在IDEA中注意文本格式，要求UTF-8
 */

public class DemoOrder {
    public static void main(String[] args) throws IOException {
        HashMap<String, String> hm = new HashMap();
        BufferedReader br = new BufferedReader(new FileReader("D:\\PracticeWork\\BasicWork\\Basicode\\src\\com\\sunrise\\day18\\order\\csb.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\test\\out.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            String[] arr = line.split("\\."); //转义字符表示"."
            hm.put(arr[0], arr[1]);
        }
        for (Object key : hm.keySet()) {
            String value = hm.get(key);
            line = key + "." + value;
            bw.write(line);
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}
