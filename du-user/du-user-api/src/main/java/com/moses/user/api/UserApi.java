package com.moses.user.api;

import com.moses.user.vo.UserVo;

public interface UserApi {

    UserVo findUserById(int userId);
}
