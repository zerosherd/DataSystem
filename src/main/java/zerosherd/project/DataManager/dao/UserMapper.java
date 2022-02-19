package zerosherd.project.DataManager.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import zerosherd.project.DataManager.entity.User;

import java.util.List;

/**
 * @Description: This is a User Mapper
 * @ClassName: UserMapper
 * @Author: ZeroSherd
 * @Date: 2021/12/30 13:52
 */
@Mapper
@Repository
public interface UserMapper {

    List<User> getAllUser();

    Integer addUser(User user);

    Integer updateUserById(User user);

    Integer deleteUserById(Integer id);

}


