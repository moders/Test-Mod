package main.java.com.nicodangelo.lumiere;

import main.java.com.nicodangelo.lumiere.reference.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION)
public class Lumiere
{
    @Mod.Instance(Reference.MOD_ID)
    public static Lumiere instance;

    //These three events are a must have for the first class of the mod
    //Init stands for initialization

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        //calls our method we made in ConfigurationHandler and gets the file that is best for us
    }
    public void init(FMLInitializationEvent event)
    {

    }
    public void postInit(FMLPostInitializationEvent event)
    {

    }

}
