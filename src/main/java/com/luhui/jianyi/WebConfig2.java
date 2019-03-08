package com.luhui.jianyi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import com.luhui.jianyi.Interceptor.ApiInterceptor;
import com.luhui.jianyi.entity.Aliyun;

@SpringBootConfiguration 
public class WebConfig2 extends WebMvcConfigurationSupport{
	
	@Value("${appKey}")
    private String appKey;
    @Value("${appSecret}")
    private String appSecret;
    @Value("${bucket}")
    private String bucket;
    @Value("${endPoint}")
    private String endPoint;
 
    @Bean
    public Aliyun aliyun(){
        return Aliyun.options()
                .setAppKey(appKey)
                .setAppSecret(appSecret)
                .setBucket(bucket)
                .setEndPoint(endPoint)
                .build();
    }
    
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
    	// TODO Auto-generated method stub
    	super.addInterceptors(registry);
    	registry.addInterceptor(new ApiInterceptor());
    }
}
