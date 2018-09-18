package de.wps.dockerintro;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import redis.clients.jedis.Jedis;

@RestController
public class StatusController
{

	@RequestMapping(value = "status", method = RequestMethod.GET)
	@ResponseBody
	public String getStatus(HttpServletRequest request)
	{
		return "Running";
	}

	@RequestMapping(value = "counter", method = RequestMethod.GET)
	@ResponseBody
	public Long getCounter(HttpServletRequest request)
	{
		Jedis jedis = new Jedis("redis");
		Long counter = jedis.incr("counter");
		jedis.close();
		return counter;
	}
}