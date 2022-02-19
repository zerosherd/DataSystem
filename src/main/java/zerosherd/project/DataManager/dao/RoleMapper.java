package zerosherd.project.DataManager.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import zerosherd.project.DataManager.entity.Role;

import java.util.List;

/**
 * @Description: This is a Role Mapper
 * @ClassName: RoleMapper
 * @Author: ZeroSherd
 * @Date: 2022/02/20 02:02
 */
@Mapper
@Repository
public interface RoleMapper {

    List<Role> getAllRole();

}


