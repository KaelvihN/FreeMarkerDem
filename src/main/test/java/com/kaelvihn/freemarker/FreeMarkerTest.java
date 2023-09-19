package com.kaelvihn.freemarker;


import com.kaelvihn.freemarker.pojos.Person;
import freemarker.cache.FileTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import jakarta.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfig;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author : KaelvihN
 * @date : 2023/9/18 23:51
 */
@SpringBootTest(classes = FreeMarkerTest.class)
@RunWith(SpringRunner.class)
public class FreeMarkerTest {

    @Test
    public void test() throws IOException, TemplateException {
        //设置版本
        Configuration configuration = new Configuration(Configuration.getVersion());
        //模板路径
        configuration.setDirectoryForTemplateLoading(
                new File("src/main/resources/templates"));
        //获取需要静态化的模板
        Template template = configuration.getTemplate("base3.ftl");
        //获取插入数据，写入磁盘
        template.process(getData(), new FileWriter("d://test.html"));
    }


    public Map<String, Object> getData() {
        HashMap<String, Object> map = new HashMap<>();
        Person person1 = new Person("KaelvihN", 23, new Date(), 10000);
        Person person2 = new Person("Tom", 20, new Date(), 1000);
        Person person3 = new Person("Zeus", 21, new Date(), 100);
        HashMap<String, Person> personMap = new HashMap<>();
        personMap.put("person1", person1);
        personMap.put("person2", person2);
        personMap.put("person2", person3);
        map.put("personMap", personMap);
        return map;
    }
}
