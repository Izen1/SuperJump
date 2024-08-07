package net.ledestudio.example.mod.key;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.neoforged.neoforge.common.util.Lazy;
import org.lwjgl.glfw.GLFW;

public class ChargeKeyMapping {

    public static final Lazy<KeyMapping> JUMP_CHARGE = Lazy.of(() -> new KeyMapping(
            "key.superjump.charge",
            InputConstants.Type.KEYSYM,
            GLFW.GLFW_KEY_Z,
            "key.categories.misc"
    ));
}
