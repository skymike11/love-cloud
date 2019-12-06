package team.seckilluser.service.impl;

import team.seckilluser.entity.User;
import team.seckilluser.mapper.UserMapper;
import team.seckilluser.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author van
 * @since 2019-12-06
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
