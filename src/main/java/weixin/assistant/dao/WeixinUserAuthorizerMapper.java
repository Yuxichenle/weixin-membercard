package weixin.assistant.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import weixin.assistant.model.WeixinUserAuthorizer;
import weixin.assistant.model.WeixinUserAuthorizerExample;

public interface WeixinUserAuthorizerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weixin_user_authorizer
     *
     * @mbggenerated
     */
    int countByExample(WeixinUserAuthorizerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weixin_user_authorizer
     *
     * @mbggenerated
     */
    int deleteByExample(WeixinUserAuthorizerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weixin_user_authorizer
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weixin_user_authorizer
     *
     * @mbggenerated
     */
    int insert(WeixinUserAuthorizer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weixin_user_authorizer
     *
     * @mbggenerated
     */
    int insertSelective(WeixinUserAuthorizer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weixin_user_authorizer
     *
     * @mbggenerated
     */
    List<WeixinUserAuthorizer> selectByExample(WeixinUserAuthorizerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weixin_user_authorizer
     *
     * @mbggenerated
     */
    WeixinUserAuthorizer selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weixin_user_authorizer
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") WeixinUserAuthorizer record, @Param("example") WeixinUserAuthorizerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weixin_user_authorizer
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") WeixinUserAuthorizer record, @Param("example") WeixinUserAuthorizerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weixin_user_authorizer
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(WeixinUserAuthorizer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weixin_user_authorizer
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(WeixinUserAuthorizer record);
}