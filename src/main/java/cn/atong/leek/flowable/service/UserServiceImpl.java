package cn.atong.leek.flowable.service;

import cn.atong.leek.flowable.dao.UserMapper;
import cn.atong.leek.flowable.entity.User;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("user")
public class UserServiceImpl implements UserService{

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> listUser() {
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        return userMapper.selectList(wrapper);
    }
}
