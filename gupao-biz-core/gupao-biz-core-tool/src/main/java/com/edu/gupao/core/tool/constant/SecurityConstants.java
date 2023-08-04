package com.edu.gupao.core.tool.constant;


import static com.edu.gupao.core.tool.constant.CacheConstants.CACHE_PRE;

/**
 * 安全常量
 */
public interface SecurityConstants {

	/**
	 * 标志
	 */
	String FROM = "from";

	/**
	 * 启动时是否检查Inner注解安全性
	 */
	boolean INNER_CHECK = true;

	/**
	 * 刷新
	 */
	String REFRESH_TOKEN = "refresh_token";


	/**
	 * 角色前缀
	 */
	String ROLE = "ROLE_";

	/**
	 * token 相关前缀
	 */
	String TOKEN_PREFIX = CACHE_PRE + ".token:";

	/**
	 * oauth 相关前缀
	 */
	String OAUTH_PREFIX = CACHE_PRE + ".oauth:";

	/**
	 * 授权码模式code key 前缀
	 */
	String OAUTH_CODE_PREFIX = CACHE_PRE + ".oauth:code:";

	/*============= RedisTokenStore key 值 ================*/

	/**
	 * access:
	 */
	String ACCESS_KEY = "access:";

	/**
	 * auth_to_access:
	 */
	String AUTH_TO_ACCESS_KEY = "auth_to_access:";

	/**
	 * auth:
	 */
	String AUTH_KEY = "auth:";

	/**
	 * refresh_auth:
	 */
	String REFRESH_AUTH_KEY = "refresh_auth:";

	/**
	 * refresh:
	 */
	String REFRESH_KEY = "refresh:";

	/**
	 * refresh_to_access:
	 */
	String REFRESH_TO_ACCESS_KEY = "refresh_to_access:";

	/**
	 * client_id_to_access_z:
	 */
	String CLIENT_ID_TO_ACCESS_KEY = "client_id_to_access_z:";

	/**
	 * uname_to_access_z:
	 */
	String UNAME_TO_ACCESS_KEY = "uname_to_access_z:";

	/*============= RedisTokenStore key 值 ================*/

	/**
	 * 项目的license
	 */
	String LICENSE = "made by gupao";


	/**
	 * {bcrypt} 加密的特征码
	 */
	String BCRYPT = "{bcrypt}";

	/**
	 * AES 加密
	 */
	String AES = "aes";

	/**
	 * app的clientId
	 */
	String APP_CLIENT_ID = "app";
}
