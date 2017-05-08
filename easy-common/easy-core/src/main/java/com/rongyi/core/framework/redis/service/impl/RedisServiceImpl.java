package com.rongyi.core.framework.redis.service.impl;

import java.io.UnsupportedEncodingException;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;

import com.rongyi.core.framework.redis.service.RedisService;

public class RedisServiceImpl<T, E> implements RedisService{
	
	private static String redisCode = "utf-8";

	@Autowired
	protected RedisTemplate<T, E> redisTemplate;

	public RedisTemplate<T, E> getRedisTemplate() {
		return redisTemplate;
	}

	public void setRedisTemplate(RedisTemplate<T, E> redisTemplate) {
		this.redisTemplate = redisTemplate;
	}

	@Override
	public long del(final String... keys) {
		return redisTemplate.execute(new RedisCallback<Long>() {
            public Long doInRedis(RedisConnection connection) throws DataAccessException {
                long result = 0;
                for (int i = 0; i < keys.length; i++) {
                    result = connection.del(keys[i].getBytes());
                }
                return result;
            }
        });
	}

	@Override
	public void set(final byte[] key, final byte[] value, final long liveTime) {
		redisTemplate.execute(new RedisCallback<Long>() {
			@Override
            public Long doInRedis(RedisConnection connection) throws DataAccessException {
                connection.set(key, value);
                if (liveTime > 0) {
                    connection.expire(key, liveTime);
                }
                return 1L;
            }
        });
		
	}

	@Override
	public void set(final String key, final String value, final long liveTime) {
		this.set(key.getBytes(), value.getBytes(), liveTime);
	}

	@Override
	public void set(String key, String value) {
		this.set(key, value, 0L);
		
	}

	@Override
	public void set(byte[] key, byte[] value) {
		this.set(key, value, 0L);
		
	}

	@Override
	public String get(final String key) {
		return redisTemplate.execute(new RedisCallback<String>() {
			@Override
			public String doInRedis(RedisConnection connection) throws DataAccessException {
				try {
					return new String(connection.get(key.getBytes()),redisCode);
				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
				}
				return "";
			}
		});
	}

	@Override
	public boolean exists(final String key) {
		return redisTemplate.execute(new RedisCallback<Boolean>() {
			@Override
			public Boolean doInRedis(RedisConnection connection) throws DataAccessException {
				return connection.exists(key.getBytes());
			}
		});
	}

	@Override
	public String flushDB() {
		return redisTemplate.execute(new RedisCallback<String>() {
			@Override
			public String doInRedis(RedisConnection connection) throws DataAccessException {
				connection.flushDb();
				return "ok";
			}
		});
	}

	@Override
	public long dbSize() {
		return redisTemplate.execute(new RedisCallback<Long>() {
			@Override
			public Long doInRedis(RedisConnection connection) throws DataAccessException {
				return connection.dbSize();
			}
		});
	}

	@Override
	public String ping() {
		return redisTemplate.execute(new RedisCallback<String>() {
			@Override
			public String doInRedis(RedisConnection connection) throws DataAccessException {
				return connection.ping();
			}
		});
	}

	@Override
	public Set<byte[]> keys(final String keyPattern)
	{
		Set<byte[]> res;
		try {
			res = redisTemplate.execute(new RedisCallback<Set<byte[]>>() {
				@Override
				public Set<byte[]> doInRedis(RedisConnection redisConnection) throws DataAccessException {
					byte[] keyPatternByte;
					try {
						keyPatternByte = keyPattern.getBytes(redisCode);
					} catch (UnsupportedEncodingException e) {
						return null;
					}
					Set keySet = redisConnection.keys(keyPatternByte);
					return keySet;
				}
			});
		} catch (Exception e)
		{
			res = null;
		}
		return res;
	}
}
