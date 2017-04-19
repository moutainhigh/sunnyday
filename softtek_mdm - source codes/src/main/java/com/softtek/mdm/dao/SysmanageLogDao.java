package com.softtek.mdm.dao;

import java.util.List;
import java.util.Map;

import com.softtek.mdm.model.SysmanageLog;

public interface SysmanageLogDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysmanage_log
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysmanage_log
     *
     * @mbggenerated
     */
    int insert(SysmanageLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysmanage_log
     *
     * @mbggenerated
     */
    int insertSelective(SysmanageLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysmanage_log
     *
     * @mbggenerated
     */
    SysmanageLog selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysmanage_log
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SysmanageLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysmanage_log
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SysmanageLog record);
    
    /**
     * 查询所有的操作日志
     * @param orgId
     * @return
     */
    public List<SysmanageLog> queryAllLog(Map<String,Object> map);
    
    public int queryAllLogCount(Integer orgId);
    
    public List<SysmanageLog> queryDetailLogByUserId(Map<String,Object> map);
    
    public int queryDetailLogByUserIdCount(Integer userId);

    /**
     * 根据条件查询操作日志数量
     *
     * @author brave.chen
     * @param map 参数map
     * @return 数量
     */
	int queryOptLogCountByParams(Map<String, Object> map);

	/**
	 * 根据条件查询操作日志列表
	 *
	 * @author brave.chen
	 * @param map 操作日志列表
	 * @return 操作日志列表
	 */
	List<SysmanageLog> queryOptLogByParams(Map<String, Object> map);
}