package com.softtek.mdm.dao;

import java.util.List;

import com.softtek.mdm.model.AppList;

public interface AppListDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_list
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_list
     *
     * @mbggenerated
     */
    int insert(AppList record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_list
     *
     * @mbggenerated
     */
    int insertSelective(AppList record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_list
     *
     * @mbggenerated
     */
    AppList selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_list
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AppList record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_list
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(AppList record);
    
    /**
     * 根据ids查询所属的记录的信息集合
     * @param ids
     * @return
     */
    List<AppList> selectByIds(List<Integer> ids);
    
    /**
     * 根据黑白名单的编号，查询当前名单下的应用信息
     * @return
     */
    List<AppList> selectAppsByCatalogList(int listId);
    
    List<AppList> selectAppsByCatalogListName(String name);
    
}