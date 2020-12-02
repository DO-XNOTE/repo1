package cn.itcast.api;

import cn.itcast.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.support.GenericConversionService;
import org.springframework.web.bind.support.ConfigurableWebBindingInitializer;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

import javax.annotation.PostConstruct;

//@Configuration
public class SpringbootConvert {
    @Autowired
    private RequestMappingHandlerAdapter requestMappingHandlerAdapter;

    @PostConstruct
    public void addConvertConfig(){
        ConfigurableWebBindingInitializer initializer = (ConfigurableWebBindingInitializer) requestMappingHandlerAdapter.getWebBindingInitializer();
        if (initializer.getConversionService() != null){
            GenericConversionService conversionService = (GenericConversionService) initializer.getConversionService();
            // 添加字符串转换成list集合的转换器
            conversionService.addConverter((Converter<?, ?>) new User());
            //添加字符串转换为日期类型的字符串
//          conversionService.addConverter();
        }
    }
}
