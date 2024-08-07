package net.ledestudio.example.mod.event;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;

import java.util.logging.Logger;

import static net.ledestudio.example.mod.SuperJump.MODID;
import static net.ledestudio.example.mod.key.ChargeKeyMapping.JUMP_CHARGE;

@EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class KeyBindingEvent {

    @SubscribeEvent
    public static void registerBindings(RegisterKeyMappingsEvent event) {
        event.register(JUMP_CHARGE.get());
        Logger.getLogger("KEY").info("Binding");
    }
}
