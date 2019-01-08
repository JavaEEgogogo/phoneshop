package cgj.phone.shop.dao;

import com.zz.entity.XieBaoStyle;

public interface XieBaoStyleMapper {
    int deleteByPrimaryKey(Integer xiebaoStyleId);

    int insert(XieBaoStyle record);

    int insertSelective(XieBaoStyle record);

    XieBaoStyle selectByPrimaryKey(Integer xiebaoStyleId);

    int updateByPrimaryKeySelective(XieBaoStyle record);

    int updateByPrimaryKey(XieBaoStyle record);
}