package mobileguild.branch;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import org.json.JSONObject;

/**
 * Created by rafal on 2/21/16.
 */
@SuppressWarnings("unused")
public class BranchResponse {

    // From Branch.io Panel
    @SerializedName("welcome_message")
    private String welcomeMessage;

    public static BranchResponse fromJson(JSONObject response) {
        return new Gson().fromJson(String.valueOf(response), BranchResponse.class);
    }

    /*
    {
        "$marketing_title":"Mobile Guild Example",
            "$one_time_use":false,
            "welcome_message":"Hello, This is branch!",
            "~creation_source":"Dashboard",
            "~feature":"marketing",
            "~id":"230028495718236293",
            "+match_guaranteed":true,
            "+click_timestamp":1456081894,
            "+is_first_session":false,
            "+clicked_branch_link":true
    }
    */

    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    public void setWelcomeMessage(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }

    @Override
    public String toString() {
        return "BranchResponse{" +
                "welcomeMessage='" + welcomeMessage + '\'' +
                '}';
    }

}
