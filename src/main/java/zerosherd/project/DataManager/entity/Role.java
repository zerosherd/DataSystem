package zerosherd.project.DataManager.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description: This is a Role Model
 * @ClassName: Role
 * @Author: ZeroSherd
 * @Date: 2022/02/20 02:02
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role {

    private int roleId;
    private String roleName;

}
