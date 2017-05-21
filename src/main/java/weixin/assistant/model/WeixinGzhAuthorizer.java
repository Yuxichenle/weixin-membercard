package weixin.assistant.model;

import java.util.Date;

public class WeixinGzhAuthorizer {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column weixin_gzh_authorizer.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column weixin_gzh_authorizer.weixin_gzh_id
     *
     * @mbggenerated
     */
    private Integer weixinGzhId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column weixin_gzh_authorizer.app_id
     *
     * @mbggenerated
     */
    private String appId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column weixin_gzh_authorizer.app_secret
     *
     * @mbggenerated
     */
    private String appSecret;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column weixin_gzh_authorizer.authorization_code
     *
     * @mbggenerated
     */
    private String authorizationCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column weixin_gzh_authorizer.code_expire_time
     *
     * @mbggenerated
     */
    private Date codeExpireTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column weixin_gzh_authorizer.authorizer_refresh_token
     *
     * @mbggenerated
     */
    private String authorizerRefreshToken;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column weixin_gzh_authorizer.authorizer_access_token
     *
     * @mbggenerated
     */
    private String authorizerAccessToken;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column weixin_gzh_authorizer.token_expire_time
     *
     * @mbggenerated
     */
    private Date tokenExpireTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column weixin_gzh_authorizer.jsapi_ticket
     *
     * @mbggenerated
     */
    private String jsapiTicket;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column weixin_gzh_authorizer.ticket_expire_time
     *
     * @mbggenerated
     */
    private Date ticketExpireTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column weixin_gzh_authorizer.status
     *
     * @mbggenerated
     */
    private Integer status;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weixin_gzh_authorizer
     *
     * @mbggenerated
     */
    public WeixinGzhAuthorizer(Integer id, Integer weixinGzhId, String appId, String appSecret, String authorizationCode, Date codeExpireTime, String authorizerRefreshToken, String authorizerAccessToken, Date tokenExpireTime, String jsapiTicket, Date ticketExpireTime, Integer status) {
        this.id = id;
        this.weixinGzhId = weixinGzhId;
        this.appId = appId;
        this.appSecret = appSecret;
        this.authorizationCode = authorizationCode;
        this.codeExpireTime = codeExpireTime;
        this.authorizerRefreshToken = authorizerRefreshToken;
        this.authorizerAccessToken = authorizerAccessToken;
        this.tokenExpireTime = tokenExpireTime;
        this.jsapiTicket = jsapiTicket;
        this.ticketExpireTime = ticketExpireTime;
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weixin_gzh_authorizer
     *
     * @mbggenerated
     */
    public WeixinGzhAuthorizer() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column weixin_gzh_authorizer.id
     *
     * @return the value of weixin_gzh_authorizer.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column weixin_gzh_authorizer.id
     *
     * @param id the value for weixin_gzh_authorizer.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column weixin_gzh_authorizer.weixin_gzh_id
     *
     * @return the value of weixin_gzh_authorizer.weixin_gzh_id
     *
     * @mbggenerated
     */
    public Integer getWeixinGzhId() {
        return weixinGzhId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column weixin_gzh_authorizer.weixin_gzh_id
     *
     * @param weixinGzhId the value for weixin_gzh_authorizer.weixin_gzh_id
     *
     * @mbggenerated
     */
    public void setWeixinGzhId(Integer weixinGzhId) {
        this.weixinGzhId = weixinGzhId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column weixin_gzh_authorizer.app_id
     *
     * @return the value of weixin_gzh_authorizer.app_id
     *
     * @mbggenerated
     */
    public String getAppId() {
        return appId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column weixin_gzh_authorizer.app_id
     *
     * @param appId the value for weixin_gzh_authorizer.app_id
     *
     * @mbggenerated
     */
    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column weixin_gzh_authorizer.app_secret
     *
     * @return the value of weixin_gzh_authorizer.app_secret
     *
     * @mbggenerated
     */
    public String getAppSecret() {
        return appSecret;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column weixin_gzh_authorizer.app_secret
     *
     * @param appSecret the value for weixin_gzh_authorizer.app_secret
     *
     * @mbggenerated
     */
    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret == null ? null : appSecret.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column weixin_gzh_authorizer.authorization_code
     *
     * @return the value of weixin_gzh_authorizer.authorization_code
     *
     * @mbggenerated
     */
    public String getAuthorizationCode() {
        return authorizationCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column weixin_gzh_authorizer.authorization_code
     *
     * @param authorizationCode the value for weixin_gzh_authorizer.authorization_code
     *
     * @mbggenerated
     */
    public void setAuthorizationCode(String authorizationCode) {
        this.authorizationCode = authorizationCode == null ? null : authorizationCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column weixin_gzh_authorizer.code_expire_time
     *
     * @return the value of weixin_gzh_authorizer.code_expire_time
     *
     * @mbggenerated
     */
    public Date getCodeExpireTime() {
        return codeExpireTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column weixin_gzh_authorizer.code_expire_time
     *
     * @param codeExpireTime the value for weixin_gzh_authorizer.code_expire_time
     *
     * @mbggenerated
     */
    public void setCodeExpireTime(Date codeExpireTime) {
        this.codeExpireTime = codeExpireTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column weixin_gzh_authorizer.authorizer_refresh_token
     *
     * @return the value of weixin_gzh_authorizer.authorizer_refresh_token
     *
     * @mbggenerated
     */
    public String getAuthorizerRefreshToken() {
        return authorizerRefreshToken;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column weixin_gzh_authorizer.authorizer_refresh_token
     *
     * @param authorizerRefreshToken the value for weixin_gzh_authorizer.authorizer_refresh_token
     *
     * @mbggenerated
     */
    public void setAuthorizerRefreshToken(String authorizerRefreshToken) {
        this.authorizerRefreshToken = authorizerRefreshToken == null ? null : authorizerRefreshToken.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column weixin_gzh_authorizer.authorizer_access_token
     *
     * @return the value of weixin_gzh_authorizer.authorizer_access_token
     *
     * @mbggenerated
     */
    public String getAuthorizerAccessToken() {
        return authorizerAccessToken;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column weixin_gzh_authorizer.authorizer_access_token
     *
     * @param authorizerAccessToken the value for weixin_gzh_authorizer.authorizer_access_token
     *
     * @mbggenerated
     */
    public void setAuthorizerAccessToken(String authorizerAccessToken) {
        this.authorizerAccessToken = authorizerAccessToken == null ? null : authorizerAccessToken.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column weixin_gzh_authorizer.token_expire_time
     *
     * @return the value of weixin_gzh_authorizer.token_expire_time
     *
     * @mbggenerated
     */
    public Date getTokenExpireTime() {
        return tokenExpireTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column weixin_gzh_authorizer.token_expire_time
     *
     * @param tokenExpireTime the value for weixin_gzh_authorizer.token_expire_time
     *
     * @mbggenerated
     */
    public void setTokenExpireTime(Date tokenExpireTime) {
        this.tokenExpireTime = tokenExpireTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column weixin_gzh_authorizer.jsapi_ticket
     *
     * @return the value of weixin_gzh_authorizer.jsapi_ticket
     *
     * @mbggenerated
     */
    public String getJsapiTicket() {
        return jsapiTicket;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column weixin_gzh_authorizer.jsapi_ticket
     *
     * @param jsapiTicket the value for weixin_gzh_authorizer.jsapi_ticket
     *
     * @mbggenerated
     */
    public void setJsapiTicket(String jsapiTicket) {
        this.jsapiTicket = jsapiTicket == null ? null : jsapiTicket.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column weixin_gzh_authorizer.ticket_expire_time
     *
     * @return the value of weixin_gzh_authorizer.ticket_expire_time
     *
     * @mbggenerated
     */
    public Date getTicketExpireTime() {
        return ticketExpireTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column weixin_gzh_authorizer.ticket_expire_time
     *
     * @param ticketExpireTime the value for weixin_gzh_authorizer.ticket_expire_time
     *
     * @mbggenerated
     */
    public void setTicketExpireTime(Date ticketExpireTime) {
        this.ticketExpireTime = ticketExpireTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column weixin_gzh_authorizer.status
     *
     * @return the value of weixin_gzh_authorizer.status
     *
     * @mbggenerated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column weixin_gzh_authorizer.status
     *
     * @param status the value for weixin_gzh_authorizer.status
     *
     * @mbggenerated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}