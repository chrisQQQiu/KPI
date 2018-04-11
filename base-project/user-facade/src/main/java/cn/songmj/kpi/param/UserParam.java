package cn.songmj.kpi.param;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * <p>
 * 用户
 * </p>
 *
 * @author meijie.song
 * @since 2018-03-23
 */
@Setter
@Getter
public class UserParam extends PageParam implements Serializable {

    private Integer userId;
    private String userName;
    /**
     * 性别
     */
    private String userSex;
    private Integer userAge;
    /**
     * 出生日期
     */
    private String userBirthday;
    /**
     * 个人简介
     */
    private String userIntroduce;
    private String userImg;
    /**
     * 登录名
     */
    private String userNumber;
    private String userPassword;
    /**
     * 学院
     */
    private String userCollege;
    /**
     * 研究方向
     */
    private String userRO;
    /**
     * 职称
     */
    private String userProTitle;
    /**
     * 角色
     */
    private Integer roleId;
    /**
     * 岗位
     */
    private Integer kbrId;
}
