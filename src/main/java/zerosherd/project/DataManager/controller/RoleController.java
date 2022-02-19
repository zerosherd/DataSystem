package zerosherd.project.DataManager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zerosherd.project.DataManager.dao.RoleMapper;
import zerosherd.project.DataManager.entity.Role;

import java.util.List;


/**
 * @Description: This is a Role Controller
 * @ClassName: RoleController
 * @Author: ZeroSherd
 * @Date: 2022/02/20 02:40
 */

@RestController
public class RoleController {

    @Autowired
    private RoleMapper roleMapper;

    @RequestMapping("/getAllRole")
    public List<Role> getAllRole() {
        List<Role> RoleList = roleMapper.getAllRole();
        return RoleList;
    }

}
