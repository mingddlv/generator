package com.example.mybatis;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName User
 * @Description TODO
 * @Author mac
 * @DATE 2022/5/11 9:54
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("user")
public class User {
    @TableId
    private String jobNumber;
    private Integer userId;
    private String userName;
    private String userPwd;
    private String userRoute;
    private String userDepartment;

}
