package com.stylefeng.guns.rest;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Guns REST Web程序启动类
 *
 * @author fengshuonan
 * @date 2017年9月29日09:00:42
 */
public class GunsFilmServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
<<<<<<< HEAD
<<<<<<< HEAD:guns-film/src/main/java/com/stylefeng/guns/rest/GunsFilmServletInitializer.java
        return builder.sources(GunsFilmApplication.class);
=======
        return builder.sources(GunsCinemaApplication.class);
>>>>>>> 35898e4528e131008ff88cbe13daa8a1ca8b3a97:guns-cinema/src/main/java/com/stylefeng/guns/rest/GunsRestServletInitializer.java
=======
        return builder.sources(GunsFilmApplication.class);
>>>>>>> 35898e4528e131008ff88cbe13daa8a1ca8b3a97
    }

}
