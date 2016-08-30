import org.json.JSONException;
import org.json.JSONObject;


public class JSONUtils {
	private static final String FLAG_SELF = "self", FLAG_NEW = "new",
            FLAG_MESSAGE = "message", FLAG_EXIT = "exit";
 
    public JSONUtils() {
    }
 
    /**
     * Json when client needs it's own session details
     * */
    public String getClientDetailsJson(String sessionId, String message) {
        String json = null;
 
        try {
            JSONObject jObj = new JSONObject();
            jObj.put("flag", FLAG_SELF);
            jObj.put("sessionId", sessionId);
            jObj.put("message", message);
 
            json = jObj.toString();
        } catch (JSONException e) {
            e.printStackTrace();
        }
 
        return json;
    }
 
    /**
     * Json to notify all the clients about new person joined
     * */
    public String getNewClientJson(String sessionId, String name,
            String message, int onlineCount) {
        String json = null;
 
        try {
            JSONObject jObj = new JSONObject();
            jObj.put("flag", FLAG_NEW);
            jObj.put("name", name);
            jObj.put("sessionId", sessionId);
            jObj.put("message", message);
            jObj.put("onlineCount", onlineCount);
 
            json = jObj.toString();
        } catch (JSONException e) {
            e.printStackTrace();
        }
 
        return json;
    }
 
    /**
     * Json when the client exits the socket connection
     * */
    public String getClientExitJson(String sessionId, String name,
            String message, int onlineCount) {
        String json = null;
 
        try {
            JSONObject jObj = new JSONObject();
            jObj.put("flag", FLAG_EXIT);
            jObj.put("name", name);
            jObj.put("sessionId", sessionId);
            jObj.put("message", message);
            jObj.put("onlineCount", onlineCount);
 
            json = jObj.toString();
        } catch (JSONException e) {
            e.printStackTrace();
        }
 
        return json;
    }
 
    /**
     * JSON when message needs to be sent to all the clients
     * */
    public String getSendAllMessageJson(String sessionId, String fromName,
            String message) {
        String json = null;
 
        try {
            JSONObject jObj = new JSONObject();
            jObj.put("flag", FLAG_MESSAGE);
            jObj.put("sessionId", sessionId);
            jObj.put("name", fromName);
            jObj.put("message", message);
 
            json = jObj.toString();
 
        } catch (JSONException e) {
            e.printStackTrace();
        }
 
        return json;
    }
    
    /**
     * 
     * @param message
     * @param fromId
     * @param fromName
     * @param toId
     * @param toName
     * @return
     */
    public String getSendOneJson(String message,String fromId,String fromName,String toId,String toName){
    	JSONObject json = new JSONObject();
    	System.out.println("---toname"+toName);
    	try {
			json.put("flag", "toOne");
			json.put("sessionId", fromId);
			json.put("name", fromName);
			json.put("message", message);
			json.put("toId", toId);
			json.put("toName", toName);
			return json.toString();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return "";
    	
    	
    }
}
