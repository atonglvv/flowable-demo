package cn.atong.leek.flowable.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service
public class ActDeModelServiceImpl implements ActDeModelService {

    @Autowired
    @Qualifier("flowableModeler")
    SqlSessionTemplate template;

    @Override
    public Object selectOne() {
        return template.selectOne("org.flowable.ui.modeler.domain.Model.selectModel", "1");
    }
}
