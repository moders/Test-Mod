package main.java.com.nicodangelo.lumiere;

import main.java.com.nicodangelo.lumiere.init.LumiereItems;
import main.java.com.nicodangelo.lumiere.proxy.CommonProxy;
import main.java.com.nicodangelo.lumiere.reference.Reference;
import main.java.com.nicodangelo.lumiere.utility.LogHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION)
public class Lumiere
{
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    //These three events are a must have for the first class of the mod
    //Init stands for initialization

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        //calls our method we made in ConfigurationHandler and gets the file that is best for us
        LumiereItems.init();
        LumiereItems.register();

        LogHelper.info("Pre Initialization Complete!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.registerRenders();

        LogHelper.info("Initialization Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialization Complete!");
    }

}
