package com.edu.gupao.core.tool.constant;

/**
 * 缓存的 key 常量
 */
public interface CacheConstants {

	/**
	 * 项目缓存前缀
	 */
	String CACHE_PRE = "gupao-biz-cloud";

	/**
	 * 字典信息缓存
	 */
	String CACHE_DICTS = CACHE_PRE + ".dicts";

	/**
	 * oauth 客户端信息缓存cacheName
	 */
	String CACHE_CLIENTS = CACHE_PRE + ".clients";

	/**
	 * 公共参数缓存
	 */
	String CACHE_PARAMS = CACHE_PRE + ".params";

	/**
	 * 客户端配置缓存
	 */
	String CACHE_CLIENTS_ALL = CACHE_PRE + ".clients.all";

	/**
	 * 路由存放
	 */
	String CACHE_GATEWAY_ROUTE = CACHE_PRE + ".gateway.route";

	/**
	 * 路由内存 reload 事件
	 */
	String ROUTE_JVM_RELOAD_TOPIC = CACHE_PRE + ".jvm.route.reload.topic";

	/**
	 * redis 重新加载 路由信息
	 */
	String ROUTE_REDIS_RELOAD_TOPIC = CACHE_PRE + ".redis.route.reload.topic";

	/**
	 * 用户信息缓存
	 */
	String CACHE_USER_VERIFY_USERINFO = CACHE_PRE + ".userVerify.user.infos";

	/**
	 * 短信验证码有效期缓存
	 */
	String CACHE_USER_VERIFY_SMS = CACHE_PRE + ".userVerify.sms";

	/**
	 * 用户登验证码错误次数缓存
	 */
	String CACHE_USER_VERIFY_SMS_ERROR_NUM = CACHE_PRE + ".userVerify.sms.error.num";

	/**
	 * 缓存的accessToken
	 */
	String CACHE_WECHAT_ACCESSTOKEN= CACHE_PRE + ".wechat.accesstoken::%s";

	/**
	 * 密码输错次数缓存
	 */
	String CACHE_LOGIN_ERROR_COUNT = CACHE_PRE + ".login.error.count";

	/**
	 * 密码输错锁定账户缓存
	 */
	String CACHE_LOGIN_LOCK = CACHE_PRE + ".login.lock";

	/**
	 * 验证码输错次数缓存
	 */
	String CACHE_LOGIN_CAPTCHA_ERROR_COUNT = CACHE_PRE + ".login.captcha.error.count";

	/**
	 * 验证码输错锁定账户缓存
	 */
	String CACHE_MOBILE_LOGIN_LOCK = CACHE_PRE + ".mobile.login.lock";

	/**
	 * 当天验证码发送次数缓存
	 */
	String CACHE_CAPTCHA_SEND_COUNT = CACHE_PRE + ".captcha.send.count.{}";

}
