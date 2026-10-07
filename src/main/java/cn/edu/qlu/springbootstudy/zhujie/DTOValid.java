package cn.edu.qlu.springbootstudy.zhujie;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class DTOValid {

    @NotBlank(message = "用户名不能为空")
    private String name;

    @NotNull(message = "年龄不能为空")
    @Max(value = 150, message = "年龄不能大于150")
    @Min(value = 18, message = "年龄不能大于18")
    private Integer age;
}
