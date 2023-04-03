package com.newland.demo.mapper;

import com.newland.common.mybatis.annotation.DataColumn;
import com.newland.common.mybatis.annotation.DataPermission;
import com.newland.common.mybatis.core.mapper.BaseMapperPlus;
import com.newland.demo.domain.TestTree;
import com.newland.demo.domain.vo.TestTreeVo;

/**
 * 测试树表Mapper接口
 *
 * @author newland
 * @date 2021-07-26
 */
@DataPermission({
    @DataColumn(key = "deptName", value = "dept_id"),
    @DataColumn(key = "userName", value = "user_id")
})
public interface TestTreeMapper extends BaseMapperPlus<TestTreeMapper, TestTree, TestTreeVo> {

}
