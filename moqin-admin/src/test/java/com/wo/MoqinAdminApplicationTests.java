package com.wo;

import com.wo.domain.User;
import com.wo.service.UserService;
import com.wo.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;


@SpringBootTest
@Slf4j
class MoqinAdminApplicationTests {
    @Resource
    private UserService userService;

    @Test
    void contextLoads() {
        R<User> userR = userService.selectByPrimaryKey(1L);
        log.info(userR.toString());
    }

}
