package controllers;

import models.EndPoint;
import models.User;
import models.UserConfig;

import java.sql.Time;

public class ApiRateLimitManager {



    public void updateTheRateLimit(EndPoint endPoint, User user, int requests) throws Exception {
        // INCR
        counterTable.put(System.currentTimeMillis() + user.getEmailId(), counterTable.getOrDefault(System.currentTimeMillis() + user.getEmailId()) + 1);

        if(requests > user.getMAX_THRESHOLD()){
            throw new Exception("429");
        }

    }

    public void checkForRateLimit(){
        counterTable.get("hashKey")

    }

}
