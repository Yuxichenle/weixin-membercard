package weixin.assistant.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import weixin.assistant.model.KeyValue;
import weixin.assistant.model.KeyValueExample;

public interface KeyValueMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table key_value
     *
     * @mbggenerated
     */
    int countByExample(KeyValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table key_value
     *
     * @mbggenerated
     */
    int deleteByExample(KeyValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table key_value
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table key_value
     *
     * @mbggenerated
     */
    int insert(KeyValue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table key_value
     *
     * @mbggenerated
     */
    int insertSelective(KeyValue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table key_value
     *
     * @mbggenerated
     */
    List<KeyValue> selectByExampleWithBLOBs(KeyValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table key_value
     *
     * @mbggenerated
     */
    List<KeyValue> selectByExample(KeyValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table key_value
     *
     * @mbggenerated
     */
    KeyValue selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table key_value
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") KeyValue record, @Param("example") KeyValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table key_value
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") KeyValue record, @Param("example") KeyValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table key_value
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") KeyValue record, @Param("example") KeyValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table key_value
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(KeyValue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table key_value
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(KeyValue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table key_value
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(KeyValue record);
}