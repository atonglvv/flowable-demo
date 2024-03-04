package cn.atong.leek.flowable;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "cn.atong.leek.flowable.dao", sqlSessionTemplateRef = "sqlSessionTemplate",
        sqlSessionFactoryRef = "sqlSessionFactory")
public class FlowableApplication {
    public static void main(String[] args) {
        SpringApplication.run(FlowableApplication.class, args);
    }
}
