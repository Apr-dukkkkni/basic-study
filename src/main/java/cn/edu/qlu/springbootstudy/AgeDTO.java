package cn.edu.qlu.springbootstudy;

import jakarta.validation.constraints.NotNull;

public class AgeDTO {

    @NotNull(message = "age不能为空")
    private Integer age;

    public Integer getAge(){
        return age;
    }

    public void setAge(Integer age){
        this.age = age;
    }
}
