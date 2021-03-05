package generate;

import generate.CategorySort;

public interface CategorySortDao {
    int deleteByPrimaryKey(Long catId);

    int insert(CategorySort record);

    int insertSelective(CategorySort record);

    CategorySort selectByPrimaryKey(Long catId);

    int updateByPrimaryKeySelective(CategorySort record);

    int updateByPrimaryKey(CategorySort record);
}