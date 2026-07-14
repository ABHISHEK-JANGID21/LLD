package com.aj.lld.ratelimiter;
import java.util.Map;

/**
 * Interface for all rate limiting strategies.
 * New strategies (e.g., fixed window, sliding window, leaky bucket, etc.)
 * can easily be added by implementing this interface.
 */
public interface IRateLimiter {

    //rateLimitKey any user or any specific api
    boolean giveAccess(String rateLimitKey);

    void updateConfiguration(Map<String, Object> config);
   
    void shutdown();
}

