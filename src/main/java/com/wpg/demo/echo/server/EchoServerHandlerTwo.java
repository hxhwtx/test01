package com.wpg.demo.echo.server;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.CharsetUtil;

/**
 * @author dingsl
 * @description
 * @date 2020/12/25
 */
@ChannelHandler.Sharable
public class EchoServerHandlerTwo extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) {
        ByteBuf in = (ByteBuf) msg;
        // 打印接收到的信息
        System.out.println("接收到客户端信息2：" + in.toString(CharsetUtil.UTF_8));
        // 将接收的信息返回给发送者
        ctx.write("处理器2");
    }


}
