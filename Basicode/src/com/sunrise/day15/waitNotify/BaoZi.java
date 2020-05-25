package com.sunrise.day15.waitNotify;

/**
 * 包子对象，有皮、馅，包子有无的状态；
 */

public class BaoZi {
     private String pi;
     private String xian;
     private Boolean flag = false;

     public String getPi() {
          return pi;
     }

     public void setPi(String pi) {
          this.pi = pi;
     }

     public String getXian() {
          return xian;
     }

     public void setXian(String xian) {
          this.xian = xian;
     }

     public Boolean getFlag() {
          return flag;
     }

     public void setFlag(Boolean flag) {
          this.flag = flag;
     }
}
