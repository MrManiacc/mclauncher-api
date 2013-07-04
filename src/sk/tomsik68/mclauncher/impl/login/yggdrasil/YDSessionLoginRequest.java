package sk.tomsik68.mclauncher.impl.login.yggdrasil;

import net.minidev.json.JSONObject;
import net.minidev.json.JSONStyle;
import sk.tomsik68.mclauncher.api.json.IJSONSerializable;

public class YDSessionLoginRequest implements IJSONSerializable {
    private final String sessionID, clientToken;

    public YDSessionLoginRequest(String sessid, String clientToken) {
        sessionID = sessid;
        this.clientToken = clientToken;
    }

    @Override
    public String toJSON() {
        JSONObject json = new JSONObject();
        json.put("clientToken", clientToken);
        json.put("accessToken", sessionID);
        json.put("selectedProfile", null);
        return json.toJSONString(JSONStyle.LT_COMPRESS);
    }

}
