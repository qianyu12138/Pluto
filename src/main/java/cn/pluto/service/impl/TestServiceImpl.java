package cn.pluto.service.impl;

import cn.pluto.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Override
    public String getTest() {
        return "service";
    }
}
