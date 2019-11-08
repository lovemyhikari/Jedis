package com.atguigu.jedis.test;

import org.junit.Test;

import redis.clients.jedis.Jedis;

public class TestJedis {

	@Test
	public void test() {
		Jedis jedis = new Jedis("192.168.134.100", 6379,10000);
		String ping = jedis.ping();
		System.out.println(ping);
		jedis.close();
	}

}
