package cn.atong.leek.flowable;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootTest
public class ApplicationTest {

    @Autowired
    public ApplicationContext applicationContext;
    @Autowired
    @Qualifier("modelerSqlSessionTemplate")
    SqlSessionTemplate template;
    @Autowired
    @Qualifier("flowableModeler")
    SqlSessionTemplate template2;
    @Autowired
    @Qualifier("sqlSessionTemplate")
    SqlSessionTemplate template3;

    @Test
    public void getBeanDefinitionNames() {
        // 打印 BeanDefinitionNames
        List<String> definitionNames = Arrays.stream(applicationContext.getBeanDefinitionNames())
                .collect(Collectors.toList());
        definitionNames.forEach(System.out::println);
    }

    @Test
    public void getBeanByName() {
        Object flowableModeler = applicationContext.getBean("modelerSqlSessionTemplate");
        if (flowableModeler instanceof SqlSessionTemplate) {
            System.out.println("true");
        }
    }

    @Test
    public void getBeanByType() {
        SqlSessionTemplate beana = applicationContext.getBean(SqlSessionTemplate.class);
    }

    @Test
    public void testSqlSessionTemplate() {
        Object o = template.selectOne("org.flowable.ui.modeler.domain.Model.selectModel", "1");
        System.out.println(o.toString());
    }

    @Test
    public void testSqlSessionTemplate2() {
        Object o = template2.selectOne("org.flowable.ui.modeler.domain.Model.selectModel", "1");
        System.out.println(o.toString());
    }

    @Test
    public void testSqlSessionTemplate3() {
        Object o = template3.selectOne("org.flowable.ui.modeler.domain.Model.selectModel", "1");
        System.out.println(o.toString());
    }

}
