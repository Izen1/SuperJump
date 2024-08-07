package net.ledestudio.example.mod.client;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.ReferenceCountUtil;
import net.ledestudio.example.common.data.User;

import java.util.logging.Logger;

public class ClientInboundHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        Logger.getLogger("Network").info("Client Channel Active");
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        try {
            ByteBuf buf = (ByteBuf) msg;
            final int id = buf.readInt();
            if (id == 1) {
                User user = new User(buf);
                Logger.getLogger("Network").info(user.toString());
            }

        } finally {
            ReferenceCountUtil.refCnt(msg);
        }
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
    }
}
