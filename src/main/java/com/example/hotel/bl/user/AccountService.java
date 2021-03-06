package com.example.hotel.bl.user;

import com.example.hotel.po.User;
import com.example.hotel.vo.*;

/**
 * @author huwen
 * @date 2019/3/23
 */
public interface AccountService {

    /**
     * 注册账号
     *
     * @return
     */
    ResponseVO registerAccount(UserVO userVO);

    /**
     * 用户登录，登录成功会将用户信息保存再session中
     *
     * @return
     */
    User login(UserForm userForm);

    /**
     * 获取用户个人信息
     * @param id
     * @return
     */
    User getUserInfo(int id);

    /**
     * 更新用户个人信息
     * @param id
     * @param password
     * @param username
     * @param phonenumber
     * @return
     */
    ResponseVO updateUserInfo(int id, String password,String username,String phonenumber);

    /**
     * 给指定对邮箱账号充值信用值
     * @param credit
     * @param email
     * @return
     */
    ResponseVO chargeCredit(double credit, String email);

    ResponseVO recoverCredit(double credit, Integer id);

    /**
     * 更新用户头像
     * @param userVO
     * @return
     */
    ResponseVO updateAccountPortrait(UserVO userVO);

    /**
     * 更新用户信用值
     * @param id
     * @param addCredit
     * @return
     */
    ResponseVO updateUserCredit(int id, double addCredit);

}
