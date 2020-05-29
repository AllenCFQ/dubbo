package com.sihai.dubbo.provider.service;

/**
 * xml方式服务提供者实现类
 */

public class ProviderServiceImpl implements ProviderService   {

    public String SayHello(String word) {
        System.out.println(word);
        return word;
    }
}