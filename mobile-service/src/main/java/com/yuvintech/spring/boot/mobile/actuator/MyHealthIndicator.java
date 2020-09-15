package com.yuvintech.spring.boot.mobile.actuator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.Health.Builder;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class MyHealthIndicator implements HealthIndicator {

	@Override
	public Health health() {
		return  Health.up().withDetail("status", "MobileService is Up and Running...!").build();
	}

}
