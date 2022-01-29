package zerosherd.project.DataManager.config;

import org.springframework.web.servlet.config.annotation.*;
import zerosherd.project.DataManager.interceptor.LoginInterceptor;


/**
 * @Description: A Log in Auth Configuration
 * @ClassName: LoginConfig
 * @Author: ZeroSherd
 * @Date: 2022/1/3 17:45
 */
public class LoginConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration registration = registry.addInterceptor(new LoginInterceptor());
        registration.addPathPatterns("/**");
        registration.excludePathPatterns(
                "你的登陆路径",            //登录
                "/**/*.html",            //html静态资源
                "/**/*.js",              //js静态资源
                "/**/*.css",             //css静态资源
                "/**/*.woff",
                "/**/*.ttf"
        );
    }

}
