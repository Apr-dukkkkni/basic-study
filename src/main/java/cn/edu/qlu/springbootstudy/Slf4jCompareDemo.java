package cn.edu.qlu.springbootstudy;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jCompareDemo {

    @Slf4j
    static class AnnotatedInner{
        public void testLog() {
            log.info("注解内部类打印");
        }
    }

    static class ManualInner{
        private static final Logger log = LoggerFactory.getLogger(ManualInner.class);
        //不写注解：**源代码必须手动写 Logger 声明**，类名修改时，`LoggerFactory.getLogger(xxx.class)` 里面的类名也要同步改，容易手写错。

        public void testLog(){
            log.info("手写Logger内部打印类");
        }
    }

    public static void main(String[] args) {
        new AnnotatedInner().testLog();
        new ManualInner().testLog();
    }
}
