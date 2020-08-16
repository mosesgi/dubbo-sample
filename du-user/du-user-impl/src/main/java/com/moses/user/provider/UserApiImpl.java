package com.moses.user.provider;

import com.moses.user.api.UserApi;
import com.moses.user.entity.User;
import com.moses.user.vo.UserVo;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.BeanUtils;

@DubboService(interfaceClass = UserApi.class)
public class UserApiImpl implements UserApi {
    @Override
    public UserVo findUserById(int userId) {
        User user = new User();
        user.setUserId(userId);
        user.setUserName("Sample_User");
        UserVo vo = new UserVo();
        BeanUtils.copyProperties(user, vo);
        return vo;
    }
}
