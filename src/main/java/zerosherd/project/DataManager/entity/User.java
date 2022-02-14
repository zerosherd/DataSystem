package zerosherd.project.DataManager.entity;

import lombok.*;

/**
 * @Description: This is a User Model
 * @ClassName: User
 * @Author: ZeroSherd
 * @Date: 2021/12/28 18:18
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String username;
    private String password;

}
