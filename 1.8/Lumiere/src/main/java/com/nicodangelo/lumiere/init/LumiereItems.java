package main.java.com.nicodangelo.lumiere.init;

import main.java.com.nicodangelo.lumiere.reference.Reference;
import main.java.com.nicodangelo.lumiere.utility.LogHelper;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class LumiereItems
{
    public static Item bright_apple;

    public static void init()
    {
        bright_apple = new Item().setUnlocalizedName("bright_apple");
    }

    public static void register()
    {
        GameRegistry.registerItem(bright_apple, bright_apple.getUnlocalizedName().substring(5));
    }

    public static void registerRenders()
    {
        registerRender(bright_apple);
    }

    public static void registerRender(Item item)
    {
        LogHelper.info("hey dude : " + Reference.MOD_ID + ":"
                + item.getUnlocalizedName().substring(5));

        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().
                register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":"
                        + item.getUnlocalizedName().substring(5), "inventory"));

    }
}
