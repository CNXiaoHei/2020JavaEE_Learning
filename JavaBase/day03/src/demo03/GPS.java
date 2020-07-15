package demo03;

import javax.sound.midi.Soundbank;

/**
 * @Author: zhangyongliang
 * @Date: 2020/7/10 17:40
 **/
public interface GPS {
    default void GPS() {
        System.out.println("开启全球定位系统");
    }

}
