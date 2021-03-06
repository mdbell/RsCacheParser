package me.mdbell.jag.config.npc;

import me.mdbell.jag.config.Codec;
import me.mdbell.jag.config.DecodeContext;
import me.mdbell.jag.config.EncodeContext;
import me.mdbell.jag.util.Utils;

import java.nio.ByteBuffer;

/**
 * Created by matthew on 5/11/16.
 */
public class AnimationRotationCodec implements Codec<Integer> {
    @Override
    public Integer decode(DecodeContext<?, Integer> ctx, ByteBuffer source) {
        Npc n = (Npc) ctx.getTarget();
        n.walkAnimIndex = Utils.readUShort(source);
        n.turn180Index = Utils.readUShort(source);
        n.turn90CWAnimIndex = Utils.readUShort(source);
        n.turn90CCWAnimIndex = Utils.readUShort(source);
        return n.turn180Index;
    }

    @Override
    public void encode(EncodeContext<?, Integer> ctx, ByteBuffer target) {

    }
}
