package cgj.phone.shop.dao;

import com.zz.entity.Changhe;

public interface ChangheMapper {
    int deleteByPrimaryKey(Integer changheId);

    int insert(Changhe record);

    int insertSelective(Changhe record);

    Changhe selectByPrimaryKey(Integer changheId);

    int updateByPrimaryKeySelective(Changhe record);

    int updateByPrimaryKey(Changhe record);
}