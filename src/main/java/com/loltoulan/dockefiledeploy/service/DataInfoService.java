package com.loltoulan.dockefiledeploy.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.loltoulan.dockefiledeploy.entty.DataInfoEntity;

import java.util.List;

public interface DataInfoService extends IService<DataInfoEntity> {
    public List<DataInfoEntity> queryAll();
}
