package wxtools.demo.handler;

import com.soecode.wxtools.api.IService;
import com.soecode.wxtools.api.WxMessageHandler;
import com.soecode.wxtools.bean.WxXmlMessage;
import com.soecode.wxtools.bean.WxXmlOutImageMessage;
import com.soecode.wxtools.bean.WxXmlOutMessage;
import com.soecode.wxtools.bean.WxXmlOutNewsMessage;
import com.soecode.wxtools.exception.WxErrorException;

import java.util.Map;

/**
 * Created by sse on 2017/7/5.
 */
public class ImgHandler implements WxMessageHandler {
    @Override
    public WxXmlOutMessage handle(WxXmlMessage wxMessage, Map<String, Object> context, IService iService) throws WxErrorException {
        String result = "图片信息，已接收";
//        WxXmlOutMessage.NEWS().addArticle(new WxXmlOutNewsMessage.Item().)
//        return WxXmlOutImageMessage.IMAGE().mediaId(wxMessage.getMediaId()).build();
        return WxXmlOutMessage.TEXT().content(result).toUser(wxMessage.getFromUserName()).fromUser(wxMessage.getToUserName()).build();
    }
}
