package de.maxhenkel.betterrespawn;

import org.spongepowered.asm.mixin.Mixins;
import org.spongepowered.asm.mixin.connect.IMixinConnector;

public class MixinConnector implements IMixinConnector {

    @Override
    public void connect() {
        Mixins.addConfiguration("assets/%s/%s.mixins.json".formatted(BetterRespawnMod.MODID, BetterRespawnMod.MODID));
    }

}

