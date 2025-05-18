package controllers;

import models.EndPoint;
import models.User;
import models.UserConfig;

import java.util.HashMap;

public class ApiRateLimitHandler {

    private HashMap<String, Integer> counterTable;
    private EndPoint endPoint;
    private User user;
    private int requests;

    private ApiRateLimitManager apiRateLimitManager;

    ApiRateLimitHandler(EndPoint endPoint, User user, int requests){
        this.endPoint = endPoint;
        this.counterTable = new HashMap<>();
        this.user = user;
        this.requests = requests;
        this.apiRateLimitManager = new ApiRateLimitManager();
    }

    public void handleApiRateLimit() throws Exception {
        apiRateLimitManager.updateTheRateLimit(endPoint, user, requests);
        if(apiRateLimitManager.checkForRateLimit(endPoint, user)) {
            throw new Exception("429: Too Many Requests");
        }
    }
}
