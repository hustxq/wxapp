package wxtools.demo.handler;

import com.soecode.wxtools.api.IService;
import com.soecode.wxtools.api.WxMessageHandler;
import com.soecode.wxtools.bean.WxXmlMessage;
import com.soecode.wxtools.bean.WxXmlOutMessage;
import com.soecode.wxtools.exception.WxErrorException;

import java.util.Map;

/**
 * Created by sse on 2017/7/5.
 */
public class WhoareyouHandler implements WxMessageHandler {
    @Override
    public WxXmlOutMessage handle(WxXmlMessage wxMessage, Map<String, Object> context, IService iService) throws WxErrorException {
        //必须以build()作为结尾，否则不生效。
        String msg = wxMessage.getContent();
        String result="你好";
        if (msg.equals("1")){
            result = "首页";
        }else if (msg.equals("2")){
            result = "联系我们";
        }
        WxXmlOutMessage xmlOutMsg = WxXmlOutMessage.TEXT().content(result).toUser(wxMessage.getFromUserName()).fromUser(wxMessage.getToUserName()).build();
        return xmlOutMsg;
    }
}
