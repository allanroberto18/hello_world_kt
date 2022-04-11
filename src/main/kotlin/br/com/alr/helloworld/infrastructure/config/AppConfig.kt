package br.com.alr.helloworld.infrastructure.config

import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.redis.connection.RedisStandaloneConfiguration

import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory


@Configuration
class AppConfig {

    @Value("\${redis.host}")
    val redisHost: String = ""


    @Value("\${redis.port}")
    val redisPort: Int = 0

    private val logger = LoggerFactory.getLogger(javaClass)

    @Bean
    fun redisConnectionFactory(): LettuceConnectionFactory? {
        logger.info("Redis Configuration: $redisHost, $redisPort")
        return LettuceConnectionFactory(RedisStandaloneConfiguration(redisHost, redisPort))
    }
}