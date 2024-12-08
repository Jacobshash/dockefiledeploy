package com.loltoulan.dockefiledeploy.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.loltoulan.dockefiledeploy.entty.DataInfoEntity;
import com.loltoulan.dockefiledeploy.mapper.DataInfoMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataInfoServiceImpl extends ServiceImpl<DataInfoMapper, DataInfoEntity> implements DataInfoService {

    @Override
    public List<DataInfoEntity> queryAll() {
        return this.list();
    }

}
