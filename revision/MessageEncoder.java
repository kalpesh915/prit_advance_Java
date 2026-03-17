import com.fasterxml.jackson.ObjectMapper;
import jakarta.websocket.EncodeException;
import jakarta.websocket.Encoder;
import jakarta.websocket.EndpointConfig;

public class MessageEncoder implements Encoder.Text<ChatMessage>{
    private static ObjectMapper mapper = new ObjectMapper();
    
    @Override
    public String encode(ChatMessage message) throws EncodeException{
        try{
            return mapper.writeValueAsString(message);
        }catch(EncodeException e){
            throw new EncodeException(message, "Encodin Message", e);
        }
    }
    
    @Override
    public void init(EndpointConfig config){
        
    }
    
    @Override
    public void destroy(){
    }
}
