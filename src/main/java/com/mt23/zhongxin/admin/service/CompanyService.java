package com.mt23.zhongxin.admin.service;

import com.github.wxiaoqi.security.admin.entity.Company;
import com.github.wxiaoqi.security.admin.mapper.CompanyDao;
import com.github.wxiaoqi.security.common.biz.BaseBiz;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class CompanyService extends BaseBiz<CompanyDao,Company> {
}
